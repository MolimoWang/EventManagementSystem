# View Venue Details Use Case

## Description
This use case allows an organizer to view the detailed information of a specific venue, such as the venue name, address, capacity, and contact information.

## Actors
- Organizer

## Triggers
- The organizer wants to see the details of a specific venue to assess its suitability for an event.

## Preconditions
- The organizer must be logged into the system.
- The venue must exist in the system.

## Postconditions
- The system displays the detailed information of the selected venue.

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "View Venue Details" option from the venue management menu.
2. The system retrieves the details of the selected venue.
3. The system displays the venue details, including:
   - Venue Name
   - Address
   - Capacity
   - Contact Information (name, phone, email)



### 02 - Alternate course of events

#### Venue Not Found
- If the selected venue does not exist, the system displays an error message and prompts the organizer to select a valid venue.

## Exceptions
- **System Error**: If a system error occurs while retrieving the venue details, the system displays an error message and prompts the organizer to try again later.

#### Related UI Prototypes
| View Venue Details Page |
| --- |
| ![View Venue Details](../../UI/organizer/view_venue_details.png) |