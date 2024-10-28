package org.work1.eventmanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@MappedSuperclass
public abstract class BookingImp implements Booking {

    private boolean isOverfill;
    private int covers;
    private LocalDate date;
    private LocalTime time;
    @ManyToOne
    @JoinColumn(name = "table_id")
    private DinnerTable table;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="my_entity_seq_gen")
    @SequenceGenerator(name="my_entity_seq_gen", sequenceName="MY_ENTITY_SEQ")
    private long id;

    public BookingImp(int c, LocalDate d, LocalTime t, DinnerTable tab, boolean isOverfill) {
        covers = c;
        date = d;
        time = t;
        table = tab;
        this.isOverfill = isOverfill;
    }

    public BookingImp() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "covers")
    public int getCovers() {
        return covers;
    }

    public void setCovers(int c) {
        covers = c;
    }

    @Column(name = "date")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate d) {
        date = d;
    }

    @Transient
    public LocalTime getEndTime() {
        return time.plusHours(2);// End time defaults to 2 hours after time of booking
    }

    @Column(name = "time")
    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime t) {
        time = t;
    }


    public DinnerTable getTable() {
        return table;
    }

    public void setTable(DinnerTable t) {
        table = t;
    }

    @Transient
    public int getTableNumber() {
        return table.getNumber();
    }

    @Column(name = "overfill")
    public boolean isOverfill() {
        return isOverfill;
    }

    public void setOverfill(boolean isOverfill) {
        this.isOverfill = isOverfill;
    }

}

