# 05 Create Venue

## Basic Course of Events
1. The organiser or administrator selects the add venue functionality.
2. The system turn to create venue page(26-create_venue.png) which displays a form to enter venue details,including:
   - Name
   - Address
   - Ticket Types(ticketTypeName, number)
   - Contact information (name, phone, email)
3. The organizer fills in the required details and clicks "Submit".
4. The system updates the list of upcoming events and return to the list venues page (25-list_my_venues.png).


### Sequence Diagram


#### Duplicate Venue
- The organiser or administrator selects the add venue functionality
- The system displays the add venue page (26-create_venue.png) page
- The organiser or administrator enters the details of the venue(Name, Address, Ticket Types(ticketTypeName, number),Contact information (name, phone, email))
- The displays an error message and prevents saving the duplicate entry(add_venue-duplicate.png).
- The organiser or administrator clicks OK
- The system returns to step 2 of the use case

## Alternate Course of Events

### Sequence Diagram-- Alternate Course of Events

## UI Sketches
This is the page that the user must be on at the start to complete the use case
### Create Venue Page
![Create Venue Page](/02-analysis/UI/organizer/26-create_venue.png)
### List Venue Page
![List Venue Page](/02-analysis/UI/organizer/25-list_my_venues.png)

### Create Venue
 ![Add Venue](/02-analysis/UI/organizer/26-create_venue.png)                 
### Error: Duplicate Venue                                               
 ![Add Venue](/02-analysis/UI/organizer/Alternative/add_venue-duplicate.png)

