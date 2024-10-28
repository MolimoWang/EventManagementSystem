package org.work1.eventmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class WalkIn extends BookingImp {
    public WalkIn(LocalDate date, LocalTime time, DinnerTable table, int covers, boolean overfill) {
        super(covers, date, time, table, overfill);
    }

    public WalkIn() {
    }

    @Override
    @Transient
    public String getDetails() {
        return "Covers: " + getCovers();
    }
}