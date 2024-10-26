# View Event Registration Use Case

## Description
This use case allows an organizer or administrator to view the registration details of a specific event, focusing on the information about users who have registered for the event.

## Actors
- Organizer, Administrator

## Triggers
- The organizer or administrator wants to see the registration details for a specific event they have created.

## Preconditions
- The organizer or administrator is on the event details page(22-view_event_details.png)

## Postconditions
- The system displays the registration details for the selected event, including the list of registered users.

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer or administrator selects the "View Event Registrations" option from event details page(22-view_event_details.png).
2. The system displays the registration details page(23-view_event_registrations.png).


### 02 - Alternate course of events
- None.
## Exceptions
- **System Error**: If a system error occurs while retrieving the registration details, the system displays an error message and prompts the organizer to try again later.

#### Related UI Prototypes
| View Event Registration Page |
| --- |
| ![View Event Registration](../../UI/organizer/23-view_event_registrations.png) |

## Data Outcome
- **READ** - The registration details of a specific event will be read and display.
