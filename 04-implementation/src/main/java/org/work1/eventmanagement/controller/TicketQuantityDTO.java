package org.work1.eventmanagement.controller;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class TicketQuantityDTO {
    private Long id;

    private Long eventId;
}