# View Purchased Tickets

## Description
- This use case allows a user to view purchased tickets in the ticket management.

## Actors
- User

## Triggers
- The user wants to view his/her purchased tickets.

## Preconditions
- The user is on their main page(34-view_all_events.png).

## Postconditions:
- The system turn to the ticket list page(40-view_purchased_tickets.png) and displays a list of the tickets purchased by the user.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user click 'Tickets' on their main page(34-view_all_events.png).
- The system turn to the ticket list page(40-view_purchased_tickets.png) and displays all the tickets purchased by the user.


### 02 - Alternate course of events - 

#### No Purchased Tickets
- The user click 'Tickets' on their main page(34-view_all_events.png).
- The system turn to the ticket list page(40-view_purchased_tickets.png) and prompts that there are no purchased tickets.



## Exceptions
- **System Error** : If there occur some unknown errors while viewing purchased tickets, the system will display an error message to the user and provide an option to retry viewing purchased tickets.
### **Related UI Prototypes**
| View Purchased Tickets                                                   |
|--------------------------------------------------------------------|
|![View Purchased Tickets](../../UI/user/40-view_purchased_tickets.png)|

Data Outcomes
READ: The details of the purchased tickets are retrieved and displayed to the user.
ERROR: An error message is displayed if there are issues retrieving the purchased tickets.