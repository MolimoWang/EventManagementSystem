package org.work1.eventmanagement.dto;

import org.springframework.format.annotation.DateTimeFormat;


import java.sql.Time;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VenueDTO {
    // Properties
    private Long id;
    private String name;
    private String address;
    private String contactName;
    private String contactPhoneNumber;
    private String contactEmail;
    private String ticketTypeName1;
    private String ticketTypeName2;
    private String availableNumber1;
    private String availableNumber2;

    private boolean overfill;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private Time time;
}
