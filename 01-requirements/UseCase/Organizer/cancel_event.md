# Cancel Event Use Case

## Description
This use case allows an organizer to cancel an event that has been scheduled in the event management system.

## Actors
- Organizer

## Triggers
- The organizer decides to cancel a scheduled event, either due to unforeseen circumstances or other reasons.

## Preconditions
- The organizer can only cancel events they have created and cannot modify events created by other organizers.
- The organizer must be logged into the system.
- The organizer must have appropriate privileges to cancel the event.
- The event must exist in the system.

## Postconditions
- The event is marked as canceled and is no longer available for ticket booking.
- Notifications are sent to users who have purchased tickets for the event.

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "Cancel Event" option from the event management menu.
2. The system displays a list of events that can be canceled.
3. The organizer selects the event to be canceled and confirms the cancellation.
4. The system marks the event as canceled and displays a confirmation message.
5. The system sends notifications to users who have purchased tickets for the canceled event.




### 02 - Alternate course of events

#### Event Not Found
- If the selected event does not exist, the system displays an error message and prompts the organizer to select a valid event.

#### Tickets Sold
- If tickets have already been sold, the system warns the organizer that users will be notified of the cancellation and proceeds only after the organizer confirms.

## Exceptions
- **No Permission to Cancel**: If the organizer attempts to cancel an event created by another organizer, the system displays an error message and prevents the cancellation.
- **System Error**: If a system error occurs while canceling the event, the system displays an error message and prompts the organizer to try again later.

### **Related UI Prototypes**
| Cancel Event Page |
| --- |
| ![Cancel Event](../../UI/organizer/cancel_event.png) |