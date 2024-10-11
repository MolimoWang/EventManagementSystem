# Use Case: View Venue Usage History

## Description
- This use case allows the administrator to view the history of a venue usage in the system.

## Actors
- Administrator

## Triggers
- The administrator decides to view the usage history of a venue.

## Preconditions
- The administrator must be logged into the system.
- Venues must exist in the system and must have hosted events.

## Postconditions
- The administrator can view the history of events hosted at each venue.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator navigates to the 'View All Venues' page, which displaying all existing venues in the system.
- In the venue list, the administrator clicks the 'View History' link next to the specific venue.
- The system retrieves and displays a list of events that have been hosted at that venue.

### 02 - Alternate course of events -

#### No Usage Found
- The system shows that there is no history of events hosted at the venues.

### Related UI Prototypes
![View Venue Usage History](../../UI/admin/05-view_venue_usage_history.png)