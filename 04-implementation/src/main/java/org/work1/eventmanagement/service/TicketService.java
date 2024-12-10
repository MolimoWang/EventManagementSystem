package org.work1.eventmanagement.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.thymeleaf.util.StringUtils;
import org.work1.eventmanagement.entity.Customer;
import org.work1.eventmanagement.entity.Event;
import org.work1.eventmanagement.entity.Ticket;
import org.work1.eventmanagement.mapper.EventMapper;
import org.work1.eventmanagement.mapper.TicketMapper;
import org.work1.eventmanagement.repository.CustomerRepository;

import java.util.List;

@Service
public class TicketService extends BaseServiceImpl<TicketMapper, Ticket> {
    @Resource
    private TicketMapper ticketMapper;

    @Resource
    private EventMapper eventMapper;

    @Autowired
    private CustomerRepository customerRepository;


    public List<Ticket> getMyTickets(String username) {
        LambdaQueryWrapper<Ticket> wrapp = new LambdaQueryWrapper<>();
        wrapp.eq(Ticket::getCustomerName,username);
        return  ticketMapper.selectList(wrapp);
    }

    @Transactional
    public synchronized void orderTicket(String eventId, Integer ticketType) {
        //check remain
        Event event = eventMapper.selectById(eventId);

        if (ticketType == 1 && event.getRemainNum1()<1){
            throw new RuntimeException("no remain ticket to order");
        }

        if (ticketType == 2 && event.getRemainNum2()<1){
            throw new RuntimeException("no remain ticket to order");
        }

        Ticket ticket = new Ticket();
        BeanUtils.copyProperties(event,ticket);

        ticket.setEventId(eventId);
        ticket.setEventName(event.getName());

        ticket.setId(null);

        if (ticketType == 1){
            ticket.setTicketTypeName(event.getTicketTypeName1());
            ticket.setPrice(event.getPrice1());
        }

        if (ticketType == 2){
            ticket.setTicketTypeName(event.getTicketTypeName2());;
            ticket.setPrice(event.getPrice2());
        }

        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String username =(String) request.getSession().getAttribute("username");

        if (StringUtils.isEmpty(username)){
            throw new RuntimeException("please login in first");
        }

        Customer customer = customerRepository.findByUsername(username);
        ticket.setCustomerId(customer.getId()+"");
        ticket.setCustomerName(customer.getUsername());

        LambdaQueryWrapper<Ticket> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Ticket::getCustomerId,customer.getId());
        wrapper.eq(Ticket::getEventId,eventId);
        List<Ticket> tickets = ticketMapper.selectList(wrapper);
        if (!CollectionUtils.isEmpty(tickets)){
            throw new RuntimeException("you have ordered this event,not allow repeat order");
        }

        ticketMapper.insert(ticket);

        if (ticketType == 1){
            event.setRemainNum1(event.getRemainNum1()-1);
        }

        if (ticketType == 2){
            event.setRemainNum2(event.getRemainNum2()-1);
        }

        eventMapper.updateById(event);
    }

    public List<Ticket> getTicketsByOrgName(String username) {
        LambdaQueryWrapper<Ticket> wrapp = new LambdaQueryWrapper<>();
        wrapp.eq(Ticket::getOrganiser,username);
        return  ticketMapper.selectList(wrapp);
    }

    public List<Ticket> getAllTickets(String username) {
        LambdaQueryWrapper<Ticket> wrapp = new LambdaQueryWrapper<>();
        return  ticketMapper.selectList(wrapp);
    }


    /**
     * delete venue data
     * @param venueId
     */
    public void deleteByVenueId(Long venueId) {
        LambdaQueryWrapper<Ticket> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Ticket::getVenueId, venueId);
        ticketMapper.delete(wrapper);
    }

    /**
     * delete tickets
     * @param
     */
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(Long ticketId) {
        Ticket ticket = ticketMapper.selectById(ticketId);
        if(ticket == null) {
            System.out.printf("Ticket price query failed:" + ticketId);
            return;
        }
        ticketMapper.deleteById(ticketId);
        // 新增可用票据的数量
        int ticketType ;
        if(StringUtils.isEmpty(ticket.getTicketTypeName())) {
            ticketType = 1;
        } else {
            ticketType = ticket.getTicketTypeName().equals(ticket.getTicketTypeName1()) ? 1 : 2;
        }
        Event event = eventMapper.selectById(ticket.getEventId());
        if(event == null) {
            System.out.printf("Ticket price query failed:" + ticket.getEventId());
            return;
        }
        if(ticketType == 1) {
            event.setRemainNum1(event.getRemainNum1() + 1);
        } else {
            event.setRemainNum2(event.getRemainNum2() + 1);
        }
        eventMapper.updateById(event);
    }
}
