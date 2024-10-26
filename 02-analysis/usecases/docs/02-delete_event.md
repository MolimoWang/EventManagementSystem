# 02 Delete Event


## Basic Course of Events
### Course of Events -- Administrator
- 1.The administrator selects the event to delete.
- 2.The system passes requests to the service.
- 3.The service queries this event among all events.
- 4.The service asks the administrator to confirm.
- 5.The administrator selects **Yes**.
- 6.The event is deleted.
- 7.The system displays remaining events to the administrator.

### Sequence Diagram
![Delete Event_Administrator](/02-analysis/sequence-diagrams/Common/02-delete_event_administrator.png)

### Course of Events -- Organizer
- 1.The organizer selects the event to delete.
- 2.The system queries this event among all events.
- 3.The system passes requests to the service.
- 4.The system asks the organizer to confirm.
- 5.The organizer selects **Yes**.
- 6.The event is deleted.
- 7.The system displays remaining events to the organizer.

### Sequence Diagram
![Delete Event_Organizer](/02-analysis/sequence-diagrams/Common/02-delete_event_organizer.png)

## Alternate Course of Events

#### Do Not Delete
- 1.The administrator(organizer) selects an event to delete.
- 2.The system passes requests to the service.
- 3.The service queries this event among all events.
- 4.The system asks the administrator(organizer) to confirm.
- 5.The administrator(organizer) selects **No**.
- 6.The system returns to the previous interface, and no event is deleted.

### Sequence Diagram -- Alternate Course of Events
- In this case, all interactions are completed within the JS code of the page. No request is made to the server and no response is received.

## UI Sketches

### Administrator
This is the page that the user must be on at the start to complete the use case.
![View Events History](/02-analysis/UI/admin/02-view_events_history.png)
![Delete Event](/02-analysis/UI/admin/03-delete_event.png)

### Organizer
This is the page that the user must be on at the start to complete the use case.
![View Events History](/02-analysis/UI/organizer/02-view_events_history.png)
![Delete Event](/02-analysis/UI/organizer/21-delete_event.png)