# Use Case: Edit Account Permission

## Description
- This use case allows an administrator to create a new organizer account in the system. The administrator can choose to create one of three types of accounts: User, Organizer, or Administrator.
## Actors
- Administrator

## Triggers
- The administrator decides to create a new organizer account in the system.

## Preconditions
- The administrator must be logged into the system.


## Postconditions
- A new organizer account is created in the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects 'New Account'.
- The administrator selects the type of account : Organizer.
- The system presents a form for entering account information (Name, Email, Password, Address, Company Name, Phone Number).
- The administrator fills out the information.
- The system validates the change and updates this new organizer account.
- A confirmation message is shown to the administrator.

#### Related UI Prototypes
- Account permission edit form

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
![Create Organizer Account](../../UI/admin/09-create_organizer_account.png)
#### Duplicate Email Error
![Duplicate Email Error](../../UI/admin/Alternative/create_account_duplicate_email.png)
#### Invalide Input Error
![Invalide Input Error](../../UI/admin/Alternative/create_account_invalid_input.png)

