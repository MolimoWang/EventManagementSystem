# 15 Delete Account

## Basic Course of Events
#### Course of Events
- The administrator selects an account to delete on view all accounts page(7-view_all_accounts.png).
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The system update the view all accounts page(7-view_all_accounts.png) with this account deleted.

### Sequence Diagram

## Alternate Course of Events

#### Do Not Delete
- The administrator selects an account to delete on view all accounts page(7-view_all_accounts.png).
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system returns to the view all accounts page(7-view_all_accounts.png) with no changes.

### Sequence Diagram-- Alternate Course of Events

#### Event Not Found
- The administrator tries to delete an event that no longer exists.
- The system displays an error message.

### Sequence Diagram-- Alternate Course of Events

## UI Sketches
This is the page that the user must be on at the start to complete the use case.
![Delete Account](\eventmanagementsystem\02-analysis\UI\admin\16-delete_account.png)