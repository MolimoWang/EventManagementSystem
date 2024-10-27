# 25 View Venue Bookings

## Basic Course of Events
1. The organizer selects the "Event Venue" option from the create event page (19-create_event.png).
2. The system displays list of all the venues available for booking for the time period which the organizer chosen in this page.
3. Organizer select one available venue from the list to be the venue which the events will use.

### Sequence Diagram
![View Venues Bookings](/02-analysis/sequence-diagrams/Organizer/25-view_venue_bookings.png)

## Alternate Course of Events
### Venue Not Found
- If the selected venue does not exist, the system displays an error message and prompts the organizer to select a valid venue.

### Sequence Diagram-- Alternate Course of Events
- None

## UI Sketches
This is the page that the user must be on at the start to complete the use case.
### Main Page
![Main Page](/02-analysis/UI/organizer/19-create_event.png)

### View Venue Bookings
![View Venue Bookings](/02-analysis/UI/organizer/29-view_venue_bookings.png)
