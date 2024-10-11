# Use Case: Disable Account

## Description
- This use case allows an administrator to disable a user or organizer account, preventing the account from being used to log into the system.

## Actors
- Administrator

## Triggers
- The administrator decides to disable an account due to inactivity or a policy violation.

## Preconditions
- The administrator must be logged into the system.
- The account must exist.

## Postconditions
- The selected account is disabled, and the user cannot log in.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator navigates to the 'View All Accounts' page, which displaying all existing accounts in the system.
- The system displays a list of existing accounts.
- The administrator selects the account to disable.
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The account is disabled and cannot log in.
- A confirmation message is shown to the administrator.


### 02 - Alternate course of events -

#### Do Not Disable
- The administrator selects an account to disable.
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system returns to the previous interface, and no action is taken.

#### Account Already Disabled
- The administrator selects an account to disable, but the account is already disabled.
- The system displays a message indicating the account is already inactive.

#### Account Not Found
- The administrator tries to disable an account that does not exist.
- The system displays an error message.

### Related UI Prototypes
![Disable Account](../../UI/admin/15-disable_account.png)
