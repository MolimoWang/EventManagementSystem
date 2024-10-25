# Use Case: Delete Venue

## Description
- This use case involves an administrator deleting a venue from the system.

## Actors
- Administrator

## Triggers
- The administrator decides to remove a venue from the system.

## Preconditions
- The administrator is shown the list venues page (04-view_all_venues.png).
- The venue must exist in the system.

## Postconditions
- The system update the list venues page (04-view_all_venues.png) with this venue deleted.
- 
## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator is shown the list venues page (04-view_all_venues.png) where system displays a list of existing venues.
- The administrator selects the venue to delete.
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The system update the list venues page (04-view_all_venues.png) with this venue deleted.




### 02 - Alternate course of events -

#### Do Not Delete
- The administrator is shown the list venues page (04-view_all_venues.png) where system displays a list of existing venues.
- The administrator selects the venue to delete.
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system returns to the list venues page (04-view_all_venues.png), and no venue is deleted.

#### Venue Not Found
- The administrator tries to delete a venue that does not exist.
- The system displays an error message.

#### Venue In Use
- The administrator attempts to delete a venue that is still associated with upcoming events.
- The system displays a warning indicating that the venue is still in use and cannot be deleted.

### Related UI Prototypes
![Delete Venue](../../UI/admin/06-delete_venue.png)

## Data Outcome
- **READ** - The details of the all venues will be read and displayed.
- **DELETE** - The details of the venue will be removed from the system.
