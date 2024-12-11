package org.work1.eventmanagement.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.thymeleaf.util.StringUtils;
import org.work1.eventmanagement.entity.Event;
import org.work1.eventmanagement.entity.Organizer;
import org.work1.eventmanagement.entity.Ticket;
import org.work1.eventmanagement.entity.Venue;
import org.work1.eventmanagement.mapper.EventMapper;
import org.work1.eventmanagement.mapper.TicketMapper;
import org.work1.eventmanagement.repository.OrganizerRepository;
import org.work1.eventmanagement.repository.VenueRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EventService  extends BaseServiceImpl<EventMapper, Event> {

    @Resource
    private OrganizerRepository organizerRepository;

    @Resource
    private VenueRepository venueRepository;

    @Autowired
    private  EventMapper eventMapper;

    @Autowired
    private TicketMapper ticketMapper;




    public List<Event> getAllEvents() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Object role1 = request.getSession().getAttribute("role");
        LambdaQueryWrapper<Event> wrapper = new LambdaQueryWrapper<>();
        if (role1.equals("ORGANIZER")){
            Organizer organizer = (Organizer)request.getSession().getAttribute("username");
            wrapper.eq(Event::getOrganiser,organizer.getUsername());
        }

        return eventMapper.selectList(wrapper);
    }



    public void createEvent(Event event) {
        Venue venue = new Venue();
        if (event.getVenueId() != null){
             venue = venueRepository.findById(Long.parseLong(event.getVenueId()));
            String name = venue.getName();
            event.setVenue(name);

            String availableNumber1 = venue.getAvailableNumber1();
            String ticketTypeName1 = venue.getTicketTypeName1();
            String availableNumber2 = venue.getAvailableNumber2();
            String ticketTypeName2 = venue.getTicketTypeName2();

            if (!StringUtils.isEmpty(ticketTypeName1) && !StringUtils.isEmpty(availableNumber1) && !"0".equals(availableNumber1)){
                event.setT1Exist(1);
            }

            if (!StringUtils.isEmpty(ticketTypeName2) && !StringUtils.isEmpty(availableNumber2) && !"0".equals(availableNumber2)){
                event.setT2Exist(1);
            }

            event.setAvailableNumber1(availableNumber1);
            event.setAvailableNumber2(availableNumber2);
            event.setTicketTypeName1(ticketTypeName1);
            event.setTicketTypeName2(ticketTypeName2);
        }

        Optional<Organizer> organizer = Optional.of(new Organizer());
        if (event.getOrganizerId()!=null){
            organizer = organizerRepository.findById(Long.parseLong(event.getOrganizerId()));
        }


        if (organizer.isPresent()){
            Organizer organizer1 = organizer.get();
            String username = organizer1.getUsername();
            event.setOrganiser(username);
        }
        eventMapper.insert(event);
    }

    public Event getById(Long id) {
        return eventMapper.selectById(id);
    }

    public Event deleteById(Long id) {
        Event event = eventMapper.selectById(id);
        int i = eventMapper.deleteById(id);
        // delete related tickets
        LambdaQueryWrapper<Ticket> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Ticket::getEventId, id);
        ticketMapper.delete(wrapper);
        return event;
    }

    public void updateEvent(Event event) {
        String organizerId = event.getOrganizerId();
        if (!StringUtils.isEmpty(organizerId)){
            Optional<Organizer> organizer = organizerRepository.findById(Long.parseLong(event.getOrganizerId()));
            if (organizer.isPresent()){
                Organizer organizer1 = organizer.get();
                String username = organizer1.getUsername();
                event.setOrganiser(username);
            }
        }

        Venue venue = new Venue();
        if (event.getVenueId()!=null){
            venue = venueRepository.findById(Long.parseLong(event.getVenueId()));
            String name = venue.getName();
            event.setVenue(name);

            //set ticket information
            String availableNumber1 = venue.getAvailableNumber1();
            String ticketTypeName1 = venue.getTicketTypeName1();
            String availableNumber2 = venue.getAvailableNumber2();
            String ticketTypeName2 = venue.getTicketTypeName2();

            if (!StringUtils.isEmpty(ticketTypeName1) && !StringUtils.isEmpty(availableNumber1) && !"0".equals(availableNumber1)){
                event.setT1Exist(1);
            }

            if (!StringUtils.isEmpty(ticketTypeName2) && !StringUtils.isEmpty(availableNumber2) && !"0".equals(availableNumber2)){
                event.setT2Exist(1);
            }

            event.setAvailableNumber1(availableNumber1);
            event.setAvailableNumber2(availableNumber2);
            event.setTicketTypeName1(ticketTypeName1);
            event.setTicketTypeName2(ticketTypeName2);
        }


        eventMapper.updateById(event);

    }

    public void updateTicket(Event event) {
        LambdaUpdateWrapper<Event> wrapper = new LambdaUpdateWrapper<>();
        wrapper.eq(Event::getId,event.getId());
        wrapper.set(Event::getPrice1,event.getPrice1());
        wrapper.set(Event::getPrice2,event.getPrice2());

        wrapper.set(Event::getRemainNum1,event.getAvailableNumber1());
        wrapper.set(Event::getRemainNum2,event.getAvailableNumber2());
        int update = eventMapper.update(wrapper);
    }

    /**
     * delete venue data
     * @param venueId
     */
    public void deleteByVenueId(Long venueId) {
        LambdaQueryWrapper<Event> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Event::getVenueId,venueId);
        eventMapper.delete(wrapper);
    }
}
