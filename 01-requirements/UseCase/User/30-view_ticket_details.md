# View Ticket Details

## Description
- This use case allows a user to check the information of the ticket they have purchased.

## Actors
- User

## Triggers
- The user decides to check the information of a ticket because of some reasons.

## Preconditions
- The user is on the ticket list page(40-view_purchased_tickets.png).

## Postconditions:
- The system turn to the ticket information page(37-view_ticket_details_user.png).

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user selects 'View' option of a ticket from their ticket list(on the ticket list page(40-view_purchased_tickets.png).).
- The system turn to the ticket information page(37-view_ticket_details_user.png).


### 02 - Alternate course of events -
-None.

## Exceptions
- **System Error** : If there occur some unknown errors while cancelling tickets, the system will prompt user to try again.

### **Related UI Prototypes**
| Ticket Information                                              |
|-----------------------------------------------------------------|
| ![Cancel Ticket](../../UI/user/37-view_ticket_details_user.png) |

##  Data Outcomes
- **READ** - The system will display a collection of a ticket information.
