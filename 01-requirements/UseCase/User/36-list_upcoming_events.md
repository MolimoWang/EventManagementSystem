# List Upcoming Events

## Description
- This use case allows a user to view upcoming events.

## Actors
- User

## Triggers
- The user wants to see the upcoming events.

## Preconditions
- The user must be logged into the system.
- The system has at least one upcoming event.

## Postconditions:
- The system displays the user's upcoming events.
- The user can select the events they want to see.
- The user can select 'Buy it' button to buy the ticket.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user select 'Upcoming' option from the user management menu.
- The system displays a list of upcoming events.


### 02 - Alternate course of events -

#### Do Not Have Upcoming Events
- The user select 'Upcoming' option from the user management menu.
- The system prompts the user that there is no upcoming events.



## Exceptions
- **System Error** : If there occur some unknown errors while listing upcoming events, the system will prompt user to try again.

### **Related UI Prototypes**
| List Upcoming Events                                   |
|----------------------------------------------------------|
|![List Upcoming Events](../../UI/user/36-list_upcoming_events.jpg)|