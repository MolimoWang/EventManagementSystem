# Use Case: Create Venue

## Description
This use case allows an organizer to add a new venue to the event management system. Organizers can provide details like the name, address, and capacity of the venue.

## Actors
- Organizer

## Triggers
- The organizer wants to add a new venue to the system.

## Preconditions
- The organizer is on list venues page (25-view_all_venues.png).

## Postconditions
- The organizer is shown the updated list venues page (25-view_all_venues.png).

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "+" option from the list venues page (25-view_all_venues.png).
2. The system turn to create venue page(26-create_venue.png) which displays a form to enter venue details(26-create_venue.png), including:
   - Name
   - Address
   - Capacity
   - Contact information (name, phone, email)
3. The organizer fills in the required details and clicks "Submit".
4. The system updates the list of upcoming events and return to the list venues page (25-view_all_venues.png).





### 02 - Alternate course of events

#### Missing Required Fields
- The organizer submits the form with missing required fields (e.g., venue name or capacity).
- The system highlights the missing fields and prompts the organizer to provide the necessary information.

#### Duplicate Venue
- The organizer submits the form for a venue that already exists with the same name and address.
- The system displays an error message and prevents saving the duplicate entry.

## Exceptions
- **System Error**: If a system error occurs while saving the venue, the system displays an error message and prompts the organizer to try again later.


#### Related UI Prototypes
| Add Venue Form                                             |
|------------------------------------------------------------|
| ![Add Venue](../../UI/organizer/26-create_venue.png)       |
| Error: Duplicate Venue                                     |
| ![Add Venue](../../UI/organizer/Alternative/add_venue.png) |

## Data Outcome
- **CREATE** - A new venue will be created and added to the system.
- **READ**  - The details of the newly created venue will be read and displayed.
