# Use Case: List Event

## Description
This use case allows an organizer to view a list of events that they have created in the event management system.

## Actors
- Organizer

## Triggers
- The organizer wants to review the events they have scheduled.

## Preconditions
The organizer is on their main page(17-view_all_events.png).

## Postconditions
- The system displays a list of events created by the organizer.

## Courses of Events

### 01 - Basic course of events

#### Course of Events
- The organizer click the 'My Events' on their main page(17-view_all_events.png).
- The system turn to list my events page (18-list_my_events.png) and displays the list of events, including details such as event name, date, time, and venue.



### 02 - Alternate course of events

#### No Events Found
- If the organizer has not created any events, the system displays a message indicating that no events are available.

## Exceptions
- **System Error**: If a system error occurs while retrieving the events, the system displays an error message and prompts the organizer to try again later.

#### Related UI Prototypes
| List Events Page                                     |
|------------------------------------------------------|
| ![List Events](../../UI/organizer/18-list_my_events.png) |

## Data Outcome
- **READ** - The details of all events will be read and displayed.
