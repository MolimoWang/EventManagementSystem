# Use Case:Create Event

## Description
This use case allows an organizer to create a new event to the system by providing event details such as name, date, time, and venue.

## Actors
- Organizer

## Triggers
- The organizer wants to create a new event to be hosted at a specific venue.

## Preconditions
- The organizer is on the list my events page (18-list_my_events.png).
- At least one venue is available in the system.

## Postconditions
- The system updates the list my events page (18-list_my_events.png) with the added events.
## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer logs on and clicks 'event' button to list current events
2. The organizer selects the "+" option from the list my events page (18-list_my_events.png)3
3. The system turns to create event page (19-create_event.png) which displays a form to enter event details
4. The system turn to create event page (19-create_event.png) which displays a form to enter event details, including:
   - Event Name
   - Date and Time
   - Venue
   - Description
   - Ticket Information (price)
5. The organizer clicks "Submit" and a new event have been created.
6. 5. The system updates the list of nupcoming events and\nreturn to the list my events page (18-list_my_events.png).



### 02 - Alternate course of events


## Exceptions
- **System Error**: If a system error occurs while saving the event, the system displays an error message and prompts the organizer to try again later.

### **Related UI Prototypes**
| Create Event Page                                             |
|---------------------------------------------------------------|
| ![Create Event](../../UI/organizer/19-create_event.png)       |


## Data Outcome
- **CREATE** - A new event will be created and added to the system.
- **READ** - The details of the newly created event will be read and displayed.
