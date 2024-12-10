package org.work1.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.work1.eventmanagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByUsername(String username);

    Customer findByEmail(String email);
    boolean existsByUsername(String username);
}
