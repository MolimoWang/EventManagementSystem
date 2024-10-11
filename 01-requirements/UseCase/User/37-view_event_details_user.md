# View Event Details User

## Description
- This use case allows a user to

## Actors
- User

## Triggers
- The user wants to view the details about an event.

## Preconditions
- The user must be logged into the system.
- The user needs to select one event to see its details.

## Postconditions:
- The user can see the following information:
    1. Event name, description, date, time, venue and organiser.
    2. Details about ticket:
       1. Type.
       2. Price.
       3. Number available.
       4. Number sold for each type of ticket.


## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user select 'Events' option from the event management.
- The system displays a list of all events. 
- The user selects an event from the list of events.
- The system displays the details about the target event.

#### Related UI Prototypes

### 02 - Alternate course of events - 

#### No Events
- The user select 'Events' option from the event management.
- The system prompts that there are no events.

#### Related UI Prototypes

## Exceptions
- **System Error** : If there occur some unknown errors while viewing event details, the system will prompt user to try again.

### **Related UI Prototypes**
|![2](../../UI/user/37-view_event_details_user.jpg)|