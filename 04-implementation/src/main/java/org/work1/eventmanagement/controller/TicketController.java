package org.work1.eventmanagement.controller;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.work1.eventmanagement.entity.Event;
import org.work1.eventmanagement.entity.Organizer;
import org.work1.eventmanagement.entity.Ticket;
import org.work1.eventmanagement.repository.OrganizerRepository;
import org.work1.eventmanagement.repository.VenueRepository;
import org.work1.eventmanagement.service.EventService;
import org.work1.eventmanagement.service.TicketService;

@Controller
@RequestMapping("/apis")
public class TicketController {

    @Resource
    private  EventService eventService;


    @Resource
    private TicketService ticketService;
    @Resource
    private OrganizerRepository organizerRepository;

    @Resource
    private VenueRepository venueRepository;



    private void fillModel(Model model){
        // List page
        model.addAttribute("venues",  venueRepository.findAll());
        model.addAttribute("organisers",  organizerRepository.findAll());
        model.addAttribute("eventForm", new Event()); // Used for form binding
        model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
    }


    @GetMapping("/tickets")
    public String getAllTickets(@RequestParam(value = "type",required = false)String type,
                                Integer typeVal, Model model) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Object role1 = request.getSession().getAttribute("role");
        model.addAttribute("role", role1);
        if(typeVal != null && StringUtils.isBlank(type)) {
            if (typeVal == 1)  {
                type = "myOrg";
            }
            if (typeVal == 2)  {
                type = "my";
            }
            if (typeVal == 3)  {
                type = "admin";
            }

        }

        Integer inputType = 0;
        if ("myOrg".equals(type)){
            Organizer organizer = (Organizer)request.getSession().getAttribute("username");
            inputType = 1;
            model.addAttribute("events",  ticketService.getTicketsByOrgName(organizer.getUsername()));
        }
        if ("my".equals(type)){
            String username = (String)request.getSession().getAttribute("username");
            inputType = 2;
            model.addAttribute("events",  ticketService.getMyTickets(username));
        }
        if ("admin".equals(type)){
            String username = (String)request.getSession().getAttribute("username");
            inputType = 3;
            model.addAttribute("events",  ticketService.getAllTickets(username));
        }



        fillModel(model);
        model.addAttribute("type", inputType );
        return "list_my_tickets";
    }



    @GetMapping("/ticket/edit/{id}")
    @ResponseBody  // Return JSON data
    public Ticket editVenue(@PathVariable("id") Long id) {
        // Get venue data by ID
        return ticketService.getById(id);
    }



    @GetMapping("/orderTicket")
    public ResponseEntity<String> orderTicket(@RequestParam("eventId")String eventId, @RequestParam("ticketType")Integer ticketType, Model model) {
        // Assume you already have service methods to handle VenueDTO creation
        try{
            ticketService.orderTicket(eventId,ticketType);
        }catch (RuntimeException e){
            return ResponseEntity.ok(e.getMessage());
        }
        return ResponseEntity.ok("order success");
    }

    @DeleteMapping("/deleteTicket")
    public ResponseEntity<String> deleteTicket(@RequestParam("ticketId")Long ticketId) {
        ticketService.deleteById(ticketId);
        return ResponseEntity.ok("refund success");
    }




}
