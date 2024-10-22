# Use Case: View All Venues

## Description
- Allows the administrator or organiser to view a list of all venues in the system available for hosting events.

## Actors
- Administrator, Organizer

## Triggers
- This use case is triggered when the administrator or organizer needs to view a list of all venues in the system.

## Preconditions
- The administrator selects 'View All Venues' from the main page(01-view_all_events.png).

## Postconditions
- The administrator is shown the list venues page (04-view_all_venues.png).
- The organizer is shown the list venues page (25-view_all_venues.png).

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator selects 'View All Venues' from the main page(01-view_all_events.png).
- The system retrieves and displays a list of all existing venues(04-view_all_venues.png).

#### Course of Events
1. The organizer selects the "Venues" option from the main page(17-view_all_events.png).
2. The system prompts the organizer to enter the desired date.
3. The system retrieves all available venues for the specified date.
4. The system displays the list of venues page(25-view_all_venues.png), including details such as venue name, address, capacity, and contact information.


### 02 - Alternate course of events -

#### No Venues Found
- The system shows that no venues exist in the system.

### Related UI Prototypes-- Administrator
![View All Venues](../../UI/admin/04-view_all_venues.png)
### Related UI Prototypes-- Organizer
 ![View All Venues](../../UI/organizer/25-view_all_venues.png) 

## Data Outcome
- **READ** -  A list of all venues in the system available for hosting events will be read and display.
