# Purchase Ticket

## Description
- This use case allows a user to purchase tickets.

## Actors
- User

## Triggers
- A user wants to purchase the target ticket.

## Preconditions
- The user is on the list upcoming events page(36-list_upcoming_events.jpg).


## Postconditions:
- The user successfully purchased a ticket, which includes the following information:
    1. Event details.
    2. Venue details.
    3. The price.
    4. The type of seat.
- The system show the purchased ticket and its details.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user select 'Buy it!' option of one event on the list upcoming events page(36-list_upcoming_events.jpg).
- The system asks the user to select the type of the ticket.
- The user select one type of this ticket.
- The user successfully purchased the ticket and the remaining number of the event minus one.
- The system displays the tickets purchased by the user.



### 02 - Alternate course of events - 


#### Insufficient Tickets.
- The user select one event from the list of events.
- The user select 'Purchase' from the button of the target event interface.
- The system asks the user to confirm.
- The user select **Yes**.
- But there is no tickets for sale.
- The system will prompt that the tickets have already been sold out. **(Synchronization issue of processes)**
#### Purchase Timeout
- The user select one event from the list of events.
- The user select 'Purchase' from the button of the target event interface.
- The system asks the user to confirm.
- The user select **No**.
- No tickets will be purchased and the system returns to the previous interface.



## Exceptions
- **System Error** : If there occur some unknown errors while purchasing tickets, the system will prompt user to try again.

### **Related UI Prototypes**
| Purchase Ticket                                                    |
|--------------------------------------------------------------------|
| ![Purchase Ticket](../../UI/user/39-purchase_ticket.jpg)           |
| Insufficient Tickets                                               |
| ![Add Venue](../../UI/user/Alternative/purchase_ticket_error1.png) |
| Purchase Timeout                                                   |
| ![Add Venue](../../UI/user/Alternative/purchase_ticket_error2.png) |

## Data Outcome
- ****
