# Change Event Venue Use Case

## Description
This use case allows an organizer to change the venue of an existing event in the event management system, ensuring that the new venue is available on the event's date and time.

## Actors
- Organizer

## Triggers
- The organizer wants to move an event to a different venue due to availability issues or other reasons.

## Preconditions
- The organizer must be logged into the system.
- The organizer has appropriate privileges to modify the event.
- The event must already exist in the system.
- There must be at least one other available venue in the system.

## Postconditions
- The event's venue is updated in the system.
- Notifications are optionally sent to users who have purchased tickets to inform them of the change.

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "Change Venue" option from the event management menu.
2. The system displays a list of events that the organizer can modify.
3. The organizer selects the event they want to change the venue for.
4. The system displays the current event details, including the current venue.
5. The organizer selects a new venue from the list of available venues.
6. The system checks if the new venue is available for the event's date and time.
7. If the venue is available, the organizer confirms the change.
8. The system updates the event with the new venue and displays a confirmation message.



### 02 - Alternate course of events

#### Venue Unavailable
- If the selected venue is not available for the chosen date and time, the system displays an error message and prompts the organizer to choose a different venue or adjust the event schedule.

#### Event Not Found
- If the selected event does not exist, the system displays an error message and prompts the organizer to select a valid event.

## Exceptions
- **System Error**: If a system error occurs while updating the venue, the system displays an error message and prompts the organizer to try again later.

#### Related UI Prototypes
| Change Event Venue Page                            |
|----------------------------------------------------|
| ![Change Venue](../../UI/organizer/edit_venue.png) |