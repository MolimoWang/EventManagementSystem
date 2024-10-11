# Search Filter events

## Description
- This use case allows a user to search target events based on **Name**.

## Actors
- User

## Triggers
- The user wants to see events with specific names.

## Preconditions
- The user must be logged into the system.
- The user has participated in at least one event. 

## Postconditions:
- The system displays events that meet the criteria for the user to view.

## Courses of Events

### 01 - Basic course of events -
#### Course of Events
- The user inputs the name of the event they want to search for in the filter box.
- The user click the 'Search' button.
- The system displays the search results.
- The user can view the displayed event information.



### 02 - Alternate course of events - 

#### No Matching Events
- The user inputs the name of the event they want to search for in the filter box.
- The user click the 'Search' button.
- The system prompts that no event information that meets the criteria was found.



## Exceptions
- **System Error** : If there occur some unknown errors while searching events, the system will prompt user to try again.

### **Related UI Prototypes**
| Search Filter Events                                               |
|--------------------------------------------------------------------|
| ![Search Filter Events](../../UI/user/38-search_filter_events.png) |