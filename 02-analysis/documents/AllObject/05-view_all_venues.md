# 05 View All Venues

## Basic Course of Events
### Course of events for **administrator**
- 1.The administrator selects 'View All Venues' from the main page(01-view_all_events.png).
- 2.The system retrieves and displays a list of all existing venues(04-view_all_venues.png).
### Sequence Diagram
![view all venues for administrator]{02-analysis/sequence-diagrams/AllObjects/05-view_all_venues_administrator.png}

### Course of events for **organizer**
- 1. The organizer selects the "Venues" option from the main page(17-view_all_events.png).
- 2. The system prompts the organizer to enter the desired date.
- 3. The system retrieves all available venues for the specified date.
- 4. The system displays the list of venues page(25-view_all_venues.png), including details such as venue name, address, capacity, and contact information.
### Sequence Diagram

## Alternate Course of Eventsorganizer
### No Venues Found
- The system shows that no venues exist in the system.
### Sequence Diagram

## UI Sketches
### Related UI Prototypes-- Administrator
![View All Venues](01-requirements/UI/admin/04-view_all_venues.png)
### Related UI Prototypes-- Organizer
![View All Venues](01-requirements/UI/organizer/25-view_all_venues.png) 
