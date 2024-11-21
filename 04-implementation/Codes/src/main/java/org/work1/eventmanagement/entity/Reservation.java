package org.work1.eventmanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Reservation extends BookingImp {
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Reservation(Customer customer, DinnerTable table, LocalDate date, LocalTime time, int covers, boolean overfill) {
        super(covers, date, time, table, overfill);
        this.customer = customer;
    }

    public Reservation() {

    }



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Transient
    public String getDetails() {
        String details = customer.getUsername() +
                " " +
                customer.getPhoneNumber() +
                " (" +
                getCovers() +
                ")";
        return details;
    }

}

