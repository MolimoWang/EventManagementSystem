# Create Venue Use Case

## Description
This use case allows an organizer to add a new venue to the event management system. Organizers can provide details like the name, address, and capacity of the venue.

## Actors
- Organizer

## Triggers
- The organizer wants to add a new venue to the system to use for future events.

## Preconditions
- The organizer must be logged into the system.
- The organizer has appropriate privileges to add a new venue.

## Postconditions
None

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "Add Venue" option from the venue management menu.
2. The system displays a form to enter venue details, including:
   - Name
   - Address
   - Capacity
   - Contact information (name, phone, email)
3. The organizer fills in the required details and clicks "Save".
4. The system validates the input and checks for any missing required fields.
5. If validation passes, the system stores the new venue and displays a confirmation message.
6. The system updates the list of available venues.



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
| Add Venue Form |
| --- |
| ![Add Venue](../../UI/organizer/add_venue.png) |