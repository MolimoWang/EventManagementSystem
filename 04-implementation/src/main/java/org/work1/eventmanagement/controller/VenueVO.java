package org.work1.eventmanagement.controller;


import lombok.Data;
import org.work1.eventmanagement.entity.Venue;

@Data
public class VenueVO extends Venue {
   private String dateStr;
}
