# 01 View All Events


## Basic Course of Events
### Course of Events -- Administrator
1. After logging in, the administrator is presented with the main page(01-view_all_events.png), displaying a table of all scheduled events for the current date.
2. The system passes requests to the service.
3. The service displays a table showing all events scheduled for the current date.
4. The administrator can see the following details in the table:
    - Event Name
    - Time Slots (e.g., 2:00, 4:00, 6:00, etc.)
    - Available Slots for Each Event
    - Event Type (e.g., Concert, Sports, Theater)
    - Venue Name
5. The administrator can use the navigation buttons (left, right) or date picker to change the date and view events scheduled on different dates.
6. If there are no events for the selected date, the system displays an empty table or a "No Events Scheduled" message.

## Sequence Diagram
![view_all_events_Admin](/02-analysis/sequence-diagrams/Common/01-view_all_events_administrator.png)

### Course of Events -- Organizer
1. After logging in, the organizer is presented with the main page(17-view_all_events.png), displaying a table of all scheduled events for the current date.
2. The system passes requests to the service.
3. The service displays a table showing all events scheduled for the current date.
4. The organizer can see the following details in the table:
    - Event Name
    - Time Slots (e.g., 2:00, 4:00, 6:00, etc.)
    - Available Slots for Each Event
    - Event Type (e.g., Concert, Sports, Theater)
    - Venue Name
5. The organizer can use the navigation buttons (left, right) or date picker to change the date and view events scheduled on different dates.
6. If there are no events for the selected date, the system displays an empty table or a "No Events Scheduled" message.

## Sequence Diagram
![view_all_events_Organizer](/02-analysis/sequence-diagrams/Common/01-view_all_events_organizer.png)
 
### Course of Events
1. After logging in, the user is presented with the main page(34-view_all_events.png), displaying a table of all scheduled events for the current date.
2. The system passes requests to the service.
3. The service displays a table showing all events scheduled for the current date.
4. The user can see the following details in the table:
    - Event Name
    - Time Slots (e.g., 2:00, 4:00, 6:00, etc.)
    - Available Seats for Each Event
    - Event Type (e.g., Concert, Sports, Theater)
    - Venue Name
5. The user can use the navigation buttons (left, right) or date picker to change the date and view events scheduled on different dates.
6. If there are no events for the selected date, the system displays an empty table or a "No Events Scheduled" message.

### Sequence Diagram
![view_all_events_User](/02-analysis/sequence-diagrams/Common/01-view_all_events_user.png)

## Alternate Course of Events
- None
### Sequence Diagram-- Alternate Course of Events
- None
## UI Sketches

### Administrator
This is the page that the user must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/admin/01-view_all_events.png)

### Organizer
There the pages that the user must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/organizer/17-view_all_events.png)


### User
There the pages that the user must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/user/34-view_all_events.png)

## Data Outcome

- **Read** - All events will be shown on the system and the administrator, organizer or user can read it.
- **UPDATE** - None

