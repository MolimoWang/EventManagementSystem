# 18 Delete Venue

## Basic Course of Events

### Course of Events
- The administrator is shown the list venues page (04-view_all_venues.png) where system displays a list of existing venues.
- The administrator selects the venue to delete.
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The system update the list venues page (04-view_all_venues.png) with this venue deleted.

### Sequence Diagram

![Delete Venue](/02-analysis/sequence-diagrams/Administrator/18-delete_venue.png)

## Alternate Course of Events

### Do Not Delete

- The administrator is shown the list venues page (04-view_all_venues.png) where system displays a list of existing venues.
- The administrator selects the venue to delete.
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system returns to the list venues page (04-view_all_venues.png), and no venue is deleted.

### Sequence Diagram-- Alternate Course of Events

![Do not delete](/02-analysis/sequence-diagrams/Administrator/18-delete_venue_do_not_delete.png)

#### Venue Not Found
- The administrator tries to delete a venue that does not exist.
- The system displays an error message.

### Sequence Diagram-- Alternate Course of Events
There is no interaction


### Venue In Use

- The administrator attempts to delete a venue that is still associated with upcoming events.
- The system displays a warning indicating that the venue is still in use and cannot be deleted.

### Sequence Diagram-- Alternate Course of Events
[Venue in use](/02-analysis/sequence-diagrams/Administrator/18-delete_venue_in_use.png)

## UI Sketches

This is the page that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/admin/04-view_all_venues.png)

![Delete Venue](/02-analysis/UI/admin/06-delete_venue.png)

![Venue in use](/02-analysis/UI/admin/Alternative/delete_venue_in_use.png)