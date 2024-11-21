# 13 View All Accounts

## Basic Course of Events
- The administrator selects 'View All Accounts' from the main page(01-main_page_administrator.png).
- The system displays three different types of user lists based on the administrator's selection at "view all accounts page".(07-view_all_accounts_administrators.png)(07-view_all_accounts_customers.png)(07-view_all_accounts_organisers.png)
### Sequence Diagram

![view all accounts for administrator](/03-design/sequence-diagrams/Administrator/13-view_all_accounts-basic.png)

## Alternate Course of Events
- The administrator selects 'View All Accounts' from the main page(01-view_all_events.png).
- The system shows that no accounts exist in the system.

### Sequence Diagram-- Alternate Course of Events

There is no interaction

## UI Sketches
This is the page that the user must be on at the start to complete the use case.

![Main Page](/02-analysis/UI/admin/01-main_page_administrator.png)

![All Administrator](/02-analysis/UI/admin/07-view_all_accounts_administrators.png)
![All Customers](/02-analysis/UI/admin/07-view_all_accounts_customers.png)
![All Organisers](/02-analysis/UI/admin/07-view_all_accounts_organisers.png)

## Data Outcome
- **Read** - All accounts in the system will be read and display.