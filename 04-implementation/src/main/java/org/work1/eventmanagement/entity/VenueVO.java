package org.work1.eventmanagement.entity;


import lombok.Data;

/**
 * VenueVO is separated from the database class.
 * It adds totalCapacity.
 * It is used to count the number of available tickets (ticketAvailable).
 */

@Data
public class VenueVO extends Venue {
   private Integer totalCapacity;
}
