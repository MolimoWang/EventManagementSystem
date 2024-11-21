# 03 View Events Details

## Basic Course of Events

### Course of Events

- 1. The user wants to retrieve details of a specific event, click search and send a GET request to web browser
- 2. The system displays the event details page（22-view_event_details.png）
 
### Sequence Diagram

![view_event_details](/03-design/sequence-diagrams/Common/03-view_event_details_basic.png)


## Alternate Course of Events

#### Do not view

- 1.The user selects an event to view its details.
- 2.The system asks the user to confirm.
- 3.The user selects **No**.

### Sequence Diagram-- Alternate Course of Events

- In this case, all interactions are completed within the JS code of the page. No request is made to the server and no
  response is received.

## UI Sketches
- The administrator is on their main page(01-view_all_events.png) or events history page(02-view_events_history.png).
- The organizer is on their main page(17-view_all_events.png) or their events list page (18-list_my_events.png).
- The user is on their main page(34-view_all_events.png).

### Administrator

This is the page that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/admin/01-main_page_administrator.png)

![View Events History](/02-analysis/UI/admin/02-view_events_history.png)

### Organizer

There the pages that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/organizer/17-main_page_organiser.png)

![List My Events](/02-analysis/UI/organizer/18-list_my_events.png)

### User

There the pages that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/customer/34-main_page_customer.png)

#### Related UI Prototypes-- Administrator, Organizer

| View Event Details Page                                                    |
|----------------------------------------------------------------------------|
| ![View Event Details](/02-analysis/UI/organizer/22-view_event_details.png) |

#### Related UI Prototypes-- User

| View Event Details Page                                               |
|-----------------------------------------------------------------------|
| ![View Event Details](/02-analysis/UI/customer/43-view_event_details.png) |

## Data Outcome

- **Read** - The event details will be shown on the system and the administrator, organizer or user can read it.
- **UPDATE** - None

