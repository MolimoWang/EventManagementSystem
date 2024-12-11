package org.work1.eventmanagement.controller;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Data
@NoArgsConstructor
public class TicketDTO {

    private String type;
    private String eventName;
    private String eventId;
    private Double price;


    public TicketDTO(String type, String eventName, Double price, String eventId) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.type = type;
        this.price = price;
    }
}
