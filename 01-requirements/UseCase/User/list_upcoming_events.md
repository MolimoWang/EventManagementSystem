# List Upcoming Events

## Description
- This use case allows a user to view upcoming events.

## Actors
- User

## Triggers
- The user wants to see the upcoming events.

## Preconditions
- The user is on their main page(34-view_all_events.png).

## Postconditions:
- The system turn to list upcoming events page(36-list_upcoming_events.jpg) and displays the user's upcoming events.


## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user select 'Upcoming' option from the main page(34-view_all_events.png).
- The system turn to list upcoming events page(36-list_upcoming_events.jpg) and displays the user's upcoming events.



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

## Data Outcome
- **READ** - The list of the all upcoming events will be read and displayed.
