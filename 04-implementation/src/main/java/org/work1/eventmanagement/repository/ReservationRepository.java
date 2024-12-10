package org.work1.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.work1.eventmanagement.entity.DinnerTable;
import org.work1.eventmanagement.entity.Reservation;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findAllByDate(LocalDate date);
    List<Reservation> findAll();
    List<Reservation> findAllByDateAndTable(LocalDate date, DinnerTable table);
    Reservation findById(long id);
}
