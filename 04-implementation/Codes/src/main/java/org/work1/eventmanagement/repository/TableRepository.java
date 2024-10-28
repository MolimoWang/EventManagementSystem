package org.work1.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.work1.eventmanagement.entity.DinnerTable;

import java.util.List;

public interface TableRepository extends JpaRepository<DinnerTable, Long> {
    DinnerTable findByNumber(int number);
    List<DinnerTable> findAll();
}
