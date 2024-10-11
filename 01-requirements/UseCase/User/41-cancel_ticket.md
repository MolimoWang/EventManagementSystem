# Cancel Ticket

## Description
- This use case allows a user to cancel a ticket that has been scheduled in the ticket management.

## Actors
- User

## Triggers
- The user decides to cancel a ticket because of some reasons.

## Preconditions
- The user must be logged into the system.
- The user must cancel before the deadline of the ticket.
- The user has at least one unused ticket.

## Postconditions:
- The ticket is cancelled from the user's account.
- The remaining number of tickets for the corresponding venue will plus one.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user selects 'Cancel Ticket' option from the ticket management menu.
- The system displays a collections of tickets that can be cancelled.
- The user selects a ticket to cancel.
- The system asks the user to confirm.
- The user select **Yes**.
- The ticket is removed from the user's account.
- The remaining number of tickets for the corresponding venue will plus one.



### 02 - Alternate course of events -

#### Do not Cancel
- The user selects 'Cancel Ticket' option from the ticket management menu.
- The system displays a collections of tickets that can be cancelled.
- The user selects a ticket to cancel.
- The system asks the user to confirm.
- The user select **No**.
- No tickets will be cancelled and the system returns to the previous interface.

#### Do not Have Tickets to be Cancelled.
- The system shows that there are no tickets that can be cancelled.

#### Ticket Exceeds Cancellation Deadline
- The user selects 'Cancel Ticket' option from the ticket management menu.
- The system displays a collection of tickets that can be cancelled.
- The user selects a ticket to cancel.
- The system checks the ticket’s eligibility for cancellation and determines that the cancellation deadline has passed.
- The system displays a message indicating that the selected ticket cannot be cancelled because it has exceeded the cancellation deadline.
- The system returns to the previous interface without cancelling any tickets.


## Exceptions
- **System Error** : If there occur some unknown errors while cancelling tickets, the system will prompt user to try again.

### **Related UI Prototypes**
| Cancel Ticket                                             |
|-----------------------------------------------------------|
| ![Cancel Ticket](../../UI/user/41-cancel_ticket.png)      |
|   Ticket Exceeds Cancellation Deadline                                                        |
| ![Ticket Exceeds Cancellation Deadline](../../UI/user/Alternative/cancel_ticket.png) |