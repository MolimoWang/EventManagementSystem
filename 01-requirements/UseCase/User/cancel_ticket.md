# Cancel Ticket

## Description
- This use case allows a user to cancel a ticket that has been scheduled in the ticket management.

## Actors
- User

## Triggers
- The user decides to cancel a ticket because of some reasons.

## Preconditions
- The user is on the ticket list page(40-view_purchased_tickets.png).

## Postconditions:
- The system updates and displays the ticket list page(40-view_purchased_tickets.png) with this ticket removed.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user selects 'Cancel' option of a ticket from their ticket list(on the ticket list page(40-view_purchased_tickets.png).).
- The system asks the user to confirm.
- The user select **Yes**.
- The system updates and displays the ticket list page(40-view_purchased_tickets.png) with this ticket removed.



### 02 - Alternate course of events -

#### Do not Cancel
- The user selects 'Cancel' option of a ticket from their ticket list(on the ticket list page(40-view_purchased_tickets.png).).
- The system asks the user to confirm.
- The user select **No**.
- The system back to the ticket list page(40-view_purchased_tickets.png).

#### Do not Have Tickets to be Cancelled.
- The user selects 'Cancel Ticket' option from the ticket management menu.
- The system checks the user's account for any cancellable tickets.
- The system shows that there are no tickets that can be cancelled.

#### Ticket Exceeds Cancellation Deadline
- The user selects 'Cancel' option of a ticket from their ticket list(on the ticket list page(40-view_purchased_tickets.png).).
- The system asks the user to confirm.
- The user select **Yes**.
- The system displays a message indicating that the selected ticket cannot be cancelled because it has exceeded the cancellation deadline.



## Exceptions
- **System Error** : If there occur some unknown errors while cancelling tickets, the system will prompt user to try again.

### **Related UI Prototypes**
| Cancel Ticket                                             |
|-----------------------------------------------------------|
| ![Cancel Ticket](../../UI/user/41-cancel_ticket.png)      |
|   Ticket Exceeds Cancellation Deadline                                                        |
| ![Ticket Exceeds Cancellation Deadline](../../UI/user/Alternative/cancel_ticket.png) |

##  Data Outcomes
- **UPDATE** - The system will update the user's account by removing the cancelled ticket.
- **UPDATE** - The remaining number of tickets for the corresponding venue will be incremented by one.
- **READ** - The system will display a collection of tickets that are eligible for cancellation.
- **READ** - If no tickets are available for cancellation, the system will display a message indicating no cancellable tickets.
- **READ** - If the cancellation deadline has passed, the system will display a message indicating that the ticket cannot be cancelled.
