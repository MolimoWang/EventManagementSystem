# Use Case: View My Venues

## Description
This use case allows an organizer to view all the venues that the organizer created.
## Actors
- Organizer

## Triggers
- The organizer wants to see all the venues that the organizer created.

## Preconditions
- The organizer is on main page (17-view_all_events) (这个UI图可能要修改一下，可能要加上一个看全部场馆的按钮吧).

## Postconditions
- 这个后置条件我没想出来有啥.
## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "All My Venues" option from the main page.
2. The system displays a list of all the venues created.


### 02 - Alternate course of events
- None.

## Exceptions
- **System Error**: If a system error occurs while retrieving all the venues created, the system displays an error message and prompts the organizer to try again later.

#### Related UI Prototypes
| All My Venues Page                                              |
|-----------------------------------------------------------------------|
| ![]() |

## Data Outcome
- **READ** - All created venues of this organizer will be read and displayed.
