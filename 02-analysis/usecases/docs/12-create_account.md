# 01 Create Account

## Basic Course of Events-- Creating User
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects 'New Account'.
- The administrator selects the type of account : User.
- The system presents a form for entering account information (Name, Email, Password).
- The administrator fills out the information.
- The system validates the change and updates this new user account.
- A confirmation message is shown to the administrator.

### Sequence Diagram
![create account for user](/02-analysis/sequence-diagrams/Administrator/12-create_account_user.png)

## Basic Course of Events-- Creating Organizer
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects 'New Account'.
- The administrator selects the type of account : Organizer.
- The system presents a form for entering account information (Name, Email, Password, Address, Company Name, Phone Number).
- The administrator fills out the information.
- The system validates the change and updates this new organizer account.
- A confirmation message is shown to the administrator.

### Sequence Diagram

![create account for organizer](/02-analysis/sequence-diagrams/Administrator/12-create_account_organizer.png)

## Basic Course of Events-- Creating Administrator
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects 'New Account'.
- The administrator selects the type of account : Administrator.
- The system presents a form for entering account information (Name, Email, Password).
- The administrator fills out the information.
- The system validates the change and updates this new administrator account.
- A confirmation message is shown to the administrator.

### Sequence Diagram
![create account for administrator](/02-analysis/sequence-diagrams/Administrator/12-create_account_administrator.png)

## Alternate Course of Events-- Duplicate Email Error
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects 'New Account'.
- The administrator selects the type of account : Administrator.
- The system presents a form for entering account information (Name, Email, Password).
- The administrator fills out the information.
- The administrator submits the form using an email that already exists in the system.
- The system displays an error message indicating that the email is already associated with another account.
- The system prompts the administrator to use a different email or to edit the existing account instead.

### Sequence Diagram
![Duplicate email error](/02-analysis/sequence-diagrams/Administrator/12-create_account_Duplicate_Email_Error.txt.png)

## Alternate Course of Events-- Invalid Input Error

- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects 'New Account'.
- The administrator selects the type of account : Administrator.
- The system presents a form for entering account information (Name, Email, Password).
- The administrator fills out the information.
- The administrator submits the form with invalid data (e.g., improper email format, password not meeting security requirements).
- The system displays an error message explaining the issue (e.g., "Invalid email format" or "Password must contain at least 8 characters").
- The system prompts the administrator to correct the input and resubmit.

### Sequence Diagram
![Invalid input error](/02-analysis/sequence-diagrams/Administrator/12-create_account_Invalid_Input_Error.txt.png)

## UI Sketches

### Related UI Prototypes

![Main Page](/02-analysis/UI/admin/01-main_page_administrator.png)

![View all accounts](/02-analysis/UI/admin/07-view_all_accounts.png)

![Create User Account](/02-analysis/UI/admin/08-create_customer_account.png)

![Create Organizer Account](/02-analysis/UI/admin/09-create_organizer_account.png)

![Create Administrator](/02-analysis/UI/admin/10-create_administrator_account.png)

### Duplicate Email Error
![Duplicate Email Error](/02-analysis/UI/admin/Alternative/create_account_duplicate_email.png)

### Invalide Input Error
![Invalid Input Error](/02-analysis/UI/admin/Alternative/create_account_invalid_input.png)

