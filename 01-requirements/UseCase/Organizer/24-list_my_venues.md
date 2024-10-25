# Use Case: List My Venues

## Description
This use case allows an organizer to view all the venues that the organizer created.
## Actors
- Organizer

## Triggers
- The organizer wants to see all the venues that the organizer created.

## Preconditions
- The organizer is on main page (17-view_all_events)

## Postconditions
- The system displays a list of venues created by the organizer.
## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "My Venues" option from the main page.
2. The system turn my venues page(25-list_my_venues.png) to the displays a list of all the venues created.


### 02 - Alternate course of events
#### No Venues Found
- If the organizer has not created any venues, the system displays a message indicating that no venues are available.

## Exceptions
- **System Error**: If a system error occurs while retrieving all the venues created, the system displays an error message and prompts the organizer to try again later.

#### Related UI Prototypes
| All My Venues Page                                       |
|----------------------------------------------------------|
| ![List Venues](../../UI/organizer/25-list_my_venues.png) |

## Data Outcome
- **READ** - All created venues of this organizer will be read and displayed.
