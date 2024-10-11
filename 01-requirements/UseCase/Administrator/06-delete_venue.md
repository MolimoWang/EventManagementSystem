# Use Case: Delete Venue

## Description
- This use case involves an administrator deleting a venue from the system.

## Actors
- Administrator

## Triggers
- The administrator decides to remove a venue from the system.

## Preconditions
- The administrator must be logged into the system.
- The venue must exist in the system.

## Postconditions
- The venue is permanently removed from the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator navigates to the 'View All Venues' page, which displaying all existing venues in the system.
- The system displays a list of existing venues.
- The administrator selects the venue to delete.
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The venue is deleted from the system.
- A confirmation message is shown to the administrator.

#### Related UI Prototypes
- Venue deletion confirmation dialog

### 02 - Alternate course of events -

#### Do Not Delete
- The administrator selects a venue to delete.
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system returns to the previous interface, and no venue is deleted.

#### Venue Not Found
- The administrator tries to delete a venue that does not exist.
- The system displays an error message.

#### Venue In Use
- The administrator attempts to delete a venue that is still associated with upcoming events.
- The system displays a warning indicating that the venue is still in use and cannot be deleted.

#### Related UI Prototypes
- Error message for venue not found
- Warning for venue in use
