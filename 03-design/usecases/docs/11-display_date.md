# 11 Display Date

## Basic Course of Events

### Course of Events-- Administrator
1. The administrator is on their main page(01-main_page_administrator.png).
2. The administrator enters the date they want to view.
3. The system displays the events scheduled for that date, including details such as event name, time, and venue(01-main_page_administrator.png).

### Sequence Diagram
![Date](/03-design/sequence-diagrams/Common/11-administrator_display_date.png)





### Course of Events-- Customer
1. The user is on their main page(34-main_page_customer.png).
2. The user enters the date they want to view.
3. The system displays the events scheduled for that date, including details such as event name, time, and venue(34-main_page_customer.png).

### Sequence Diagram

![Display Date](/03-design/sequence-diagrams/Common/11-customer_display_date.png)





### Course of Events-- Organizer
1. The organizer is on their main page(17-main_page_organiser.png).
2. The organizer enters the date they want to view.
3. The system displays the events scheduled for that date, including details such as event name, time, and venue(17-main_page_organiser.png).

### Sequence Diagram

![Display date](/03-design/sequence-diagrams/Common/11-organizer_display_date.png)

## UI Sketches

### Administrator
This is the page that the user must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/admin/01-main_page_administrator.png)

### Select Date
![Select Date](/02-analysis/UI/customer/33-display_date.png)

### Selected Date Events
![Selected Date Events](/02-analysis/UI/admin/01-main_page_administrator.png)

- **Tips: The events table on the main page shows all the events for the day.**

### Organizer
There the pages that the user must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/organizer/17-main_page_organiser.png)

### Select Date
![Select Date](/02-analysis/UI/customer/33-display_date.png)

### Selected Date Events
![Selected Date Events](/02-analysis/UI/organizer/17-main_page_organiser.png)

- **Tips: The events table on the main page shows all the events for the day.**

### User
There the pages that the user must be on at the start to complete the use case.

### Main Page
![Main Page](/02-analysis/UI/customer/34-main_page_customer.png)

### Select Date
![Select Date](/02-analysis/UI/customer/33-display_date.png)

### Selected Date Events
![Selected Date Events](/02-analysis/UI/customer/34-main_page_customer.png)


- **Tips: The events table on the main page shows all the events for the day.**

## Data Outcome
- **READ** - The corresponding events in the system will be read and display.
