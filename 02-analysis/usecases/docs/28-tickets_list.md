# 28 View Purchased Tickets

## Basic Course of Events
- The user clicks 'Tickets' on their main page (34-view_all_events.png).
- The system turns to the ticket list page (40-view_purchased_tickets.png) and displays all tickets purchased by the user.
- The system retrieves the purchased tickets associated with the user's email from the database.
- If there are purchased tickets, the system proceeds to display them on the ticket list page.

### Sequence Diagram
![View Purchased Tickets](/02-analysis/sequence-diagrams/User/28-tickets_list.png)

## Alternate Course of Events

### No Purchased Tickets
- The user clicks 'Tickets' on their main page (34-view_all_events.png).
- The system turns to the ticket list page (40-view_purchased_tickets.png) and requests the purchased tickets associated with the user's email.
- The service checks for any purchased tickets associated with the user and finds none.
- The system displays a message to the user indicating that there are no purchased tickets.

### Sequence Diagram -- Alternate Course of Events
![No Purchased Tickets](/02-analysis/sequence-diagrams/User/28-tickets_list_empty.png)

## UI Sketches

### Main Page
This is the page where the user clicks on 'Tickets' to view their purchased tickets.

![Main Page](/02-analysis/UI/customer/34-view_all_events.png)

### Ticket List Page
This page displays all the tickets purchased by the user. If there are no purchased tickets, a message will indicate that there are no tickets available.

![Ticket List Page](/02-analysis/UI/customer/40-view_purchased_tickets.png)
