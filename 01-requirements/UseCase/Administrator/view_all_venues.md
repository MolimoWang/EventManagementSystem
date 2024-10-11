# Use Case: View All Venues

## Description
- This use case allows the administrator to view a list of all venues in the system.

## Actors
- Administrator

## Triggers
- The administrator decides to view all existing venues in the system.

## Preconditions
- The administrator must be logged into the system.
- There are venues available in the system.

## Postconditions
- The administrator is able to view the details of all venues in the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator selects 'View All Venues' from the 'View All Events' page.
- The system retrieves and displays a list of all existing venues.

#### Related UI Prototypes
- Venue list view

### 02 - Alternate course of events -

#### No Venues Found
- The system shows that no venues exist in the system.

#### Related UI Prototypes
- Message indicating no venues found
