package org.work1.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.work1.eventmanagement.entity.Organizer;
@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
    Organizer findByUsername(String username);

    Organizer findByEmail(String email);

    boolean existsByUsername(String username);
}
