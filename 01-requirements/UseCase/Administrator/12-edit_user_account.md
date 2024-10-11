# Use Case: Edit User Account

## Description
- This use case describes the process of an administrator editing a user account.

## Actors
- Administrator

## Triggers
- The administrator decides to update user account details (e.g., name, email).

## Preconditions
- The administrator must be logged into the system.
- The user account must exist.

## Postconditions
- The user’s account details are updated in the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects the account to edit.
- The system displays the user’s current details.
- The administrator modifies the necessary fields.
- The system validates the changes and updates the account.
- A confirmation message is shown to the administrator.

#### Related UI Prototypes
- User account edit form

### 02 - Alternate course of events -

#### Invalid Data
- The administrator selects a user account to edit.
- The system displays the current details.
- The administrator enters invalid or incomplete information.
- The system prompts for corrections and prevents submission until valid data is provided.

#### User Not Found
- The administrator tries to select a user account that does not exist.
- The system displays an error message.

#### Conflict in Changes
- The administrator modifies an email or phone number, but it conflicts with another existing account’s data.
- The system displays an error message indicating a conflict.
- The administrator is prompted to resolve the conflict or cancel the changes.

#### Related UI Prototypes
- Error message for invalid data
