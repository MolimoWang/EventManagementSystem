# View Venue Bookings Use Case

## Description
This use case allows an organizer to view the booking details for a specific venue, focusing on the events scheduled at that venue, including dates, times, and event names.

## Actors
- Organizer

## Triggers
- The organizer wants to see the booking details for a specific venue to check its availability or manage events.

## Preconditions
- The organizer is on create event page (19-create_event.png).

## Postconditions
- The system update the create event page (19-create_event.png) with the selected venue.
## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "Event Venue" option from the create event page (19-create_event.png).
2. The system displays list of all the venues available for booking for the time period which the organizer chosen in this page.
3. Organizer select one available venue from the list to be the venue which the events will use.

### 02 - Alternate course of events

#### Venue Not Found
- If the selected venue does not exist, the system displays an error message and prompts the organizer to select a valid venue.

## Exceptions
- **System Error**: If a system error occurs while retrieving the booking details, the system displays an error message and prompts the organizer to try again later.

#### Related UI Prototypes
| View Venue Bookings Page                                              |
|-----------------------------------------------------------------------|
| ![View Venue Bookings](../../UI/organizer/29-view_venue_bookings.png) |