package org.work1.eventmanagement.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationDTO {
    private String name;
    private String number;
    private String date;
    private String time;
    private long tableId;
    private int covers;
    private boolean isOverfill;

    public boolean isOverfill() {
        return isOverfill;
    }
}