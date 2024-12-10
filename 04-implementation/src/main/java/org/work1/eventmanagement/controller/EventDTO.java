package org.work1.eventmanagement.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
    private Long id;
    private String name;
    private String description;
    private Date date;
    private Time time;
    private VenueDTO venue;
    private List<TicketQuantityDTO> ticketQuantities;
}
