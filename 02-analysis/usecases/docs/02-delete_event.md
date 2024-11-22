# 02 Delete Event


## Basic Course of Events

### Course of Events -- Administrator
- 1. The administrator selects the delete event functionality adjacent to the event they want to remove on the list events page
- 2. The system asks the administrator to confirm the deletion of the event (03-delete_event.png)
- 3. The administrator clicks OK
1. The system returns to the list events page (02-view_events_history.png) and the venue is no longer displayed


### Sequence Diagram

![Delete Event_Administrator](/02-analysis/sequence-diagrams/Common/02-delete_event_administrator.png)

### Course of Events -- Organizer

- 1. The organizer selects the delete event functionality adjacent to the event they want to remove on the list events page
- 2. The system asks the organizer to confirm the deletion of the event (03-delete_event.png)
- 3. The organizer clicks OK
- 4. The system returns to the list events page (02-view_events_history.png) and the venue is no longer displayed

### Sequence Diagram
![Delete Event_Organizer](/02-analysis/sequence-diagrams/Common/02-delete_event_organizer.png)
 
## Alternate Course of Events

#### Do Not Delete

- 1.The Administrator(organizer) selects the delete event functionality adjacent to the event they want to remove on the list events page
- 2.The system asks the Administrator(organizer) to confirm the deletion of the event (03-delete_event.png)
- 3.The Admistrator(organizer) clicks No
- 4.The system returns to the list events page (18-list_my_event.png) with no changes


### Sequence Diagram -- Alternate Course of Events

- In this case, all interactions are completed within the JS code of the page. No request is made to the server and no response is received.

## UI Sketches

- The administrator is on the event history page(02-view_events_history.png).
- The organizer is on their event page(18-list_my_event.png).

### Administrator
This is the page that the user must be on at the start to complete the use case.

![View Events History](/02-analysis/UI/admin/02-view_events_history.png)

### Delete Event

![Delete Event](/02-analysis/UI/admin/03-delete_event.png)

### Organizer

This is the page that the user must be on at the start to complete the use case.

![View Events History](/02-analysis/UI/organizer/18-list_my_events.png)

### Delete Event

![Delete Event](/02-analysis/UI/organizer/21-delete_event.png)

## Data Outcome

- **Read** - The selected event will be deleted in the system.
- **UPDATE** - The number of events will be changed.