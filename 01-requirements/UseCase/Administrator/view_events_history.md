# Use Case: View Event History

## Description
- This use case allows the administrator to view the history of events organized in the system.

## Actors
- Administrator

## Triggers
- The administrator decides to view the past events that have been organized.

## Preconditions
- The administrator selects 'View Events History' from the main page(01-view_all_events.png) .
- Events must exist in the system.

## Postconditions
- The administrator can view a list of past events.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator selects 'View Event History' from the main page(01-view_all_events.png).
- The system retrieves and displays a list of all events histories page(02-view_events_history.png).


### 02 - Alternate course of events -

#### No Events Found
- The system shows that there are no past events in the system.

### Related UI Prototypes
![View Events History](../../UI/admin/02-view_events_history.png)
