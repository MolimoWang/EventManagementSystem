package org.work1.eventmanagement.controller;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Data
@NoArgsConstructor
public class TicketAvailabilityDTO {

    private String type;
    private int numberAvailable;



    public TicketAvailabilityDTO(String type, int numberAvailable) {
        this.type = type;
        this.numberAvailable = numberAvailable;
    }
}
