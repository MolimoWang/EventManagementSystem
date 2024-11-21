package org.work1.eventmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.work1.eventmanagement.entity.Organizer;
import org.work1.eventmanagement.repository.OrganizerRepository;

import java.util.List;

@Service
public class OrganizerService {
    private final OrganizerRepository organizerRepository;

    @Autowired
    public OrganizerService(OrganizerRepository organizerRepository) {
        this.organizerRepository = organizerRepository;
    }

    public List<Organizer> getAllOrganizers() {
        return organizerRepository.findAll();
    }

    public Organizer getOrganizerByEmail(String email) {
        return organizerRepository.findByEmail(email);
    }
}
