# 17 Delete Venue

## Basic Course of Events

### Course of Events
- 1.The administrator performs the display use case **(01-main_page_administrator.png)**.
- 2.The administrator selects a venue to delete.
- 3.The system highlights the venue to indicate it is selected.
- 4.The administrator selects the delete functionality.
- 5.The system asks the administrator to confirm **(Delete Venue)**.
- 6.The administrator selects **Confirm**.
- 7.The system updates the display to show the remaining venues to administrator, with the deleted venue absent. **(04-view_all_venues.png)**


### Sequence Diagram

![Delete Venue](/03-design/sequence-diagrams/Administrator/17-delete_venue-basic.png)

## Alternate Course of Events

### Do Not Delete

- The administrator is shown the list venues page (01-main_page_administrator.png) where system displays a list of existing venues.
- The administrator selects the venue to delete.
- The system highlights the venue to indicate it is selected.
- The administrator selects the delete functionality.
- The system asks the administrator to confirm.
- The administrator selects **Cancel**.
- The system updates the display to show all venues to administrator. **(04-view_all_venues.png)**

### Sequence Diagram-- Alternate Course of Events
![Do not delete](/03-design/sequence-diagrams/Administrator/17-delete_venue_alternative.png)

#### Venue Not Found
- The administrator tries to delete a venue that does not exist.
- The system displays an error message.

### Sequence Diagram-- Alternate Course of Events
There is no interaction


## UI Sketches

This is the page that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/admin/04-view_all_venues.png)

![Delete Venue](/02-analysis/UI/admin/06-delete_venue.png)

![Venue in use](/02-analysis/UI/admin/Alternative/delete_venue_in_use.png)