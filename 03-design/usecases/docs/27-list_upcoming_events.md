# 27 List Upcoming Events

## Basic Course of Events
- The customer selects 'Upcoming' option from the main page (34-view_all_events.png).
- The system turns to the list upcoming events page (36-list_upcoming_events.jpg) and displays the user's upcoming events.
- The system retrieves the upcoming events from the database.
- For each event in the upcoming events list, the system fetches event details.
- If there are upcoming events, the system proceeds to display them.

### Sequence Diagram
![List Upcoming Events](/02-analysis/sequence-diagrams/User/27-list_upcoming_events.png)

## Alternate Course of Events

### No Upcoming Events
- The user selects 'Upcoming' option from the user management menu.
- The system forwards the request to the EventService to retrieve upcoming events.
- The service checks for upcoming events in the database and finds none.
- The system prompts the user that there are no upcoming events.

### Sequence Diagram -- Alternate Course of Events
![No Upcoming Events](/02-analysis/sequence-diagrams/User/27-list_upcoming_evnets_no.png)

## UI Sketches

### Main Page
This is the page where the user selects the 'Upcoming' option to view their upcoming events.

![Main Page](/02-analysis/UI/customer/34-view_all_events.png)

### List Upcoming Events Page
This page displays the user's upcoming events if available. If there are no upcoming events, a message will be shown indicating that no events are available.

![List Upcoming Events Page](/02-analysis/UI/customer/36-list_upcoming_events.png)
