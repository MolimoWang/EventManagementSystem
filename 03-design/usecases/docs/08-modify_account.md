# 08 Modify Account

## Basic Course of Events

### Course of Events-- Administrator Modifying Administrator Account
- The administrator is on the view all accounts page(07-view_all_accounts_administrators.png), the default selection area is "Administrator" part.
- The administrator selects "edit" option of an administrator account from list.
- The system displays the modify account page (14-edit_administrator_account.png) which shows the details of the selected account as editable fields.
- The administrator enters the updated details of the account.
- The administrator clicks "Submit" to confirm the modifications.
- A confirmation message is shown to the administrator.
- The system back to the view all accounts page(07-view_all_accounts_administrators.png) and show the updated account.

### Course of Events-- Administrator Modifying Customer Account
- The administrator is on the view all accounts page(07-view_all_accounts_administrators.png), the default selection area is "Administrator" part.
- The administrator select Customer part to see all customer accounts(07-view_all_accounts_customers.png).
- The administrator selects "edit" option of a customer account from the list.
- The system displays the modify account page (12-edit_customer_account.png) which shows the details of the selected account as editable fields.
- The administrator enters the updated details of the account.
- The administrator clicks "Submit" to confirm the modifications.
- A confirmation message is shown to the administrator.
- The system back to the view all accounts page(07-view_all_accounts_customers.png) and show the updated account.

### Course of Events-- Administrator Modifying Organiser Account
- The administrator is on the view all accounts page(07-view_all_accounts_administrators.png), the default selection area is "Administrator" part.
- The administrator select Customer part to see all organiser accounts(07-view_all_accounts_organisers.png).
- The administrator selects "edit" option of an organiser account from the list.
- The system displays the modify account page (13-edit_organizer_account.png) which shows the details of the selected account as editable fields.
- The administrator enters the updated details of the account.
- The administrator clicks "Submit" to confirm the modifications.
- A confirmation message is shown to the administrator.
- The system back to the view all accounts page(07-view_all_accounts_organisers.png) and show the updated account.


### Sequence Diagram

### Administrator Modifying Organizer Account
![Administrator Modifying Other Accounts](/02-analysis/sequence-diagrams/Common/08-administrator_modify_account_organizer.png)

### Administrator Modifying User Account
![Administrator Modifying Other Accounts](/02-analysis/sequence-diagrams/Common/08-administrator_modify_account_user.png)

### Administrator Modifying Administrator Account
![Administrator Modifying Other Accounts](/02-analysis/sequence-diagrams/Common/08-modify_account_administrator.png)

### Course of Events-- Organizer Modifying Their Accounts
- The organizer selects the "Edit" option from view account page(30-view_organizer_account).
- The system displays the modify account page(31-update_organizer_account.png):
- The organizer enters the updated details of the account.
- The organizer clicks "Save Changes" to confirm the modifications.
- The system back to the view account page(30-view_organizer_account).

### Sequence Diagram

![Organizer Modifying Their Accounts](/02-analysis/sequence-diagrams/Common/08-modify_account_organizer.png)

### Course of Events-- User Modifying Their Accounts
- The customer click the 'Account' option from the view account page(35-view_user_account.png).
- The system displays the modify account page(42-edit_user_account.png).
- The customer enters the updated details of the account.
- The customer click the 'Save' option to save the change.
- The system back to the view account page(35-view_user_account.png).

### Sequence Diagram

![User Modifying Their Accounts](/02-analysis/sequence-diagrams/Common/08-modify_account_user.png)

## Alternate Course of Events

### Invalid Password

- The administrator or user selects the modify account functionality
- The system displays the modify account page (07-modify-account) which shows the details of the selected account as editable fields
- The administrator or user enters invalid or incomplete information.
- The system prompts for corrections and prevents submission until valid data is provided.


### Sequence Diagram-- Alternate Course of Events

### Missing Required Fields

- The administrator or user selects the modify account functionality
- The system displays the modify account page (07-modify-account) which shows the details of the selected account as editable fields
- If the administrator or user submits the form with missing required fields (e.g., name, password). The system highlights the missing fields and prevents submission until user provides the necessary information.


### Sequence Diagram-- Alternate Course of Events


## UI Sketches



### Related UI Prototypes-- Administrator Modifying Other Accounts
This is the page that the user must be on at the start to complete the use case.

The administrator is on the "view all accounts" page, which has 3 lists of different types.


![View All Accounts](/02-analysis/UI/admin/07-view_all_accounts_administrators.png)


![View All Accounts](/02-analysis/UI/admin/07-view_all_accounts_organisers.png)


![View All Accounts](/02-analysis/UI/admin/07-view_all_accounts_customers.png)

![Edit User Account](/02-analysis/UI/admin/12-edit_customer_account.png)

![Edit Organizer](/02-analysis/UI/admin/13-edit_organizer_account.png)

![Edit Administrator](/02-analysis/UI/admin/14-edit_administrator_account.png)


### Related UI Prototypes-- Organizer Modifying Their Accounts

This is the page that the user must be on at the start to complete the use case.

![View Organizer Accounts](/02-analysis/UI/organizer/30-view_organizer_account.png)

![Update Organizer Account](/02-analysis/UI/organizer/31-update_organizer_account.png)


### Related UI Prototypes-- User Modifying Their Accounts
This is the page that the user must be on at the start to complete the use case.

![View User Accounts](/02-analysis/UI/customer/35-view_customer_account.png)

![Update User Account](/02-analysis/UI/customer/42-edit_customer_account.png)

## Related UI Prototypes - Alternate course of events

### Invalid Password
![Invalid Password](/02-analysis/UI/organizer/Alternative/update_organizer_account_Invalid Email or Password.png)

### Missing Required Fields
![Missing Required Fields](/02-analysis/UI/organizer/Alternative/update_organizer_account_Invalid Email or Password.png)

## Data Outcome
- **READ** - The details of the selected account in the system will be read and display.
- **UPDATE** - The details of the selected account will be changed.

