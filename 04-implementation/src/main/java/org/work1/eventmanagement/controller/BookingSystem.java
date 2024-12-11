package org.work1.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.work1.eventmanagement.dto.AlterDTO;
import org.work1.eventmanagement.dto.ErrorMessageDTO;
import org.work1.eventmanagement.dto.ReservationDTO;
import org.work1.eventmanagement.dto.WalkInDTO;
import org.work1.eventmanagement.entity.Booking;
import org.work1.eventmanagement.entity.DinnerTable;
import org.work1.eventmanagement.service.RestaurantService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
public class BookingSystem {
    private final RestaurantService restaurantService;

    @Autowired
    public BookingSystem(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    private void fillModel(LocalDate date, Model model){
        List<Booking> bookings  = restaurantService.getBookings(date);
        List<DinnerTable> tables = restaurantService.getTables();
        model.addAttribute("date", date.toString());
        model.addAttribute("yesterday", date.minusDays(1));
        model.addAttribute("tomorrow", date.plusDays(1));
        model.addAttribute("bookings", bookings);
        model.addAttribute("tables", tables);
        model.addAttribute("reservationDTO", new ReservationDTO());
        model.addAttribute("walkInDTO", new WalkInDTO());
        model.addAttribute("alterDTO", new AlterDTO());
        model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
    }

    @GetMapping("/displaydate")
    public String displayDate(@RequestParam(name="date", required=false, defaultValue="") String date, Model model){
        LocalDate date1;
        try  {
            date1 = LocalDate.parse(date);

        } catch (Exception e) {
            date1 = LocalDate.now();
        }
        fillModel(date1, model);
        return "index";
    }

    @PostMapping("/reservation/")
    public String addReservation(@ModelAttribute ReservationDTO res, Model model) {
        LocalDate date = LocalDate.parse(res.getDate());
        LocalTime time = LocalTime.parse(res.getTime());
        DinnerTable t = restaurantService.getTable(res.getTableId());
        if(restaurantService.isOverFilled(t, res.getCovers()) && !res.isOverfill()) {
            String message = "The table you selected is can only accommodate %s places. Click Cancel to select another table or Confirm Overfill to create the reservation anyway.".formatted(t.getPlaces());
            ErrorMessageDTO overbookDetails = new ErrorMessageDTO(ErrorType.OVERBOOKED_RESERVATION, message);
            fillModel(date, model);

            model.addAttribute("reservationDTO", res);
            model.addAttribute("errorDTO", overbookDetails);
            return "reserror";
        } else if (restaurantService.isAlreadyBooked(t, date, time)) {
            String message = "The time and table you have selected clashes with another booking, please select another table";
            ErrorMessageDTO overbookDetails = new ErrorMessageDTO(ErrorType.DOUBLE_BOOKED_RESERVATION, message);
            fillModel(date, model);
            model.addAttribute("reservationDTO", res);
            model.addAttribute("errorDTO", overbookDetails);
            return "reserror";
        } else {
            restaurantService.addReservation(res.getName(),  date, time, t, res.getCovers(), res.isOverfill());
            fillModel(date, model);
            return "index";
        }

    }

    @PostMapping("/walkin/")
    public String addWalkIn(@ModelAttribute WalkInDTO wi, Model model) {
        LocalDate walkInDate = LocalDate.parse(wi.getDate());
        LocalTime walkInTime = LocalTime.parse(wi.getTime());
        DinnerTable t = restaurantService.getTable(wi.getTableId());
        int walkInCovers = wi.getCovers();
        boolean walkInoverfill = wi.isOverfill();

        if(restaurantService.isOverFilled(t, walkInCovers) && !walkInoverfill){
            String message = "The table you selected is can only accommodate %s places. Click Cancel to select another table or Confirm Overfill to create the booking anyway.".formatted(t.getPlaces());
            ErrorMessageDTO errorDetails = new ErrorMessageDTO(ErrorType.OVERBOOKED_WALK_IN, message);
            fillModel(walkInDate, model);
            model.addAttribute("walkInDTO", wi);
            model.addAttribute("errorDTO", errorDetails);
            return "walkerror";
        } else if (restaurantService.isAlreadyBooked(t, walkInDate, walkInTime)) {
            String message = "The time and table you have selected clashes with another booking, please select another table";
            ErrorMessageDTO errorDetails = new ErrorMessageDTO(ErrorType.DOUBLE_BOOKED_WALK_IN, message);
            fillModel(walkInDate, model);
            model.addAttribute("walkInDTO", wi);
            model.addAttribute("errorDTO", errorDetails);
            return "walkerror";
        } else {
            restaurantService.addWalkIn(walkInDate, walkInTime, t, walkInCovers, walkInoverfill);
            fillModel(walkInDate, model);
            return "index";
        }

    }

    @PostMapping("/change/")
    public String alterBooking(@ModelAttribute AlterDTO alterDTO, Model model) {
        LocalTime reservationTime = LocalTime.parse(alterDTO.getTime());
        LocalDate reservationDate = LocalDate.parse(alterDTO.getDate());
        boolean over = alterDTO.isOverfill();
        Booking b = restaurantService.getBookingById(alterDTO.getBookingId());
        DinnerTable table = restaurantService.getTable(alterDTO.getTableNumber());
        if(restaurantService.isOverFilled(table, b.getCovers()) && !over){
            String message = "The table you selected is can only accommodate %s places. Click Cancel to select another table or Confirm Overfill to create the booking anyway.".formatted(table.getPlaces());
            ErrorMessageDTO errorDetails = new ErrorMessageDTO(ErrorType.OVERBOOKED_ALTERATION, message);
            fillModel(reservationDate, model);
            model.addAttribute("errorDTO", errorDetails);
            model.addAttribute("alterDTO", alterDTO);
            return "altererror";
        } else if (restaurantService.isAlreadyBooked(table, reservationDate, reservationTime)) {
            String message = "The time and table you have selected clashes with another booking, please select another table";
            ErrorMessageDTO errorDetails = new ErrorMessageDTO(ErrorType.DOUBLE_BOOKED_ALTERATION, message);
            fillModel(reservationDate, model);
            model.addAttribute("errorDTO", errorDetails);
            model.addAttribute("alterDTO", alterDTO);
            return "altererror";
        } else {
            restaurantService.alterBooking(b, reservationDate, reservationTime, table, over);
            fillModel(reservationDate, model);
            return "index";
        }
    }

    @PostMapping("/delete/")
    public String deleteBooking(
            @RequestParam(name="deleteFormId") String id,
            Model model) {
        Booking b = restaurantService.getBookingById(Long.parseLong(id));
        LocalDate reservationDate = b.getDate();
        restaurantService.deleteBooking(b);
        fillModel(reservationDate, model);
        model.addAttribute("errorDTO", new ErrorMessageDTO());
        return "index";
    }
}
