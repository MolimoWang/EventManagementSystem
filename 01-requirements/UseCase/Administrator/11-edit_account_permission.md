# Use Case: Edit Account Permission

## Description
- This use case involves changing the permission level of an existing account by an administrator (e.g., promoting a user to an organizer).

## Actors
- Administrator

## Triggers
- The administrator decides to modify the permission level of an account.

## Preconditions
- The administrator must be logged into the system.
- The account must exist.

## Postconditions
- The account’s permission level is updated in the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects the account to modify.
- The system displays the account’s current permission level.
- The administrator modifies the permission level (e.g., from user to organizer).
- The system validates the change and updates the account.
- A confirmation message is shown to the administrator.


### 02 - Alternate course of events -

#### Invalid Permission Level
- The administrator selects an account and attempts to assign an invalid permission level.
- The system displays an error message and prompts for a valid selection.

#### Account Not Found
- The administrator attempts to select an account that does not exist.
- The system displays an error message indicating the account is not found.

#### Permission Already Granted
- The administrator attempts to assign a permission level that the account already has.
- The system displays a message indicating no changes are needed.

### Related UI Prototypes
![Edit Account Permission](../../UI/admin/11-edit_account_permission.png)
