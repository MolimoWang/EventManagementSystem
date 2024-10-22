# Use Case: View All Accounts

## Description
- This use case allows the administrator to view a list of all accounts (administrators, organizers, and users).

## Actors
- Administrator

## Triggers
- The administrator decides to view all existing accounts in the system.

## Preconditions
- The administrator is on main page(01-view_all_events.png).

## Postconditions
- The administrator turn to view all accounts page(07-view_all_accounts.png).
- The administrator can view the list of all accounts in the system at this page.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator selects 'View All Accounts' from the main page(01-view_all_events.png).
- - The administrator turn to view all accounts page(07-view_all_accounts.png).
- The system retrieves and displays a list of all existing accounts (administrators, organizers, users).


### 02 - Alternate course of events -

#### No Accounts Found
- The system shows that no accounts exist in the system.

#### Related UI Prototypes
![View All Accounts](../../UI/admin/07-view_all_accounts.png)
