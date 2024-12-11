package org.work1.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.work1.eventmanagement.entity.Booking;
import org.work1.eventmanagement.entity.DinnerTable;
import org.work1.eventmanagement.entity.Venue;
import org.work1.eventmanagement.service.RestaurantService;
import org.work1.eventmanagement.service.VenueService;

import java.time.LocalDate;
import java.util.List;


@Controller
@RequestMapping("/user")
public class CustomerController {
    private final RestaurantService restaurantService;
    public final VenueService venueService;

    @Autowired
    public CustomerController(RestaurantService restaurantService, VenueService venueService) {
        System.out.println("UserController has been created");
        this.restaurantService = restaurantService;
        this.venueService = venueService;
    }

    private void fillModel(LocalDate date, Model model){
        List<Booking> bookings  = restaurantService.getBookings(date);
        List<DinnerTable> tables = restaurantService.getTables();
        List<Venue> venues = venueService.getVenues();
        model.addAttribute("date", date.toString());
        model.addAttribute("yesterday", date.minusDays(1));
        model.addAttribute("tomorrow", date.plusDays(1));
        model.addAttribute("bookings", bookings);
        model.addAttribute("tables", tables);
        model.addAttribute("venues", venues);
        model.addAttribute("reservationDTO", new ReservationDTO());
        model.addAttribute("walkInDTO", new WalkInDTO());
        model.addAttribute("alterDTO", new AlterDTO());
        model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
    }

    @GetMapping("/dashboard")
    public String userDashboard(@RequestParam(name="date", required=false, defaultValue="") String date, Model model) {

        System.out.println("into /user/dashboard method");

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) {
            System.out.println("no current user");
            return "redirect:/login";
        }

        System.out.println("current user: " + authentication.getName());
        System.out.println("user INFO: " + authentication.getAuthorities());

        LocalDate date1;
        try  {
            date1 = LocalDate.parse(date);

        } catch (Exception e) {
            date1 = LocalDate.now();
        }
        fillModel(date1, model);
        return "user_dashboard";
    }
}
