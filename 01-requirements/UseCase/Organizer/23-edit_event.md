# Use Case: Edit Event

## Description
This use case allows an organizer to edit the details of an existing event in the event management system, such as the event name, date, time, venue, or ticket information.

## Actors
- Organizer

## Triggers
- The organizer wants to update information about an event due to changes in schedule or other reasons.

## Preconditions
- The organizer is on list my events page (18-list_my_events.png).

## Postconditions
- The organizer is shown the list my events page on the view events page (22-view_event_details)

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "Edit" option of a certain event on list my events page (18-list_my_events.png).
2. The system displays a form with the current event details(20-edit_event.png).
3. The organizer updates the necessary fields (e.g., name, date, time, venue, ticket information).
4. The organizer clicks "Save Changes" to confirm the changes.
5. The system shows the created details of the event on the view events page (22-view_event_details).


### 02 - Alternate course of events
- None
## Exceptions
- **System Error**: If a system error occurs while saving the updated event, the system displays an error message and prompts the organizer to try again later.

#### Related UI Prototypes
| Edit Event Page                                             |
|-------------------------------------------------------------|
| ![Edit Event](../../UI/organizer/20-edit_event.png)         |

## Data Outcome
- **READ** - The details of the event will be read and displayed.
- **UPDATE** - The details of the event will be updated.
