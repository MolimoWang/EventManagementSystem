package org.work1.eventmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.work1.eventmanagement.entity.DinnerTable;
import org.work1.eventmanagement.entity.WalkIn;

import java.time.LocalDate;
import java.util.List;

public interface WalkInRepository extends JpaRepository<WalkIn, Long> {
    List<WalkIn> findAllByDate(LocalDate date);
    List<WalkIn> findAll();
    List<WalkIn> findAllByDateAndTable(LocalDate date, DinnerTable table);
    WalkIn findById(long id);
}
