# Use Case: Create Account

## Description
- This use case allows an administrator to create a new account in the system. 
- The administrator can choose to create one of three types of accounts: User, Organizer, or Administrator.
## Actors
- Administrator

## Triggers
- The administrator decides to create a new user account, an organizer account, or an administrator account in the system.


## Preconditions
- The administrator is on view all accounts page(7-view_all_accounts.png).


## Postconditions
- A new account is created in the system.(User, Organizer, or Administrator)

## Courses of Events

### 01 - Basic course of events -

#### Course of Events-- Creating User
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects 'New Account'.
- The administrator selects the type of account : User.
- The system presents a form for entering account information (Name, Email, Password).
- The administrator fills out the information.
- The system validates the change and updates this new user account.
- A confirmation message is shown to the administrator.

#### Course of Events-- CreatingOrganizer
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects 'New Account'.
- The administrator selects the type of account : Organizer.
- The system presents a form for entering account information (Name, Email, Password, Address, Company Name, Phone Number).
- The administrator fills out the information.
- The system validates the change and updates this new organizer account.
- A confirmation message is shown to the administrator.

#### Course of Events-- Creating Administrator
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects 'New Account'.
- The administrator selects the type of account : Administrator.
- The system presents a form for entering account information (Name, Email, Password).
- The administrator fills out the information.
- The system validates the change and updates this new administrator account.
- A confirmation message is shown to the administrator.
### 02 - Alternate course of events -

#### Duplicate Email Address
- The administrator submits the form using an email that already exists in the system.
- The system displays an error message indicating that the email is already associated with another account.
- The system prompts the administrator to use a different email or to edit the existing account instead.

#### Invalid Input
- The administrator submits the form with invalid data (e.g., improper email format, password not meeting security requirements).
- The system displays an error message explaining the issue (e.g., "Invalid email format" or "Password must contain at least 8 characters").
- The system prompts the administrator to correct the input and resubmit.


### Related UI Prototypes
![Create User Account](../../UI/admin/08-create_user_account.png)
![Create Organizer Account](../../UI/admin/09-create_organizer_account.png)
![Create Administrator](../../UI/admin/10-create_administrator_account.png)
#### Duplicate Email Error
![Duplicate Email Error](../../UI/admin/Alternative/create_account_duplicate_email.png)
#### Invalide Input Error
![Invalide Input Error](../../UI/admin/Alternative/create_account_invalid_input.png)

## Data Outcomes
- **CREATE** - Administrator can create one of three types of accounts: User, Organizer, or Administrator. 
- **READ** - Adnubustrator could read wether the account is successfully created or not.
