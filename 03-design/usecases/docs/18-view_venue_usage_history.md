# 18 View Venue Usage History


## Basic Course of Events

- 1.The administrator performs the display use case. **(01-main_page_administrator.png)**
- 2.The administrator selects "Usage History" from a displayed venue.
- 3.The system will display all events held at this venue.
- 4.The system updates the display to show all related events. **(05-view_venue_usage_history.png)**

### Sequence Diagram
![view_venue_usage_history](/03-design/sequence-diagrams/Administrator/18-view_venue_usage_history.png)

## Alternate Course of Events

### Do not have usage history
- The system shows that there is no usage history for this venue.

### Sequence Diagram-- Alternate Course of Events
- None

## UI Sketches
This is the page that the user must be on at the start to complete the use case.

![View All Venues](/02-analysis/UI/admin/04-view_all_venues.png)

![View Venue Usage History](/02-analysis/UI/admin/05-view_venue_usage_history.png)


## Data Outcome
- **READ** - The venue usage history will be shown on the system and the administrator can read it.
- **UPDATE** - None