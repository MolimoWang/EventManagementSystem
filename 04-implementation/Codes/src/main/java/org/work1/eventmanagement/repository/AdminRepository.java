package org.work1.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.work1.eventmanagement.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);

    Admin findByEmail(String email);
}
