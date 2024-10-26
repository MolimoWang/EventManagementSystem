# 02 Delete Event

## Basic Course of Events
### Course of Events-- Administrator
- The administrator selects the event to delete.
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The event is deleted.
- The system returns to the previous interface.

### Course of Events-- Organizer
- The organizer selects the event to delete.
- The system asks the organizer to confirm.
- The organizer selects **Yes**.
- The event is deleted.
- The system returns to the previous interface.

### Sequence Diagram

## Alternate Course of Events

#### Do Not Delete
- The administrator(organizer) selects an event to delete.
- The system asks the administrator(organizer) to confirm.
- The administrator(organizer) selects **No**.
- The system returns to the previous interface, and no event is deleted.

### Sequence Diagram-- Alternate Course of Events

## UI Sketches

### Administrator
This is the page that the user must be on at the start to complete the use case.
![View Events History](/02-analysis/UI/admin/02-view_events_history.png)
![Delete Event](/02-analysis/UI/admin/03-delete_event.png)

### Organizer
This is the page that the user must be on at the start to complete the use case.
![View Events History](/02-analysis/UI/organizer/18-list_my_events.png)
![Delete Event](/02-analysis/UI/organizer/21-delete_event.png)