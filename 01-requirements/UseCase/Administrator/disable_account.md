# Use Case: Disable Account

## Description
- This use case allows an administrator to disable a user or organizer account, preventing the account from being used to log into the system.

## Actors
- Administrator

## Triggers
- The administrator decides to disable an account due to inactivity or a policy violation.

## Preconditions
- The administrator is on view all accounts page(7-view_all_accounts.png).

## Postconditions
- The system update the view all accounts page(7-view_all_accounts.png) with this account deleted.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator selects the account of the accounts list to disable in view all accounts page(7-view_all_accounts.png).
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The system update the view all accounts page(7-view_all_accounts.png) with this account deleted.


### 02 - Alternate course of events -

#### Do Not Disable
- The administrator selects an account to disable.
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system update the view all accounts page(7-view_all_accounts.png) with no changes.

#### Account Already Disabled
- The administrator selects an account to disable, but the account is already disabled.
- The system displays a message indicating the account is already inactive.

#### Account Not Found
- The administrator tries to disable an account that does not exist.
- The system displays an error message.

### Related UI Prototypes
![Disable Account](../../UI/admin/15-disable_account.png)
