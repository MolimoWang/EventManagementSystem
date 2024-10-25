# 06 Edit Venue

## Basic Course of Events
1. The organiser or administrator selects the edit venue functionality.
2. The system displays a form with the current venue details (27-edit_venue.png).
3. The organiser or administrator updates the information.
4. The organiser or administrator clicks "Save Changes" to confirm the modifications.
5. The system updates the list of upcoming events and return to the list venues page (25-list_my_venues.png).

### Sequence Diagram

## Alternate Course of Events
#### Incorrect Capacity
- The organiser or administrator selects the add venue functionality
- The system displays the add venue page (11-add-venue) page
- The organiser or administrator enters the details of the venue
- The system warns the organiser or administrator that the total capacity of the venue does not match the sum of the different types of tickets (Alternative/add_venue-capacity.png)
- The organiser or administrator clicks OK
- The system returns to step 2 of the use case

#### Duplicate Venue
- The organiser or administrator selects the add venue functionality
- The system displays the add venue page (11-add-venue) page
- The organiser or administrator enters the details of the venue
- The displays an error message and prevents saving the duplicate entry(add_venue-duplicate.png).
- The organiser or administrator clicks OK
- The system returns to step 2 of the use case

### Sequence Diagram-- Alternate Course of Events

## UI Sketches
This is the page that the user must be on at the start to complete the use case.