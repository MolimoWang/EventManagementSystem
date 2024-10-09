# Use Case: Delete Event

## Description
- This use case allows an administrator to delete an existing event from the system.

## Actors
- Administrator

## Triggers
- The administrator decides to remove an event from the system.

## Preconditions
- The administrator must be logged into the system.
- The event must exist.

## Postconditions
- The event is permanently removed from the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator selects 'Delete Event' from the event management menu.
- The system displays a list of existing events.
- The administrator selects the event to delete.
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The event is deleted.
- A confirmation message is shown to the administrator.

#### Related UI Prototypes
- Event deletion confirmation dialog

### 02 - Alternate course of events -

#### Do Not Delete
- The administrator selects an event to delete.
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system returns to the previous interface, and no event is deleted.

#### Event Not Found
- The administrator tries to delete an event that no longer exists.
- The system displays an error message.

#### Related UI Prototypes
- Error message for event not found
