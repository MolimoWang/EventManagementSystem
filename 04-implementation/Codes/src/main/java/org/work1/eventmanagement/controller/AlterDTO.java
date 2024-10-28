package org.work1.eventmanagement.controller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlterDTO {
    private String date;
    private String time;
    private int tableNumber;
    private long bookingId;
    private boolean overfill;
}
