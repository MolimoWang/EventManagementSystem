package org.work1.eventmanagement.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WalkInDTO {
    private String date;
    private String time;
    private long tableId;
    private int covers;
    private boolean overfill;
}
