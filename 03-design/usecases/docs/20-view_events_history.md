# 20 View Events History

## Basic Course of Events

### Course of Events
- The admin performs the display use case (01-view_all_events.png).
- The admin selects "Events History" from the display.
- The system will display all event, including:
    1.  Event Name   
    2.  Event Date   
    3.  Venue Name   
    4.  The number of Reservation   
    5.  Delete (The admin can delete this event)
- The system updates the display to show events history(01-view_all_events.png)


### Sequence Diagram

![View events history](/03-design/sequence-diagrams/Administrator/20-view_events_history.png)

## Alternate Course of Events

### No Events Found
- The system shows that there are no past events in the system.

### Sequence Diagram-- Alternate Course of Events
There is no interaction

## UI Sketches
This is the page that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/admin/01-main_page_administrator.png)

![View events history](/02-analysis/UI/admin/02-view_events_history.png)
