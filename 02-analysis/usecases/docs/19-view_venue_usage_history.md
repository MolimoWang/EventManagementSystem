# 19 View Venue Usage History


## Basic Course of Events

- 1.The administrator select one venue to see its usage history.
- 2.The system passes requests to the service.
- 3.The service queries this usage history among all events.
- 4.The system retrieves and displays a list of events that have been hosted at that venue.

### Sequence Diagram
![view_venue_usage_history](/02-analysis/sequence-diagrams/Administrator/19-view_venue_usage_history.png)

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