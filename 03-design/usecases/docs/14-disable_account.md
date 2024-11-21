# 14 Disable Account

## Basic Course of Events

### Course of Events

- The administrator selects the account of the accounts list to disable in view all accounts page(7-view_all_accounts.png).
- The system asks the administrator to confirm.
- The administrator selects **Yes**.
- The system update the view all accounts page(7-view_all_accounts.png) with this account disable.

### Sequence Diagram

![Disable account](/02-analysis/sequence-diagrams/Administrator/14-disable_account.png)


## Alternate Course of Events

### Do Not Disable
- The administrator selects an account to disable.
- The system asks the administrator to confirm.
- The administrator selects **No**.
- The system update the view all accounts page(7-view_all_accounts.png) with no changes.


## UI Sketches
This is the page that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/admin/07-view_all_accounts.png)

![Disable account](/02-analysis/UI/admin/15-disable_account.png)

![Already disabled](/02-analysis/UI/admin/Alternative/disable_account_already_disabled.jpg)