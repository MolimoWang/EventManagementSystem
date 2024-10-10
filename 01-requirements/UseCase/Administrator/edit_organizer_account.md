# Use Case: Edit Organizer Account

## Description
- This use case allows an administrator to edit the details of an existing organizer account.

## Actors
- Administrator

## Triggers
- The administrator decides to update an organizer’s information.

## Preconditions
- The administrator must be logged into the system.
- The organizer account must already exist in the system.

## Postconditions
- The organizer’s account details are updated in the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator selects 'Edit Organizer Account' from the 'View All Accounts' page.
- The system displays a list of existing organizer accounts.
- The administrator selects the organizer account to edit.
- The system displays the current details of the organizer.
- The administrator modifies the desired fields.
- The system validates the changes and updates the account.
- A confirmation message is shown to the administrator.

#### Related UI Prototypes
- Organizer account edit form

### 02 - Alternate course of events -

#### Invalid Data
- The administrator selects an organizer account to edit.
- The system displays the current details of the organizer.
- The administrator enters invalid or incomplete information.
- The system prompts for corrections and prevents submission until valid data is provided.

#### Organizer Not Found
- The administrator tries to select an organizer account that does not exist.
- The system displays an error message indicating that the account was not found.

#### Conflict in Changes
- The administrator modifies an email or phone number, but it conflicts with another existing account’s data.
- The system displays an error message indicating a conflict.
- The administrator is prompted to resolve the conflict or cancel the changes.

#### Related UI Prototypes
- Error message for invalid data
- Conflict resolution screen
