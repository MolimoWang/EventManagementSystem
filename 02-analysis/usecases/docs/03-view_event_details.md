# 03 View Events Details

## Basic Course of Events

### Course of Events -- Administrator

- 1.The administrator selects an event to view its details.
- 2.The service asks the administrator to confirm.
- 3.The administrator selects **Yes**.
- 4.The system passes requests to the service.
- 5.The service queries this event among all events.
- 6.The system displays the details to administrator, including:
    1. Event Name and Description
    2. Date and Time
    3. Total Reservations
    4. Venue
    5. Organiser
    6. Ticket type, price, available and sold.
 
### Sequence Diagram

![view_event_details_administrator](/02-analysis/sequence-diagrams/Common/03-view_event_details_administrator.png)

### Course of Events -- Organizer

- 1.The organizer selects an event to view its details.
- 2.The service asks the organizer to confirm.
- 3.The organizer selects **Yes**.
- 4.The system passes requests to the service.
- 5.The service queries this event among all events.
- 6.The system displays the details to organizer, including:
  1. Event Name and Description
  2. Date and Time
  3. Total Reservations
  4. Venue
  5. Organiser
  6. Ticket type, price, available and sold.

### Sequence Diagram

![view_event_details_organizer](/02-analysis/sequence-diagrams/Common/03-view_event_details_organizer.png)

### Course of Events -- User

- 1.The user selects an event to view its details.
- 2.The system asks the user to confirm.
- 3.The user selects **Yes**.
- 4.The system passes requests to the service.
- 5.The service queries this event among all events.
- 6.The system displays the details to user, including:
  1. Event Name and Description
  2. Date and Time
  3. Total Reservations
  4. Venue
  5. Organiser
  6. Ticket type, price, available and sold.

### Sequence Diagram

![view_event_details_user](/02-analysis/sequence-diagrams/Common/03-view_event_details_user.png)

## Alternate Course of Events

#### Do not view

- 1.The user selects an event to view its details.
- 2.The system asks the user to confirm.
- 3.The user selects **No**.

### Sequence Diagram-- Alternate Course of Events

- In this case, all interactions are completed within the JS code of the page. No request is made to the server and no
  response is received.

## UI Sketches
- The administrator is on their main page(01-view_all_events.png) or events history page(02-view_events_history.png).
- The organizer is on their main page(17-view_all_events.png) or their events list page (18-list_my_events.png).
- The user is on their main page(34-view_all_events.png).
### Administrator

This is the page that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/admin/01-view_all_events.png)
![View Events History](/02-analysis/UI/admin/02-view_events_history.png)

### Organizer

There the pages that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/organizer/17-view_all_events.png)
![List My Events](/02-analysis/UI/organizer/18-list_my_events.png)

### User

There the pages that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/user/34-view_all_events.png)

#### Related UI Prototypes-- Administrator, Organizer

| View Event Details Page                                                    |
|----------------------------------------------------------------------------|
| ![View Event Details](/02-analysis/UI/organizer/22-view_event_details.png) |

#### Related UI Prototypes-- User

| View Event Details Page                                               |
|-----------------------------------------------------------------------|
| ![View Event Details](/02-analysis/UI/user/43-view_event_details.png) |

## Data Outcome
- **Read** - The event details will be shown on the system and the administrator, organizer or user can read it.
- **UPDATE** - None

