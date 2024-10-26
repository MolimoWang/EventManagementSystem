# 09 View Account

## Basic Course of Events

### Course of Events-- Administrator Viewing Other Accounts
- The administrator click a specific account at view all accounts page(07-view_all_accounts.png).
- The system displays the view account page (30-view_organizer_account.png,35-view_user_account.png) which shows the details of the selected account

### Sequence Diagram
#### View Organizer
![Main Page](02-analysis/sequence-diagrams/Common/09-Administrator_view_organizer_acccount.png)
#### View User
![Main Page](02-analysis/sequence-diagrams/Common/09-administrator_view_user_acccount.png)
### Course of Events-- Any User Viewing Their Account
- The organizer or user is on their main page(17-view_all_events.png,34-view_all_events.png) and press **Account** button.
- The system displays the view account page (30-view_organizer_account.png,35-view_user_account.png) which shows the details of the selected account

### Sequence Diagram
#### Organizer
![Main Page](02-analysis/sequence-diagrams/Common/09-organizer_view_account.png)
#### User
![Main Page](02-analysis/sequence-diagrams/Common/09-user_view_account.png)

## Alternate Course of Events

### No Events Available
- If there are no past or future events associated with the organizer, the system displays an empty state message, such as "No Events Available".

### Sequence Diagram-- Alternate Course of Events
- This does not need a sequence diagram because it is same as previous and won't use different method.

## UI Sketches
### Administrator
This is the page that the user must be on at the start to complete the use case.
#### Main Page
![Main Page](/02-analysis/UI/admin/01-view_all_events.png)

#### View All Accounts
![All accounts](02-analysis/UI/admin/07-view_all_accounts.png)

#### View Selected Account
##### User
![User Account](02-analysis/UI/user/35-view_user_account.png)
##### Organizer
![Organizer Account](02-analysis/UI/organizer/30-view_organizer_account.png)

### Organizer
There the pages that the user must be on at the start to complete the use case.
#### Main Page
![Main Page](/02-analysis/UI/organizer/17-view_all_events.png)

#### View Account
![All accounts](02-analysis/UI/organizer/30-view_organizer_account.png)

### User
There the pages that the user must be on at the start to complete the use case.
#### Main Page
![Main Page](/02-analysis/UI/user/34-view_all_events.png)

#### View Account
![All accounts](02-analysis/UI/user/35-view_user_account.png)
