# 10 Search Filter Events

## Basic Course of Events

### Course of Events
1. The customer/organizer/administrator is on their main page.
2. The customer/organizer/administrator clicks the filter box.
3. The system highlights the box to indicate it is selected(38-search_filter_events.png).
4. The customer/organizer/administrator inputs the name of the event they want to search for in the filter box.
5. The customer/organizer/administrator click the 'Search' button.
6. The system displays the search results(44-filter_events.png).

### Sequence Diagram

### Administrator
![Administrator](/02-analysis/sequence-diagrams/Common/10-administrator_search_filter_events.png)

### Customer
![Customer](/02-analysis/sequence-diagrams/Common/10-user_search_filter_events.png)

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
![Main Page](/02-analysis/UI/admin/01-main_page_administrator.png)

### Search
![Search](/02-analysis/UI/customer/38-search_filter_events.png)

### Event Lists
![Event Lists](/02-analysis/UI/customer/44-filter_events.png)

### Organizer
There the pages that the user must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/organizer/17-main_page_organiser.png)

### Search
![Search](/02-analysis/UI/customer/38-search_filter_events.png)

### Event Lists
![Event Lists](/02-analysis/UI/customer/44-filter_events.png)

### Customer
There the pages that the Customer must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/customer/34-main_page_customer.png)

### Search
![Search](/02-analysis/UI/customer/38-search_filter_events.png)

### Event Lists
![Event Lists](/02-analysis/UI/customer/44-filter_events.png)

## Data Outcome
- **READ** - The corresponding events in the system will be read and display.

