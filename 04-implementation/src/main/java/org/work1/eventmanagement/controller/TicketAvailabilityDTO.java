package org.work1.eventmanagement.controller;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Data
@NoArgsConstructor
public class TicketAvailabilityDTO {

    private String type; // 票的唯一标识
    private int numberAvailable; // 票的名称


    // 构造方法
    public TicketAvailabilityDTO(String type, int numberAvailable) {
        this.type = type;
        this.numberAvailable = numberAvailable;
    }
}
