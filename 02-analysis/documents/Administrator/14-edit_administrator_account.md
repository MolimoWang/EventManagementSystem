# 14 Edit Administrator Account

## Basic Course of Events
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects the administrator account to edit.
- The system displays the administrator’s current details.
- The administrator modifies the necessary fields.
- The system validates the changes and updates the administrator account.
- A confirmation message is shown to the administrator.
### Sequence Diagram

## Alternate Course of Events
### Invalid Data
- The administrator selects aN administrator account to edit.
- The system displays the current details.
- The administrator enters invalid or incomplete information.
- The system prompts for corrections and prevents submission until valid data is provided.
### Sequence Diagram

### Administrator Not Found
- The administrator tries to select an administrator account that does not exist.
- The system displays an error message.
### Sequence Diagram

### Conflict in Changes
- The administrator modifies an email or phone number, but it conflicts with another existing account’s data.
- The system displays an error message indicating a conflict.
- The administrator is prompted to resolve the conflict or cancel the changes.
### Sequence Diagram

## UI Sketches
