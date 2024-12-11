package org.work1.eventmanagement.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.work1.eventmanagement.entity.Event;
import org.work1.eventmanagement.entity.Organizer;
import org.work1.eventmanagement.entity.Venue;
import org.work1.eventmanagement.repository.OrganizerRepository;
import org.work1.eventmanagement.repository.VenueRepository;
import org.work1.eventmanagement.service.EventService;

@Controller
@RequestMapping("/apis")
public class EventController {

    @Resource
    private  EventService eventService;

    @Resource
    private OrganizerRepository organizerRepository;

    @Resource
    private VenueRepository venueRepository;



    private void fillModel(Model model){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String role =(String) request.getSession().getAttribute("role");
        if (role.equals("ORGANIZER")){
            Organizer role1 = (Organizer)request.getSession().getAttribute("username");
            model.addAttribute("organisers",  organizerRepository.findByUsername(role1.getUsername()));
        }else {
            model.addAttribute("organisers",  organizerRepository.findAll());
        }

        model.addAttribute("venues",  venueRepository.findAll());
        model.addAttribute("events",  eventService.getAllEvents());
        model.addAttribute("eventForm", new Event());
        model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
    }


    @GetMapping("/events")
    public String getAllEvents(Model model) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Object role1 = request.getSession().getAttribute("role");
        model.addAttribute("role", role1);
        fillModel(model);
        return "list_my_events";
    }


    /**
     *  Processing of added or edited sites
     */
    @PostMapping("/event")
    public String createVenue(@ModelAttribute Event event, Model model) {
        try {
            // Log the parameters passed from the frontend
            System.out.println("Incoming data: \n" + event.toString());
            // Assuming you already have a service method to handle the creation of VenueDTO
            boolean isCreate = (event.getId() == null);
            if (isCreate) {
                eventService.createEvent(event);
            } else {
                eventService.updateEvent(event);
            }

            // Get the role from the session
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = servletRequestAttributes.getRequest();
            Object role1 = request.getSession().getAttribute("role");
            model.addAttribute("role", role1);

            // Return the home list page
            model.addAttribute("venues", venueRepository.findAll());
            model.addAttribute("organisers", organizerRepository.findAll());
            model.addAttribute("events", eventService.getAllEvents());
            model.addAttribute("eventForm", new Event()); // For form binding
            model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
            model.addAttribute("message", "Venue '" + event.getName() + "'" +
                    (isCreate ? " created successfully!" : " updated successfully!"));
        } catch (Exception e) {
            // Catch and handle exceptions to avoid a 500 error
            model.addAttribute("eventForm", new Venue()); // For form binding
            model.addAttribute("events", eventService.getAllEvents());
            model.addAttribute("error", "Create Failed! Reason : create venue: " + e.getMessage());
            e.printStackTrace(); // Log to help troubleshoot the issue
        }
        // Redirect to the Thymeleaf list page
        return "list_my_events";
    }


    @PostMapping("/updateTicket")
    public String updateTicket(@ModelAttribute Event event, Model model) {
        try {
            // Log the parameters passed from the frontend
            System.out.println("Incoming data: \n" + event.toString());
            // Assuming you already have a service method to handle the update of the ticket
            eventService.updateTicket(event);

            // Get the role from the session
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = servletRequestAttributes.getRequest();
            Object role1 = request.getSession().getAttribute("role");
            model.addAttribute("role", role1);

            // Return the home list page
            model.addAttribute("venues", venueRepository.findAll());
            model.addAttribute("organisers", organizerRepository.findAll());
            model.addAttribute("events", eventService.getAllEvents());
            model.addAttribute("eventForm", new Event()); // For form binding
            model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
            model.addAttribute("message", "Venue '" + event.getName() + "'" +
                    (" updated successfully!"));
        } catch (Exception e) {
            // Catch and handle exceptions to avoid a 500 error
            model.addAttribute("eventForm", new Venue()); // For form binding
            model.addAttribute("events", eventService.getAllEvents());
            model.addAttribute("error", "Create Failed! Reason : create venue: " + e.getMessage());
            e.printStackTrace(); // Log to help troubleshoot the issue
        }
        // Redirect to the Thymeleaf list page
        return "list_my_events";
    }


    // Fill the form for editing
    @GetMapping("/venue/{id}")
    public String editVenue(@PathVariable Long id, Model model) {
        Event event = eventService.getById(id);
        model.addAttribute("eventForm", event); // Fill the form with event data
        model.addAttribute("events", eventService.getAllEvents()); // Event list for the page
        model.addAttribute("venues", venueRepository.findAll());
        model.addAttribute("organisers", organizerRepository.findAll());
        model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
        return "list_my_events"; // Return to the same page
    }

    // Get the data for a specific venue and open the edit modal
    @GetMapping("/edit/{id}")
    @ResponseBody  // Return JSON data
    public Event editVenue(@PathVariable("id") Long id) {
        // Get venue data by ID
        Event event = eventService.getById(id);

        // Query ticket information
        if (event.getVenueId() != null) {
            // Logic for handling ticket data (if needed)
        }

        return eventService.getById(id);
    }

    // Delete the venue
    @GetMapping("/delete/{id}")
    public String deleteVenue(@PathVariable Long id, Model model) {
        // Get the role from the session
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Object role1 = request.getSession().getAttribute("role");

        // Check if the user has permission to delete
        if (!"ADMIN".equals(role1)) {
            fillModel(model);
            model.addAttribute("message", "No permission to execute this method");
            return "list_my_events";
        }

        Event event = eventService.deleteById(id);
        fillModel(model);
        model.addAttribute("message", "Event '" + event.getName() + "' deleted successfully!");

        return "list_my_events"; // Redirect back to the list page after deletion
    }

}