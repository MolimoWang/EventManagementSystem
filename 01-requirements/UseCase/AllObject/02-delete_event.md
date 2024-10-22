# Use Case: Delete Event

## Description
- This use case allows an administrator or organizer to delete an existing event from the system.

## Actors
- Administrator, Organizer

## Triggers
- The administrator decides to remove an event from the system.

## Preconditions
- The administrator is on the event history page(02-view_events_history.png).
- The organizer is on their event page(18-list_my_event.png).
- The event must exist.

## Postconditions
- The event is permanently removed from the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events-- Administrator
- The administrator selects the event to delete.
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The event is deleted.
- A confirmation message is shown to the administrator.

#### Course of Events-- Organizer
3. The organizer selects the event to be canceled and confirms the cancellation.
4. The system marks the event as canceled and displays a confirmation message.
5. The system sends notifications to users who have purchased tickets for the canceled event.



### 02 - Alternate course of events -

#### Do Not Delete
- The administrator(organizer) selects an event to delete.
- The system asks the administrator(organizer) to confirm.
- The administrator(organizer) selects **No**.
- The system returns to the previous interface, and no event is deleted.

#### Event Not Found
- The administrator(organizer) tries to delete an event that no longer exists.
- The system displays an error message.

### Related UI Prototypes-- Administrator
![Delete Event](../../UI/admin/03-delete_event.png)
### Related UI Prototypes-- Organizer
![Cancel Event](../../UI/organizer/21-delete_event.png)
