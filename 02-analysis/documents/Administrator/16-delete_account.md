# 16 Delete Account

## Basic Course of Events
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects an account to delete.
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The account is deleted.
- A confirmation message is shown to the administrator.
### Sequence Diagram

## Alternate Course of Events
### Do Not Delete
- The administrator selects an event to delete.
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system returns to the previous interface, and no event is deleted.
### Sequence Diagram

### Event Not Found
- The administrator tries to delete an event that no longer exists.
- The system displays an error message.
### Sequence Diagram

## UI Sketches
