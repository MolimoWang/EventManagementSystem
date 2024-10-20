# 15 Disable Account

## Basic Course of Events
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects the account to disable.
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The account is disabled and cannot log in.
- A confirmation message is shown to the administrator.
### Sequence Diagram

## Alternate Course of Events
### Do Not Disable
- The administrator selects an account to disable.
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system returns to the previous interface, and no action is taken.
### Sequence Diagram

### Account Already Disabled
- The administrator selects an account to disable, but the account is already disabled.
- The system displays a message indicating the account is already inactive.
### Sequence Diagram

### Account Not Found
- The administrator tries to disable an account that does not exist.
- The system displays an error message.
### Sequence Diagram

## UI Sketches
