package org.work1.eventmanagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.work1.eventmanagement.entity.Venue;
import org.work1.eventmanagement.service.VenueService;

@Controller
@Slf4j
public class UserVenueController {

    public VenueService venueService;
    @Autowired
    public UserVenueController(VenueService v) {
        this.venueService = v;
    }

    private void fillModel(Model model){
        // List page
        model.addAttribute("venues",  venueService.getVenues());
        model.addAttribute("venueForm", new Venue()); // Used for form binding
        model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
    }


    @GetMapping("/userVenue")
    public String listMyVenues(Model model) {
        try {
            fillModel(model);
            // Return Thymeleaf list page
            return "user_venues.html";
        } catch (Exception e) {
            model.addAttribute("error", "Error occurred: " + e.getMessage());
            return "errorPage"; // Display error page
        }
    }

}
