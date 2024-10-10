# Use Case: View All Accounts

## Description
- This use case allows the administrator to view a list of all events in the system.

## Actors
- Administrator

## Triggers
- The administrator decides to view all existing events in the system.

## Preconditions
- The administrator must be logged into the system.
- There are events available in the system.

## Postconditions
- The administrator is able to view the details of all events in the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
1. After logging in, the administrator is presented with the 'View All Events' page, displaying a table of all scheduled events for the current date
2. The system displays a table showing all events scheduled for the current date.
3. The administrator can see the following details in the table:
    - Event Name
    - Time Slots (e.g., 2:00, 4:00, 6:00, etc.)
    - Available Slots for Each Event
4. The administrator can use the navigation buttons (left, right) or date picker to change the date and view events scheduled on different dates.
5. If there are no events for the selected date, the system displays an empty table or a "No Events Scheduled" message.

#### Related UI Prototypes
- Event list view

### 02 - Alternate course of events -

#### No Events Found
- The system shows that no events exist in the system.

#### Related UI Prototypes
- Message indicating no events found