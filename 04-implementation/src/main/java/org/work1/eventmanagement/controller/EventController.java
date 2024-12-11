package org.work1.eventmanagement.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.work1.eventmanagement.dto.ErrorMessageDTO;
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
        // 列表页面
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
     * 处理新增或编辑场地
     */
    @PostMapping("/event")
    public String createVenue(@ModelAttribute Event event, Model model) {
        try {
            // 打印前端传入参数的日志
            System.out.println("传入数据: \n" + event.toString());
            // 假设您已经有服务方法来处理 VenueDTO 的创建
            boolean isCreate = (event.getId() == null);
            if (isCreate){
                eventService.createEvent(event);
            }else {
                eventService.updateEvent(event);
            }
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = servletRequestAttributes.getRequest();
            Object role1 = request.getSession().getAttribute("role");
            model.addAttribute("role", role1);
            // 返回首页列表
            model.addAttribute("venues",  venueRepository.findAll());
            model.addAttribute("organisers",  organizerRepository.findAll());
            model.addAttribute("events",  eventService.getAllEvents());
            model.addAttribute("eventForm", new Event()); // 用于表单绑定
            model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
            model.addAttribute("message", "Venue '" + event.getName() + "'" +
                    (isCreate ? " created successfully!" : " update successfully!"));
        } catch (Exception e) {
            // 捕获并处理异常，避免发生 500 错误
            model.addAttribute("eventForm", new Venue()); // 用于表单绑定
            model.addAttribute("events",  eventService.getAllEvents());
            model.addAttribute("error", "Create Failed! Reason : create venue: " + e.getMessage());
            e.printStackTrace(); // 打印日志来帮助排查问题
        }
        // 重定向到 Thymeleaf 列表页面
        return "list_my_events";
    }


    @PostMapping("/updateTicket")
    public String updateTicket(@ModelAttribute Event event, Model model) {
        try {
            // 打印前端传入参数的日志
            System.out.println("传入数据: \n" + event.toString());
            // 假设您已经有服务方法来处理 VenueDTO 的创建
           eventService.updateTicket(event);
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = servletRequestAttributes.getRequest();
            Object role1 = request.getSession().getAttribute("role");
            model.addAttribute("role", role1);

            // 返回首页列表
            model.addAttribute("venues",  venueRepository.findAll());
            model.addAttribute("organisers",  organizerRepository.findAll());
            model.addAttribute("events",  eventService.getAllEvents());
            model.addAttribute("eventForm", new Event()); // 用于表单绑定
            model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
            model.addAttribute("message", "Venue '" + event.getName() + "'" +
                    (" update successfully!"));
        } catch (Exception e) {
            // 捕获并处理异常，避免发生 500 错误
            model.addAttribute("eventForm", new Venue()); // 用于表单绑定
            model.addAttribute("events",  eventService.getAllEvents());
            model.addAttribute("error", "Create Failed! Reason : create venue: " + e.getMessage());
            e.printStackTrace(); // 打印日志来帮助排查问题
        }
        // 重定向到 Thymeleaf 列表页面
        return "list_my_events";
    }

    // 编辑表单填充
    @GetMapping("/venue/{id}")
    public String editVenue(@PathVariable Long id, Model model) {
        Event event = eventService.getById(id);
        model.addAttribute("eventForm", event); // 填充表单
        model.addAttribute("events",  eventService.getAllEvents()); // 页面列表
        model.addAttribute("venues",  venueRepository.findAll());
        model.addAttribute("organisers",  organizerRepository.findAll());
        model.addAttribute("errorDTO", new ErrorMessageDTO(ErrorType.NONE, ""));
        return "list_my_events"; // 返回同一个页面
    }

    // 获取特定 venue 的数据并打开编辑弹窗
    @GetMapping("/edit/{id}")
    @ResponseBody  // 返回 JSON 数据
    public Event editVenue(@PathVariable("id") Long id) {
        // 根据 ID 获取 venue 数据
        Event event = eventService.getById(id);

        //查询票据信息
        if (event.getVenueId()!=null){

        }

        return eventService.getById(id);
    }

    // 删除场地
    @GetMapping("/delete/{id}")
    public String deleteVenue(@PathVariable Long id, Model model) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Object role1 = request.getSession().getAttribute("role");

        if (!"ADMIN".equals(role1)){
            fillModel(model);
            model.addAttribute("message", "no auth to exec this method");
            return "list_my_events";
        }

        Event event = eventService.deleteById(id);
        fillModel(model);
        model.addAttribute("message", "event '" + event.getName() + "' Delete successfully!");

        return "list_my_events"; // 删除后重定向回列表页面
    }
}