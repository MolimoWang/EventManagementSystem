package org.work1.eventmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.work1.eventmanagement.entity.DinnerTable;
import org.work1.eventmanagement.repository.TableRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private TableRepository tableRepository;

    @Override
    public void run(String... args) throws Exception {
        if (tableRepository.count() == 0) {
            // if no table record, insert
            tableRepository.save(new DinnerTable(1, 4));
            tableRepository.save(new DinnerTable(2, 4));
            tableRepository.save(new DinnerTable(3, 4));
            tableRepository.save(new DinnerTable(4, 2));
            tableRepository.save(new DinnerTable(5, 2));
            tableRepository.save(new DinnerTable(6, 10));
            tableRepository.save(new DinnerTable(7, 10));
            tableRepository.save(new DinnerTable(8, 10));
            tableRepository.save(new DinnerTable(9, 6));
            tableRepository.save(new DinnerTable(10, 6));
            tableRepository.save(new DinnerTable(11, 6));
            tableRepository.save(new DinnerTable(12, 6));
        } else {
            System.out.println("Tables already exist in the database");
        }
    }
}
