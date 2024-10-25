# Use Case: Create Venue

## Description
This use case allows an organizer to add a new venue to the event management system. Organizers can provide details like the name, address, and capacity of the venue.

## Actors
- Administrator, Organizer

## Triggers
- The organizer or administrator wants to add a new venue to the system.

## Preconditions
- The organizer is on my list venues page (25-list_my_venues.png).
- The administrator is on the all venues page (04-view_all_venues.png).

## Postconditions
- The organizer is shown the updated list venues page (25-list_my_venues.png).
- The administrator is shown the all venues page (04-view_all_venues.png).

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organiser or administrator selects the add venue functionality.
2. The system turn to create venue page(26-create_venue.png) which displays a form to enter venue details,including:
   - Name
   - Address
   - Capacity
   - Contact information (name, phone, email)
3. The organizer fills in the required details and clicks "Submit".
4. The system updates the list of upcoming events and return to the list venues page (25-list_my_venues.png).






### 02 - Alternate course of events

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


## Exceptions
- **System Error**: If a system error occurs while saving the venue, the system displays an error message and prompts the organizer to try again later.


#### Related UI Prototypes
| Add Venue Form                                                       |
|----------------------------------------------------------------------|
| ![Add Venue](../../UI/organizer/26-create_venue.png)                 |
| Error: Duplicate Venue                                               |
| ![Add Venue](../../UI/organizer/Alternative/add_venue-duplicate.png) |

## Data Outcome
- **CREATE** - A new venue will be created and added to the system.
- **READ**  - The details of the newly created venue will be read and displayed.
