# 10 Search Filter Events

## Basic Course of Events
### Course of Events
- The user/organizer/administrator inputs the name of the event they want to search for in the filter box.
- The user/organizer/administrator click the 'Search' button.
- The system displays the search results.

### Sequence Diagram
### Administrator
![Administrator](/02-analysis/sequence-diagrams/Common/10-administrator_search_filter_events.png)
### User
![User](/02-analysis/sequence-diagrams/Common/10-user_search_filter_events.png)
### Organizer
![Organizer](/02-analysis/sequence-diagrams/Common/10-organizer_search_filter_events.png)

## Alternate Course of Events

### No Matching Events
- The user inputs the name of the event they want to search for in the filter box.
- The user click the 'Search' button.
- The system prompts that no event information that meets the criteria was found.

### Sequence Diagram
- This does not need a sequence diagram because it will be shown in front end.

## UI Sketches
### Administrator
This is the page that the user must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/admin/01-view_all_events.png)

### Search
![Search](/02-analysis/UI/user/38-search_filter_events.png)

### Event Lists
![Event Lists](/02-analysis/UI/user/44-filter_events.png)

### Organizer
There the pages that the user must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/organizer/17-view_all_events.png)

### Search
![Search](/02-analysis/UI/user/38-search_filter_events.png)

### Event Lists
![Event Lists](/02-analysis/UI/user/44-filter_events.png)

### User
There the pages that the user must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/user/34-view_all_events.png)

### Search
![Search](/02-analysis/UI/user/38-search_filter_events.png)

### Event Lists
![Event Lists](/02-analysis/UI/user/44-filter_events.png)
