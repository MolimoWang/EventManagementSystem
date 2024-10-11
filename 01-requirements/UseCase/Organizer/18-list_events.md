# List Event Use Case

## Description
This use case allows an organizer to view a list of events that they have created in the event management system.

## Actors
- Organizer

## Triggers
- The organizer wants to review the events they have scheduled.

## Preconditions
- The organizer must be logged into the system.
- The organizer has created at least one event.

## Postconditions
- The system displays a list of events created by the organizer.

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "List Events" option from the event management menu.
2. The system retrieves all events created by the organizer.
3. The system displays the list of events, including details such as event name, date, time, and venue.



### 02 - Alternate course of events

#### No Events Found
- If the organizer has not created any events, the system displays a message indicating that no events are available.

## Exceptions
- **System Error**: If a system error occurs while retrieving the events, the system displays an error message and prompts the organizer to try again later.

#### Related UI Prototypes
| List Events Page                                     |
|------------------------------------------------------|
| ![List Events](../../UI/organizer/18-list_event.png) |