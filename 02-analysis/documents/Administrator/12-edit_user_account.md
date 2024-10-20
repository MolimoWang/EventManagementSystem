# 12 Edit User Account

## Basic Course of Events

- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects the account to edit.
- The system displays the user’s current details.
- The administrator modifies the necessary fields.
- The system validates the changes and updates the account.
- A confirmation message is shown to the administrator.

#### Sequence Diagram

## Alternate Course of Events

### Invalid Data
- The administrator selects a user account to edit.
- The system displays the current details.
- The administrator enters invalid or incomplete information.
- The system prompts for corrections and prevents submission until valid data is provided.
#### Sequence Diagram

### User Not Found
- The administrator tries to select a user account that does not exist.
- The system displays an error message.
#### Sequence Diagram

### Conflict in Changes
- The administrator modifies an email or phone number, but it conflicts with another existing account’s data.
- The system displays an error message indicating a conflict.
- The administrator is prompted to resolve the conflict or cancel the changes.
#### Sequence Diagram

## UI Sketches
