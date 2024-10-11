# Use Case: Delete Event

## Description
- This use case allows an administrator to delete an existing account from the system.

## Actors
- Administrator

## Triggers
- The administrator decides to remove an account (user, organizer or administrator) from the system.

## Preconditions
- The administrator must be logged into the system.
- The account must exist.

## Postconditions
- The account is permanently removed from the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects an account to delete.
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The account is deleted.
- A confirmation message is shown to the administrator.

### 02 - Alternate course of events -

#### Do Not Delete
- The administrator selects an event to delete.
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system returns to the previous interface, and no event is deleted.

#### Event Not Found
- The administrator tries to delete an event that no longer exists.
- The system displays an error message.

### Related UI Prototypes
![Delete Account](../../UI/admin/16-delete_account.png)
