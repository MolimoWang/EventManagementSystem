package org.work1.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.work1.eventmanagement.entity.Venue;

import java.util.Date;
import java.util.List;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {

    // Find Venue by ID
    Venue findById(long id);

    // Find Venue by ID
    @Query("SELECT v FROM Venue v WHERE v.organiser.id = :organiserId")
    List<Venue> findAllByOrganiserId(@Param("organiserId") long organiserId);


    // Find all available Venues by date and time
    @Query("SELECT v FROM Venue v WHERE v.date = :date AND v.time = :time")
    List<Venue> findAllByDateTime(@Param("date") Date date, @Param("time") Date time);

    // Find all Venues
    @Query("SELECT v FROM Venue v")
    List<Venue> findAll();

    // Find Venues by Organiser email
    @Query("SELECT v FROM Venue v WHERE v.organiser.email = :email")
    List<Venue> findAllByEmail(@Param("email") String organiserEmail);

    // Save Venue
    @Override
    <S extends Venue> S save(S venue);

    // Delete Venue
    @Override
    void delete(Venue venue);
}
