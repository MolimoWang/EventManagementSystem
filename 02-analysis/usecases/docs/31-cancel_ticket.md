# Cancel Ticket

## Basic Course of Events
- The user selects 'Cancel' option of a ticket from their ticket list(on the ticket list page(40-view_purchased_tickets.png).).
- The system asks the user to confirm.
- The user select **Yes**.
- The system updates and displays the ticket list page(40-view_purchased_tickets.png) with this ticket removed.

### Sequence Diagram

## Alternate Course of Events
### Do not Cancel
- The user selects 'Cancel' option of a ticket from their ticket list(on the ticket list page(40-view_purchased_tickets.png).).
- The system asks the user to confirm.
- The user select **No**.
- The system back to the ticket list page(40-view_purchased_tickets.png).
### Sequence Diagram--Alternate Course of Events

#### Ticket Exceeds Cancellation Deadline
- The user selects 'Cancel' option of a ticket from their ticket list(on the ticket list page(40-view_purchased_tickets.png).).
- The system asks the user to confirm.
- The user select **Yes**.
- The system displays a message indicating that the selected ticket cannot be cancelled because it has exceeded the cancellation deadline.


### Sequence Diagram--Alternate Course of Events


### Do not Cancel
In this case, all interactions are completed within the javascript of the view majors page. No request is made to the server and no response is received.
### Ticket Exceeds Cancellation Deadline

## UI Sketches
