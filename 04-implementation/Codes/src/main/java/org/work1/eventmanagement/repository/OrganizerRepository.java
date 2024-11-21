package org.work1.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.work1.eventmanagement.entity.Organizer;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
    Organizer findByUsername(String username);

    Organizer findByEmail(String email);
}
