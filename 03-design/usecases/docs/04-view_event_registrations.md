# 04 View Event Registrations

## Basic Course of Events

- 1. The administrator or organizer selects am event to view its details
- 2. The administrator or organizer selects the "View Event Registrations" option from event details page(22-view_event_details.png).
-  3. The system displays the users who registered for this event to organizer or administrator.(23-view_event_registrations.png)
    
### Sequence Diagram
![view_event_registrations](03-design/sequence-diagrams/Common/04-view_event_registrations.png)

## Alternate Course of Events

### No users for this event

- The system shows that there is no users for this event.

### Sequence Diagram-- Alternate Course of Events
- None

## UI Sketches

This is the page that the user must be on at the start to complete the use case.



![View Event Registration](/02-analysis/UI/organizer/22-view_event_details.png)

### View Event Registration
| View Event Registration Page                                                          |
|---------------------------------------------------------------------------------------|
| ![View Event Registration](/02-analysis/UI/organizer/23-view_event_registrations.png) |

## Data Outcome
- **Read** - The event registrations will be shown on the system and the administrator or organizer can read it.
- **UPDATE** - None
