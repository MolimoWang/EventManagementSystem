# View Purchased Tickets

## Description
- This use case allows a user to view purchased tickets in the ticket management.

## Actors
- User

## Triggers
- The user wants to view his/her purchased tickets.

## Preconditions
- The user must be logged into the system.
- The user must have purchased tickets before.

## Postconditions:
- The system displays a list of the tickets purchased by the user.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user click 'Purchased' in the account management.
- The system displays all the tickets purchased by the user.
- The user can select a ticket from the list of purchased tickets to view.
- The user can also view the following information:
    1. Event details.
    2. Venue details.
    3. The price.
    4. The type of seat.



### 02 - Alternate course of events - 

#### No Purchased Tickets
- The user click 'Purchased' in the account management.
- The system prompts that there are no purchased tickets.



## Exceptions
- **System Error** : If there occur some unknown errors while viewing purchased tickets, the system will prompt user to try again.

### **Related UI Prototypes**
| View Purchased Tickets                                                   |
|--------------------------------------------------------------------|
|![View Purchased Tickets](../../UI/user/40-view_purchased_tickets.png)|