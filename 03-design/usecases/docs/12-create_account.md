# 01 Create Account

## Basic Course of Events-- Creating User
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays three different types of user lists based on the administrator's selection at "view all accounts page".(07-view_all_accounts_administrators.png)(07-view_all_accounts_customers.png)(07-view_all_accounts_organisers.png)
- The administrator selects 'New Account'.
- The administrator selects the type of account.
- The system presents a form for entering account information.
- The administrator fills out the information.
- The system display the "view all accounts" page with a new account.(07-view_all_accounts_administrators.png)(07-view_all_accounts_customers.png)(07-view_all_accounts_organisers.png)


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
![Duplicate email error](/03-design/sequence-diagrams/Administrator/12-create_account-Alternate_Duplicate_Email.png)

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
![Invalid input error](/03-design/sequence-diagrams/Administrator/12-create_account-Alternate_Invalid_Input.png)

## UI Sketches

### Related UI Prototypes

![Main Page](/02-analysis/UI/admin/01-main_page_administrator.png)

![All Administrator](/02-analysis/UI/admin/07-view_all_accounts_administrators.png)
![All Customers](/02-analysis/UI/admin/07-view_all_accounts_customers.png)
![All Organisers](/02-analysis/UI/admin/07-view_all_accounts_organisers.png)

![Create User Account](/02-analysis/UI/admin/08-create_customer_account.png)

![Create Organizer Account](/02-analysis/UI/admin/09-create_organizer_account.png)

![Create Administrator](/02-analysis/UI/admin/10-create_administrator_account.png)

### Duplicate Email Error
![Duplicate Email Error](/02-analysis/UI/admin/Alternative/create_account_duplicate_email.png)

### Invalide Input Error
![Invalid Input Error](/02-analysis/UI/admin/Alternative/create_account_invalid_input.png)

## Data Outcome
- **Create** - The account will be displayed and added into the system.