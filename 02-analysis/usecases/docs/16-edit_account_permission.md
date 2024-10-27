# 16 Edit Account Permission

## Basic Course of Events
#### Course of Events
- The administrator is on view all accounts page(7-view_all_accounts.png).
- The administrator selects the account to modify.
- The system displays the account’s current permission level.
- The administrator modifies the permission level (e.g., from user to organizer).
- The system update the view all accounts page(7-view_all_accounts.png) with updated account’s permission.
### Sequence Diagram
![Edit account permission](/02-analysis/sequence-diagrams/Administrator/16-edit_account_permission.png)

## Alternate Course of Events
#### Invalid Permission Level
- The administrator is on view all accounts page(7-view_all_accounts.png).
- The administrator selects an account and attempts to assign an invalid permission level.
- The system displays an error message and prompts for a valid selection.
### Sequence Diagram-- Alternate Course of Events
![Invalid permission level](/02-analysis/sequence-diagrams/Administrator/16-edit_account_permission-- Invalid Permission Level.png)

## Alternate Course of Events
#### Account Not Found
- The administrator is on view all accounts page(7-view_all_accounts.png).
- The administrator attempts to select an account that does not exist.
- The system displays an error message indicating the account is not found.
### Sequence Diagram-- Alternate Course of Events
![Account not found](/02-analysis/sequence-diagrams/Administrator/16-edit_account_permission- Account Not Found.png)

## Alternate Course of Events
#### Permission Already Granted
- The administrator is on view all accounts page(7-view_all_accounts.png).
- The administrator selects the account to modify.
- The administrator attempts to assign a permission level that the account already has.
- The system displays a message indicating no changes are needed.
### Sequence Diagram-- Alternate Course of Events
There is no interaction 
## UI Sketches
This is the page that the user must be on at the start to complete the use case.
！[Main Page](02-analysis/UI/admin/07-view_all_accounts.png)
![Edit account permission](/02-analysis/UI/admin/11-edit_account_permission.png)
![Invalid permissionlevel](/02-analysis/UI/admin/Alternative/edit_account_permission_invalid_permissionlevel.png)