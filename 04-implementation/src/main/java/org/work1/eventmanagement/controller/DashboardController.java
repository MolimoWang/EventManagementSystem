package org.work1.eventmanagement.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.work1.eventmanagement.dto.AlterDTO;
import org.work1.eventmanagement.dto.ErrorMessageDTO;
import org.work1.eventmanagement.dto.ReservationDTO;
import org.work1.eventmanagement.dto.WalkInDTO;
import org.work1.eventmanagement.entity.Booking;
import org.work1.eventmanagement.entity.DinnerTable;
import org.work1.eventmanagement.service.RestaurantService;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping
@AllArgsConstructor
public class DashboardController {

    @GetMapping("/dashboard")
    public String adminDashboard(@RequestParam(name="date", required=false, defaultValue="") String date,
                                 @RequestParam(name="role", required=false, defaultValue="") String role, Model model,
                                 HttpServletRequest request) {
        Object role1 = request.getSession().getAttribute("role");

        LocalDate date1;
        try  {
            date1 = LocalDate.parse(date);

        } catch (Exception e) {
            date1 = LocalDate.now();
        }
        model.addAttribute("role",role1.equals("ADMIN")?"ADMIN":(role1.equals("ORGANIZER")?"ORGANIZER":"CUSTOMER") );
        fillModel(date1, model);
        return "dashboard";
    }

    private final RestaurantService restaurantService;
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
}
