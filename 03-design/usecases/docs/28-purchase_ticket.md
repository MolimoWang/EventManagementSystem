# 28 User Purchase Ticket

## Basic Course of Events
- The user selects 'Buy it!' option for an event on the list upcoming events page (36-list_upcoming_events.jpg).
- The system asks the user to select the type of ticket.
- The user selects a type of ticket.
- The system forwards the purchase request to the TicketService.
- The service checks the availability of the selected ticket type.
- If tickets are available, the system proceeds with the purchase by updating ticket information and creating a ticket entity.
- The system displays the tickets purchased by the user.

### Sequence Diagram

![User Purchase Ticket](/03-design/sequence-diagrams/Customer/28-purchase_ticket-basic.png)

## Alternate Course of Events

### Insufficient Tickets
- The user selects an event from the list of events.
- The system displays the event interface with a 'Purchase' option.
- The user selects 'Purchase'.
- The system asks the user to confirm.
- The user selects **Yes** to confirm the purchase.
- The service checks ticket availability and finds no tickets are available (due to synchronization issues).
- The system prompts the user that the tickets are sold out.



## UI Sketches

### List Upcoming Events Page
This page displays a list of upcoming events, allowing the user to select 'Buy it!' for ticket purchase.

![List Upcoming Events](/02-analysis/UI/customer/36-list_upcoming_events.png)

### Ticket List Page
This page shows the tickets purchased by the user after a successful purchase.

![Ticket List Page](/02-analysis/UI/customer/40-view_purchased_tickets.png)
