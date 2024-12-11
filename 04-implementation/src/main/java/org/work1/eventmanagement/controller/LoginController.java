package org.work1.eventmanagement.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.work1.eventmanagement.entity.Event;
import org.work1.eventmanagement.entity.Venue;
import org.work1.eventmanagement.mapper.EventMapper;
import org.work1.eventmanagement.repository.VenueRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.work1.eventmanagement.util.CommonUtil.convertTimeToScale;

@Controller
public class LoginController {

    @Resource
    private VenueRepository venueRepository;


    @Resource
    private EventMapper eventMapper;

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping(value = "/getOverView")
    public ResponseEntity<List<Venue>> getOverView( HttpServletRequest request, @RequestParam(value = "date", required = false) String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (date == null) {
            date = sdf.format(new Date());
        }

        List<Venue> allVenues = venueRepository.findAll();

        if (CollectionUtils.isEmpty(allVenues)) {
            return ResponseEntity.ok(new ArrayList<>());

        }

        LambdaQueryWrapper<Event> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Event::getDate, date);


        List<Event> events = eventMapper.selectList(wrapper);
        if (CollectionUtils.isEmpty(events)) {
            return ResponseEntity.ok(new ArrayList<>());
        }

        Map<String, List<Event>> eventVenueMap = events.stream().collect(Collectors.groupingBy(Event::getVenueId));


        List<Venue> venues = allVenues.stream().filter(o -> eventVenueMap.containsKey(o.getId() + "")).toList();


        for (Venue venue : venues) {

            List<Event> events1 = eventVenueMap.get(venue.getId() + "");

            for (Event event : events1) {
                String time = event.getTime();

                int scale = convertTimeToScale(time);
                event.setScale(scale);
            }
            venue.setEventList(events1);
        }
        return ResponseEntity.ok(venues);

    }

    @GetMapping(value = "/home")
    public String home(Model m, HttpServletRequest request,@RequestParam(value = "date", required = false) String date) {
        Object role1 = request.getSession().getAttribute("role");
        m.addAttribute("role",role1);
        m.addAttribute("times", Stream.of("", "0:00", "2:00", "4:00"
                , "6:00", "8:00", "10:00", "12:00"
                , "14:00", "16:00", "18:00", "20:00"
                , "22:00", "0:00"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (date == null) {
            date = sdf.format(new Date());
        }
        m.addAttribute("date",date);

        List<Venue> allVenues = venueRepository.findAll();

        if (CollectionUtils.isEmpty(allVenues)) {
            m.addAttribute("venues",new ArrayList<>());
            m.addAttribute("noData",true);
            return "homepage";

        }

        LambdaQueryWrapper<Event> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Event::getDate, date);


        List<Event> events = eventMapper.selectList(wrapper);
        if (CollectionUtils.isEmpty(events)) {
            m.addAttribute("venues",new ArrayList<>());
            m.addAttribute("noData",true);
            return "homepage";
        }

        Map<String, List<Event>> eventVenueMap = events.stream().collect(Collectors.groupingBy(Event::getVenueId));


        List<Venue> venues = allVenues.stream().filter(o -> eventVenueMap.containsKey(o.getId() + "")).toList();


        for (Venue venue : venues) {

            List<Event> events1 = eventVenueMap.get(venue.getId() + "");

            for (Event event : events1) {
                String time = event.getTime();

                int scale = convertTimeToScale(time);
                event.setScale(scale);
            }
            venue.setEventList(events1);
        }
        m.addAttribute("venues",venues);
        m.addAttribute("noData",false);

        return "homepage";
    }
}
