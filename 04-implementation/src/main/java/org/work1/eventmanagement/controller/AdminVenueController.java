package org.work1.eventmanagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.*;
import org.work1.eventmanagement.entity.Venue;
import org.work1.eventmanagement.entity.VenueVO;
import org.work1.eventmanagement.service.VenueService;
import org.work1.eventmanagement.util.CommonUtil;

/**
 * Admin's Venue Controller
 */
@Controller
@Slf4j
public class AdminVenueController {

    public VenueService venueService;
    @Autowired
    public AdminVenueController(VenueService v) {
        this.venueService = v;
    }

    private void fillModel(Model model){
        // List page
        model.addAttribute("venues",  venueService.getVenues());
    }

    /**
     * Query the list and redirect to the list page
     * @return
     */
    @GetMapping("/adminVenue")
    public String listMyVenues(Model model) {
        try {
            fillModel(model);
            // Return Thymeleaf list page
            return "admin_venues";
        } catch (Exception e) {
            model.addAttribute("error", "Error occurred: " + e.getMessage());
            return "errorPage"; // Show error page
        }
    }

    // Delete venue
    @GetMapping("/admin/delete/{id}")
    public String deleteVenue(@PathVariable Long id, Model model) {
        Venue venue = venueService.deleteVenue(id);
        model.addAttribute("venues",  venueService.getVenues());
        model.addAttribute("message", "Venue '" + venue.getName() + "' Delete successfully!");
        return "admin_venues"; // Redirect back to list page after deletion
    }

}
