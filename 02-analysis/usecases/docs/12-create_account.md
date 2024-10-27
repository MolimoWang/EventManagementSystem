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
![create account for user](\eventmanagementsystem\02-analysis\sequence-diagrams\Administrator\12-create account-- user.png)
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
![create account for organizer](\eventmanagementsystem\02-analysis\sequence-diagrams\Administrator\12-create account-- organizer.png)
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
![create account for administrator](\eventmanagementsystem\02-analysis\sequence-diagrams\Administrator\12-create account-- administrator.png)
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
![Duplicate email error](\eventmanagementsystem\02-analysis\sequence-diagrams\Administrator\12-Create Account - Duplicate Email Error.png)
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
![Invalid input error](\eventmanagementsystem\02-analysis\sequence-diagrams\Administrator\12-Create Account - Invalid Input Error.png)

## UI Sketches
### Related UI Prototypes
！[Main Page](\eventmanagementsystem\02-analysis\UI\admin\01-view_all_events.png)
![Create User Account](../../UI/admin/08-create_user_account.png)
![Create Organizer Account](../../UI/admin/09-create_organizer_account.png)
![Create Administrator](../../UI/admin/10-create_administrator_account.png)

#### Duplicate Email Error
![Duplicate Email Error](../../UI/admin/Alternative/create_account_duplicate_email.png)
#### Invalide Input Error
![Invalide Input Error](../../UI/admin/Alternative/create_account_invalid_input.png)

