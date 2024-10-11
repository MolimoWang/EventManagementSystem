# Purchase Ticket

## Description
- This use case allows a user to purchase tickets.

## Actors
- User

## Triggers
- A user wants to participant in some venues and needs to purchase the target ticket.

## Preconditions
- The user must be logged into the system.
- The user select one event to purchase its ticket.
- The user can only buy tickets for events that have not yet started.

## Postconditions:
- The number of the remaining tickets for the corresponding event minus one.
- The user can see the purchased ticket and its details.
- The user successfully purchased a ticket, which includes the following information:
    1. Event details.
    2. Venue details.
    3. The price.
    4. The type of seat.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user select one event from the list of events.
- The user select 'Purchase' from the button of the target event interface.
- The system asks the user to confirm.
- The user select **Yes**.
- The user successfully purchased the ticket and the remaining number of the event minus one.
- The user can see the ticket details in the ticket system.



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