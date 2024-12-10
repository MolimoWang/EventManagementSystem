package org.work1.eventmanagement.controller;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.util.JSONPObject;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.work1.eventmanagement.entity.Venue;
import org.work1.eventmanagement.entity.VenueVO;
import org.work1.eventmanagement.service.VenueService;
import org.work1.eventmanagement.util.CommonUtil;

@Controller
@Slf4j
public class VenueSystem {

    public VenueService venueService;
    @Autowired
    public VenueSystem(VenueService v) {
        this.venueService = v;
    }

    private void fillModel(Model model){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Object role1 = request.getSession().getAttribute("role");
        // List page
        model.addAttribute("venues",  venueService.getVenues());
        model.addAttribute("venueForm", new Venue()); // Used for form binding
        model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
        model.addAttribute("role", role1);
    }

    /**
     * Query the list and redirect to the list page
     * @return
     */
    @GetMapping("/venue")
    public String listMyVenues(Model model) {
        try {
            fillModel(model);
            // Return Thymeleaf list page
            return "list_my_venues";
        } catch (Exception e) {
            model.addAttribute("error", "Error occurred: " + e.getMessage());
            return "errorPage"; // Display error page
        }
    }

    /**
     * Handle adding or editing venue
     */
    @PostMapping("/venue")
    public String createVenue(@ModelAttribute VenueDTO venueDTO, Model model) {
        try {
            // Log the parameters received from the frontend
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = servletRequestAttributes.getRequest();
            Object role1 = request.getSession().getAttribute("role");
            System.out.println("Data received: \n" + venueDTO.toString());
            // Assume you have a service method to handle the creation of the VenueDTO
            boolean isCreate = (venueDTO.getId() == null);
            venueService.createVenue(venueDTO);
            // Return to the home page list
            model.addAttribute("venueForm", new Venue()); // Used for form binding
            model.addAttribute("venues",  venueService.getVenues());
            model.addAttribute("role", role1);
            model.addAttribute("message", "Venue '" + venueDTO.getName() + "'" +
                    (isCreate ? " created successfully!" : " updated successfully!"));
        } catch (Exception e) {
            // Catch and handle exceptions to prevent 500 errors
            model.addAttribute("venueForm", new Venue()); // Used for form binding
            model.addAttribute("venues",  venueService.getVenues());
            model.addAttribute("error", "Create Failed! Reason: create venue: " + e.getMessage());
            e.printStackTrace(); // Print logs to help troubleshoot
        }
        // Redirect to the Thymeleaf list page
        return "list_my_venues";
    }

    // Fill the edit form
    @GetMapping("/venue/{id}")
    public String editVenue(@PathVariable Long id, Model model) {
        Venue venue = venueService.getVenue(id);
        model.addAttribute("venueForm", venue); // Fill the form
        model.addAttribute("venues",  venueService.getVenues()); // Page list
        return "list_my_venues"; // Return to the same page
    }

    // Get specific venue data and open the edit popup
    @GetMapping("/edit/{id}")
    @ResponseBody  // Return JSON data
    public VenueVO editVenue(@PathVariable("id") Long id) {
        // Get venue data by ID
        Venue venue = venueService.getVenue(id);
        VenueVO vo = new VenueVO();
        BeanUtils.copyProperties(venue, vo);
        Integer capacity = 0;
        if(CommonUtil.isNumeric(venue.getAvailableNumber1())) {
            capacity += NumberUtils.parseNumber(venue.getAvailableNumber1(), Integer.class);
        }
        if(CommonUtil.isNumeric(venue.getAvailableNumber2())) {
            capacity += NumberUtils.parseNumber(venue.getAvailableNumber2(), Integer.class);
        }
        vo.setTotalCapacity(capacity);
        return vo;  // Return venue data
    }

    // Delete a venue
    @GetMapping("/delete/{id}")
    public String deleteVenue(@PathVariable Long id, Model model) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Object role1 = request.getSession().getAttribute("role");

        if (!"ADMIN".equals(role1)){
            model.addAttribute("venueForm", new Venue()); // Used for form binding
            model.addAttribute("venues",  venueService.getVenues());
            model.addAttribute("message", "No authorization to execute this method");
            model.addAttribute("role", role1);
            return "list_my_venues";
        }

        Venue venue = venueService.deleteVenue(id);
        model.addAttribute("venueForm", new Venue()); // Used for form binding
        model.addAttribute("venues",  venueService.getVenues());
        model.addAttribute("message", "Venue '" + venue.getName() + "' deleted successfully!");
        model.addAttribute("role", role1);
        return "list_my_venues"; // Redirect back to the list page after deletion
    }
}