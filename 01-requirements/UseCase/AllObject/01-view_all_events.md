# Use Case: View All Accounts

## Description
- This use case allows the administrator to view a list of all events in the system.

## Actors
- Administrator, Organizer, User

## Triggers
- This use case is triggered when the new accounts login

## Preconditions

- The administrator is on their main page(01-view_all_events.png).
- The organizer is on their main page(17-view_all_events.png).
- The user is on their main page(34-view_all_events.png).

## Postconditions
- The administrator is able to view the table of all events in the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events--Administrator
1. After logging in, the administrator is presented with the main page(01-view_all_events.png), displaying a table of all scheduled events for the current date
2. The system displays a table showing all events scheduled for the current date.
3. The administrator can see the following details in the table:
    - Event Name
    - Time Slots (e.g., 2:00, 4:00, 6:00, etc.)
    - Available Slots for Each Event
4. The administrator can use the navigation buttons (left, right) or date picker to change the date and view events scheduled on different dates.
5. If there are no events for the selected date, the system displays an empty table or a "No Events Scheduled" message.

#### Course of Events--Organizer
1. After logging in, the organizer is presented with the main page(17-view_all_events.png), displaying a table of all scheduled events for the current date
2. The system displays a table showing all events scheduled for the current date.
3. The organizer can see the following details in the table:
   - Event Name
   - Time Slots (e.g., 2:00, 4:00, 6:00, etc.)
   - Available Slots for Each Event
4. The organizer can use the navigation buttons (left, right) or date picker to change the date and view events scheduled on different dates.
5. If there are no events for the selected date, the system displays an empty table or a "No Events Scheduled" message.


#### Course of Events
1. After logging in, the user is presented with the main page(34-view_all_events.png), displaying a table of all scheduled events for the current date.
2. The system displays a table showing all events scheduled for the current date.
3. The user can see the following details in the table:
   - Event Name
   - Time Slots (e.g., 2:00, 4:00, 6:00, etc.)
   - Available Seats for Each Event
   - Event Type (e.g., Concert, Sports, Theater)
   - Venue Name
4. The user can use the navigation buttons (left, right) or date picker to change the date and view events scheduled on different dates.
5. If there are no events for the selected date, the system displays an empty table or a "No Events Scheduled" message.

### 02 - Alternate course of events -

#### No Events Found
- The system shows that no events exist in the system.

#### Related UI Prototypes
### Administrator
![View All Events](../../UI/admin/01-view_all_events.png)

### Organizer
 ![View All Events](../../UI/organizer/17-view_all_events.png) 
### User
 ![View All Events](../../UI/user/34-view_all_events.png) 


