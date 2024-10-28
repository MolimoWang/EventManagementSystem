package org.work1.eventmanagement.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Booking {
    long getId();

    int getCovers();

    LocalDate getDate();

    LocalTime getEndTime();

    LocalTime getTime();

    DinnerTable getTable();

    int getTableNumber();

    String getDetails();

    void setCovers(int c);

    void setDate(LocalDate d);

    void setTime(LocalTime t);

    void setTable(DinnerTable t);

    boolean isOverfill();

    void setOverfill(boolean overfill);
}

