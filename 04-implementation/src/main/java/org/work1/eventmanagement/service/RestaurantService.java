package org.work1.eventmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.work1.eventmanagement.entity.Booking;
import org.work1.eventmanagement.entity.Customer;
import org.work1.eventmanagement.entity.DinnerTable;
import org.work1.eventmanagement.entity.Reservation;
import org.work1.eventmanagement.entity.WalkIn;
import org.work1.eventmanagement.repository.CustomerRepository;
import org.work1.eventmanagement.repository.ReservationRepository;
import org.work1.eventmanagement.repository.TableRepository;
import org.work1.eventmanagement.repository.WalkInRepository;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {
    private final CustomerRepository customers;
    private final ReservationRepository reservations;
    private final TableRepository tables;
    private final WalkInRepository walkIns;

    @Autowired
    public RestaurantService(CustomerRepository c, ReservationRepository r, TableRepository t, WalkInRepository w) {
        customers = c;
        reservations = r;
        tables = t;
        walkIns = w;
    }

    public List<Booking> getBookings(LocalDate date) {
        List<Booking> bookings = new ArrayList<>();
        bookings.addAll(reservations.findAllByDate(date));
        bookings.addAll(walkIns.findAllByDate(date));
        return bookings;
    }

    public List<Booking> getBookingsForTable(LocalDate date, DinnerTable table) {
        List<Booking> bookings = new ArrayList<>();
        bookings.addAll(reservations.findAllByDateAndTable(date, table));
        bookings.addAll(walkIns.findAllByDateAndTable(date, table));
        return bookings;
    }

    public void addReservation(String customerName,  LocalDate date, LocalTime time, DinnerTable table, int covers, boolean overfill) {
        Customer customer = getCustomer(customerName);
//        Table table = tables.findByNumber(tableNumber);
        if (table == null) {
            throw new RuntimeException("Table does not exist");
        }
        Reservation reservation = new Reservation(customer, table, date, time, covers, overfill);
        reservations.save(reservation);
    }

    public void addWalkIn(LocalDate date, LocalTime time, DinnerTable table, int covers, boolean overfill) {
        if (table == null) {
            throw new RuntimeException("Table does not exist");
        }
        WalkIn booking = new WalkIn(date, time, table, covers, overfill);
        walkIns.save(booking);
    }

    public boolean isOverFilled(DinnerTable table, int covers) {
        if (table == null) {
            throw new RuntimeException("Table does not exist");
        }
        return table.getPlaces() < covers;
    }

    public boolean isAlreadyBooked(DinnerTable table, LocalDate date, LocalTime time) {
        List<Booking> bookings = getBookingsForTable(date, table);
        for (Booking booking : bookings) {
            Duration duration = Duration.between(booking.getTime(), time);
            long minutes = Math.abs(duration.toMinutes());
            if (minutes < 120) {
                return true;
            }
        }
        return false;
    }

    public List<DinnerTable> getTables() {
        return tables.findAll();
    }

    public Booking getBookingById(Long id) {
        Optional<? extends Booking> booking = reservations.findById(id);
        if (booking.isEmpty()) {
            booking = walkIns.findById(id);
            if (booking.isPresent()) {
                return booking.get();
            }
        } else {
            return booking.get();
        }
        return null;
    }

    public void alterBooking(Booking b, LocalDate reservationDate, LocalTime reservationTime, DinnerTable table, boolean overfill) {
        if (table == null) {
            throw new RuntimeException("Table does not exist");
        }
        b.setDate(reservationDate);
        b.setTime(reservationTime);
        b.setTable(table);
        b.setOverfill(overfill);
        if (b instanceof Reservation r) {
            reservations.save(r);
        } else if (b instanceof WalkIn w) {
            walkIns.save(w);
        }
    }

    public void deleteBooking(Booking b) {
        if (b instanceof Reservation r) {
            reservations.delete(r);
        } else if (b instanceof WalkIn w) {
            walkIns.delete(w);
        }
    }

    public DinnerTable getTable(long tableId) {
        return tables.findById(tableId).orElse(null);
    }

    public DinnerTable getTable(int tableNumber) {
        return tables.findByNumber(tableNumber);
    }

    private Customer getCustomer(String customerName) {
        Customer customer = customers.findByUsername(customerName);
        if (customer == null) {
            customer = new Customer();
            customer.setUsername(customerName);
            customers.save(customer);
        }
        return customer;
    }


}

