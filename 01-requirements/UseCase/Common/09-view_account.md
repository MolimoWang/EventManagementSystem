# View Account Use Case

## Description
Allows the administrator or user to view the details of an account in the system

## Actors
- Administrator, User, Organiser

## Triggers
- This use case is triggered when the administrator or user needs to view the details of an account in the system

## Preconditions
-  The administrator is on the view all accounts page(07-view_all_accounts.png).
-  The organizer is on their main page(17-view_all_events.png).
-  The user is on their main page(34-view_all_events.png).

## Postconditions
- The user is shown the view account page (30-view_organizer_account.png,35-view_user_account.png) which shows the details of the selected account.

## Courses of Events

### 01 - Basic course of events

#### Course of Events-- Administrator Viewing Other Accounts
- The administrator click a specific account at view all accounts page(07-view_all_accounts.png).
- The system displays the view account page (30-view_organizer_account.png,35-view_user_account.png) which shows the details of the selected account

#### Course of Events-- Any User Viewing Their Account
- The organizer or user is on their main page(17-view_all_events.png,34-view_all_events.png) and press **Account** button.
- The system displays the view account page (30-view_organizer_account.png,35-view_user_account.png) which shows the details of the selected account

### 02 - Alternate course of events

#### No Events Available
- If there are no past or future events associated with the organizer, the system displays an empty state message, such as "No Events Available".

## Exceptions
- **System Error**: If a system error occurs while retrieving the account details or event information, the system displays an error message and prompts the organizer to try again later.
## Related UI Prototypes-- Administrator Viewing Other Accounts
![Edit User Account](../../UI/admin/12-edit_user_account.png)
![Edit Organizer](../../UI/admin/13-edit_organizer_account.png)
![Edit Administrator](../../UI/admin/14-edit_administrator_account.png)

## Related UI Prototypes-- Organizer Viewing Their Account

 ![View Organizer Account](../../UI/organizer/30-view_organizer_account.png) 
## Related UI Prototypes-- User Viewing Their Account
![View User Account  ](../../UI/user/35-view_user_account.png)

## Data Outcome
- **READ** - The details of an account in the system will be read and display.
