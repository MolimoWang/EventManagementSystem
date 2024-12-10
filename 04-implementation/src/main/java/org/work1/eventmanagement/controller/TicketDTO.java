package org.work1.eventmanagement.controller;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Data
@NoArgsConstructor
public class TicketDTO {

    private String type; // 票的唯一标识
    private String eventName; // 票的名称
    private String eventId; // 票的描述
    private Double price; // 票的价格

    // 构造方法
    public TicketDTO(String type, String eventName, Double price, String eventId) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.type = type;
        this.price = price;
    }
}
