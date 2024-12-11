package org.work1.eventmanagement.dto;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class TicketQuantityDTO {
    private Long id;
    // 其他属性
    private Long eventId; // 假设需要映射 event 的 ID
}