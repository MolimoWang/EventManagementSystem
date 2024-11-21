# Use Case: Display Date

## Description
This use case allows any entities to navigate to a specific date to view the current events scheduled for that date or add new events.

## Actors
- Administrator, Organizer, User

## Triggers
- This use case is triggered when an administrator, organizer, user wants to:
    - View the events scheduled for a particular date
    - Create a new event for a particular date (Organizer)
    - Modify existing events scheduled for that date (Organizer)

## Preconditions
- The administrator is on their main page(01-view_all_events.png).
- The organizer is on their main page(17-view_all_events.png) or list my events page (18-list_my_events.png) .
- The user is on their main page(34-view_all_events.png).

## Postconditions
- The selected date and all events scheduled for that date will be displayed on the screen.

## Courses of Events

### 01 - Basic course of events

#### Course of Events-- Administrator, User
1. The user or administrator enters the date they want to view.
2. The system displays the events scheduled for that date, including details such as event name, time, and venue.

#### Course of Events-- Organizer
1. The organizer enters the date they want to view.
2. The system displays the events scheduled for that date, including details such as event name, time, and venue.


## Inclusions
None

## Data Outcomes
**READ** - The system retrieves the details of the existing events for the specified date.

### **Related UI Prototypes**
| Display Events for Date Page                                       |
|--------------------------------------------------------------------|
| ![Display Events for Date](../../UI/organizer/24-display_date.png) |

## Data Outcome
- **READ** - The schedule will be read and displayed.
- **CREATE** - The event of the selected date will be created.
- **UPDATE** - The event of the selected date will be updated.
