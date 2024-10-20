# 01 View All Events

## Basic Course of Events
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects the organizer account to edit.
- The system displays the current details of the organizer.
- The administrator modifies the desired fields.
- The system validates the changes and updates the account.
- A confirmation message is shown to the administrator.
### Sequence Diagram

## Alternate Course of Events
### Invalid Data
- The administrator selects an organizer account to edit.
- The system displays the current details of the organizer.
- The administrator enters invalid or incomplete information.
- The system prompts for corrections and prevents submission until valid data is provided.
### Sequence Diagram

### Organizer Not Found
- The administrator tries to select an organizer account that does not exist.
- The system displays an error message indicating that the account was not found.
### Sequence Diagram

### Conflict in Changes
- The administrator modifies an email or phone number, but it conflicts with another existing account’s data.
- The system displays an error message indicating a conflict.
- The administrator is prompted to resolve the conflict or cancel the changes.
### Sequence Diagram

## UI Sketches
