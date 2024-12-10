package org.work1.eventmanagement.service;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.work1.eventmanagement.controller.VenueDTO;
import org.work1.eventmanagement.entity.Organizer;
import org.work1.eventmanagement.entity.Venue;
import org.work1.eventmanagement.exception.ServiceException;
import org.work1.eventmanagement.repository.OrganizerRepository;
import org.work1.eventmanagement.repository.VenueRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VenueService {

    @Autowired
    private final VenueRepository venueRepository;

    @Resource
    private final EventService eventService;
    @Resource
    private final TicketService ticketService;





    @Autowired
    public VenueService(VenueRepository venueRepository, EventService eventService,
                        TicketService ticketService) {
        this.venueRepository = venueRepository;
        this.eventService = eventService;
        this.ticketService = ticketService;
    }

    // get specific venue
    public Venue getVenue(Long venueId) {
        Optional<Venue> venue = venueRepository.findById(venueId);
        return venue.orElseThrow(() -> new IllegalArgumentException("Venue not found with ID: " + venueId));
    }

    // get all venue
    public List<Venue> getVenues() {
        try {
            // check database query
            return venueRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error fetching venues", e);
        }
    }


    // get venue of organizer
    public List<Venue> getMyVenues(Long organiserId) {
        return venueRepository.findAllByOrganiserId(organiserId);
    }

    @Transactional
    // create venue
    // VenueService.java
    public boolean createVenue(VenueDTO venueDTO) throws ServiceException {
        Venue venue = convert(venueDTO);

        //get organizer
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !(authentication.getPrincipal() instanceof Organizer)) {
            throw new ServiceException("No logged-in organiser found or invalid principal");
        }

        Organizer organiser = (Organizer) authentication.getPrincipal();
        venue.setOrganiser(organiser);

        if (venue.getOrganiser() == null) {
            throw new ServiceException("Organiser must not be null");
        }

        // save Organizer
        venueRepository.save(venue);

        return true;
    }

    private Venue convert(VenueDTO venueDTO) {
        String name = venueDTO.getName();
        String address = venueDTO.getAddress();
        String contactName = venueDTO.getContactName();
        String contactPhoneNumber = venueDTO.getContactPhoneNumber();
        String contactEmail = venueDTO.getContactEmail();
        String ticketTypeName1 = venueDTO.getTicketTypeName1();
        String ticketTypeName2 = venueDTO.getTicketTypeName2();

        String numberAvailable1 = venueDTO.getAvailableNumber1();
        String numberAvailable2 = venueDTO.getAvailableNumber2();

        Venue venue = new Venue();
        // basic
        venue.setId(venueDTO.getId());
        venue.setName(name);
        venue.setAddress(address);
        venue.setContactName(contactName);
        venue.setContactPhoneNumber(contactPhoneNumber);
        venue.setContactEmail(contactEmail);
        // ticket
        venue.setTicketTypeName1(ticketTypeName1);
        venue.setTicketTypeName2(ticketTypeName2);
        venue.setAvailableNumber1(numberAvailable1);
        venue.setAvailableNumber2(numberAvailable2);

        // Date
        venue.setDate(venueDTO.getDate());

        return venue;
    }

    // update venue
    public boolean updateVenue(Venue venue) {
        getVenue(venue.getId()); // check venue existence
        venueRepository.save(venue);
        return true;
    }

    // delete venue
    @Transactional(rollbackFor = Exception.class)
    public Venue deleteVenue(Long venueId) {
        if(venueId == null){
            throw new IllegalArgumentException("Venue ID cannot be null");
        }
        Venue venue = getVenue(venueId); // check if exist
        venueRepository.delete(venue);
        // delete event info
        eventService.deleteByVenueId(venueId);
        // delete ticket info
        ticketService.deleteByVenueId(venueId);

        return venue;
    }

    // save venue
    public boolean saveVenue(Venue venue) {
        venueRepository.save(venue);
        return true;
    }

    // check duplicate venue
    public void checkDuplicateVenue(Venue venue) {
        List<Venue> allVenues = venueRepository.findAll();
        boolean isDuplicate = allVenues.stream().anyMatch(existingVenue ->
                existingVenue.getName().equalsIgnoreCase(venue.getName()) &&
                        existingVenue.getAddress().equalsIgnoreCase(venue.getAddress())
        );
        if (isDuplicate) {
            throw new IllegalArgumentException("Duplicate venue found with name and address.");
        }
    }

    // get available venue
    public List<Venue> getAvailableVenues(Date date, Date time) {
        return venueRepository.findAllByDateTime(date, time);
    }
}
