# Use Case: Edit User Account

## Description
- This use case describes the process of an administrator editing an administrator account.

## Actors
- Administrator

## Triggers
- The administrator decides to update administrator account details (e.g., name, email).

## Preconditions
- The administrator must be logged into the system.
- The administrator account must exist.

## Postconditions
- The administrator’s account details are updated in the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects the administrator account to edit.
- The system displays the administrator’s current details.
- The administrator modifies the necessary fields.
- The system validates the changes and updates the administrator account.
- A confirmation message is shown to the administrator.


### 02 - Alternate course of events -

#### Invalid Data
- The administrator selects aN administrator account to edit.
- The system displays the current details.
- The administrator enters invalid or incomplete information.
- The system prompts for corrections and prevents submission until valid data is provided.

#### Administrator Not Found
- The administrator tries to select an administrator account that does not exist.
- The system displays an error message.

### Conflict in Changes
- The administrator modifies an email or phone number, but it conflicts with another existing account’s data.
- The system displays an error message indicating a conflict.
- The administrator is prompted to resolve the conflict or cancel the changes.

#### Related UI Prototypes
![Edit Administrator](../../UI/admin/14-edit_administrator_account.png)