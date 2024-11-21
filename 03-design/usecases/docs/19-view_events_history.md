# 19 View Events History

## Basic Course of Events

### Course of Events
- 1.The administrator performs the display use case (01-main_page_administrator.png).
- 2.The administrator selects "Events History" from the display.
- 3.The system will display all related events **(02-view_events_history.png)**, including:
    1.  Event Name   
    2.  Event Date   
    3.  Venue Name   
    4.  The number of Reservation   
    5.  Delete (The administrator can delete this event)

### Sequence Diagram

![View events history](/03-design/sequence-diagrams/Administrator/19-view_events_history-basic.png)

## Alternate Course of Events

### No Events Found
- The system shows that there are no past events in the system.

### Sequence Diagram-- Alternate Course of Events
There is no interaction

## UI Sketches
This is the page that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/admin/01-main_page_administrator.png)

![View events history](/02-analysis/UI/admin/02-view_events_history.png)

## Data Outcome
- **READ** - The events history will be shown on the system and the administrator can read it.