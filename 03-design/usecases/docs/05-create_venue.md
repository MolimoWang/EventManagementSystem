# 05 Create Venue

## Basic Course of Events
- 1. The admin or organizer logs on and clicks 'venue' button to list current venuess
- 2. The organizer selects the "+" option to add a new venue.(25-list_my_venues.png) 
- 3. The system turn to create venue page(26-create_venue.png) which displays a form to enter venue details,including:
·Name
·Address
·Ticket Types(ticketTypeName, number)
·Contact information (name, phone, email)
- 4. The organizer fills in the required details and clicks "Submit".
- 5. The system updates the list of upcoming events and return to the list venues page (25-list_my_venues.png).


### Sequence Diagram

![Create Venue Page](/03-design/sequence-diagrams/Common/05-create_venue_basic.png)


### Duplicate Venue

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

## Data Outcome
- **Create** - The venue will be created.
- **Update** - The number of venues will be updated