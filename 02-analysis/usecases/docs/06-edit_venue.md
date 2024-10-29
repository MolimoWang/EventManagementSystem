# 06 Edit Venue

## Basic Course of Events
1. The organiser or administrator selects the edit venue functionality.
2. The system displays a form with the current venue details (27-edit_venue.png).
3. The organiser or administrator updates the information (Name, Address, Ticket Types(ticketTypeName, number),Contact information (name, phone, email)).
4. The organiser or administrator clicks "Save Changes" to confirm the modifications.
5. The system updates the list of upcoming events and return to the list venues page (25-list_my_venues.png).

### Sequence Diagram

![Edit Venue Page](/02-analysis/sequence-diagrams/Common/06-edit_venue.png)

![Edit Venue Page-alternative](/02-analysis/sequence-diagrams/Common/06-edit_venue_alternative.png)


## Alternate Course of Events

### Duplicate Venue
- The organiser or administrator selects the add venue functionality
- The system displays the add venue page (26-create_venue.png) page
- The organiser or administrator enters the details of the venue(Name, Address, Ticket Types(ticketTypeName, number),Contact information (name, phone, email))
- The displays an error message and prevents saving the duplicate entry(add_venue-duplicate.png).
- The organiser or administrator clicks OK
- The system returns to step 2 of the use case

### Sequence Diagram-- Alternate Course of Events

## UI Sketches
This is the page that the user must be on at the start to complete the use case
- The organizer is on my list venues page (25-list_my_venues.png).
- The administrator is on the all venues page (04-view_all_venues.png).
- 
### List Venue Page
![List Venue Page](/02-analysis/UI/organizer/25-list_my_venues.png)

### Create Venue Page
![View All Venues](/02-analysis/UI/admin/04-view_all_venues.png)

### Edit Venue Page
![Edit Venue Page](/02-analysis/UI/organizer/27-edit_venue.png)

### Create Venue Duplicate Page
![List Venue Page](/01-requirements/UI/organizer/Alternative/add_venue-duplicate.png)

