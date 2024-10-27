# 00 Login

## Basic Course of Events
- 1.The user opens the application.
- 2.The system presents a login page and prompt the user to enter their email and password
- 3.The user enters their credentials.
- 4.The system passes requests to the service.
- 5.Service queries all accounts and returns results.
- 6.The system displays the main page of the system. The administrator is on their main page(01-view_all_events.png). The organizer is on their main page(17-view_all_events.png). The user is on their main page(34-view_all_events.png).

### Sequence Diagram
![Login](/02-analysis/sequence-diagrams/Common/00-login_basic.png)

## Alternate Course of Events
### Wrong email or password
- 1.The user opens the application.
- 2.The system presents a login page and prompt the user to enter their email and password
- 3.The user enters their credentials
- 4.The system informs the user that their combination of email and password was incorrect and returns to the log-in page.

### Sequence Diagram -- Alternate Course of Events
![Login](/02-analysis/sequence-diagrams/Common/00-login_alternate_wrong.png)

## UI Sketches
This is the page that the user must be on at the start to complete the use case.
![Login](/02-analysis/UI/00-login.png) 
### Main Page
### Administrator

![Admin Main Page](../../UI/admin/01-view_all_events.png)

### Organizer
![Organizer Main Page](../../UI/organizer/17-view_all_events.png)

### User
![User Main Page](../../UI/user/34-view_all_events.png) 

## Data Outcome
- **READ** - The details of the selected account in the system will be read and display.
- **UPDATE** - The details of the selected account will be changed.