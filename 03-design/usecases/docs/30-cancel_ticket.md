# 30 User Cancel Ticket

## Basic Course of Events
- The user selects 'Cancel' option for a ticket on their ticket list page (40-view_purchased_tickets.png).
- The system asks the user to confirm cancellation.
- The user selects **Yes** to confirm the cancellation.
- The system forwards the cancellation request to the TicketService.
- The service checks if the cancellation is within the allowed time frame.
- If cancellation is allowed, the system proceeds to cancel the ticket, update ticket availability, and adjust the sold count.
- The system updates and displays the ticket list page with the canceled ticket removed.

### Sequence Diagram

![User Cancel Ticket](/03-design/sequence-diagrams/Customer/30-cancel_ticket-basic.png)

## Alternate Course of Events

### Exceeds Cancellation Deadline
- The user selects 'Cancel' option for a ticket on their ticket list page.
- The system asks the user to confirm cancellation.
- The user selects **Yes** to confirm.
- The service checks if the cancellation is within the allowed time frame and finds the deadline has passed.
- The system displays a message indicating that the ticket cannot be cancelled due to exceeding the deadline.

### Sequence Diagram -- Alternate Course of Events
![Exceeds Cancellation Deadline](/02-analysis/sequence-diagrams/User/31-cancel_ticket_deadline.png)

### Do Not Cancel
- The user selects 'Cancel' option for a ticket on their ticket list page.
- The system asks the user to confirm cancellation.
- The user selects **No** to decline the cancellation.
- The system returns to the ticket list page without making any changes.

### Sequence Diagram -- Alternate Course of Events
![Do Not Cancel](/02-analysis/sequence-diagrams/User/31-cancel_ticket_no.png)

## UI Sketches

### Ticket List Page
This is the page where the user can see their purchased tickets and select the 'Cancel' option to remove a ticket if needed.

![Ticket List Page](/02-analysis/UI/customer/40-view_purchased_tickets.png)
