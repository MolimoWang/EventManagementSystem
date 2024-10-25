# Use Case: Modify Account

## Description
- Allows the users to change the details of an account in the system. Note that the email address cannot be changed.

## Actors
- Administrator, User, Organiser

## Triggers
- This use case is triggered when the details of an account need to be changed.

## Preconditions
- The administrator is on the view all accounts page(07-view_all_accounts.png).
- The organizer is on view account page(30-view_organizer_account.png).
- The user is on view account page(35-view_user_account.png).

## Postconditions
- The user’s account details are updated in the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events-- Administrator Modifying Other Accounts
- The administrator is on the view all accounts page(07-view_all_accounts.png).
- The administrator selects the account to edit.
- The system displays the modify account page (12-edit_user_account.png,13-edit_organizer_account.png,14-edit_administrator_account.png) which shows the details of the selected account as editable fields.
- The administrator enters the updated details of the account.
- The administrator clicks "Submit" to confirm the modifications.
- A confirmation message is shown to the administrator.
- The system back to the view all accounts page(07-view_all_accounts.png)and show the updated account.

#### Course of Events-- Organizer Modifying Their Accounts
- The organizer selects the "Edit" option from view account page(30-view_organizer_account).
- The system displays the modify account page(31-update_organizer_account.png):
- The organizer enters the updated details of the account.
- The organizer clicks "Save Changes" to confirm the modifications.
- The system back to the view account page(30-view_organizer_account).
- 
#### Course of Events-- User Modifying Their Accounts
- The user click the 'Account' option from the view account page(35-view_user_account.png).
- The system displays the the modify account page(42-edit_user_account.png).
- The user can change at most two things:
   1. Name.
   2. Password.
- The user click the 'Save' option to save the change.
- The system back to the view account page(35-view_user_account.png).
- 
### 02 - Alternate course of events -

#### Invalid Password
- The administrator or user selects the modify account functionality
- The system displays the modify account page (07-modify-account) which shows the details of the selected account as editable fields
- The administrator or user enters invalid or incomplete information.
- The system prompts for corrections and prevents submission until valid data is provided.
#### Missing Required Fieldss
- The administrator or user selects the modify account functionality
- The system displays the modify account page (07-modify-account) which shows the details of the selected account as editable fields
- If the administrator or user submits the form with missing required fields (e.g., name, password). The system highlights the missing fields and prevents submission until user provides the necessary information.


### Related UI Prototypes-- Administrator Modifying Other Accounts
![Edit User Account](../../UI/admin/12-edit_user_account.png)
![Edit Organizer](../../UI/admin/13-edit_organizer_account.png)
![Edit Administrator](../../UI/admin/14-edit_administrator_account.png)
### Related UI Prototypes-- Organizer Modifying Their Accounts
![Update Organizer Account](../../UI/organizer/31-update_organizer_account.png)
### Related UI Prototypes-- User Modifying Their Accounts
![Update User Account](../../UI/user/42-edit_user_account.png)

## Related UI Prototypes - Alternate course of events
### Invalid Password
![Invalid Password](../../UI/organizer/Alternative/update_organizer_account_Invalid%20Email%20or%20Password.png)
### Missing Required Fields
![Missing Required Fields](../../UI/organizer/Alternative/update_organizer_account_Missing%20Required%20Fields.png)

## Data Outcome
- **READ** - The details of the selected account in the system will be read and display.
- **UPDATE** - The details of the selected account will be changed.
