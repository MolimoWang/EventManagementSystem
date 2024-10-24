# 26 Register Account

## Basic Course of Events
- A new user select 'Create User Account' in the account management.
- The user fill in necessary information to create a user, including:
    1. name
    2. email
    3. password
- The user selects the 'Create'.
- The system asks the user to confirm.
- The user select **Create**.
- The account is created and the information will be stored in the account management.


### Sequence Diagram

## Alternate Course of Events
#### Do not Create
- A new user select 'Create User Account' in the account management.
- The user fill in necessary information to create a user, including:
    1. name
    2. email
    3. password
- The system asks the user to confirm.
- The user select **Cancel**.
- No account will be created and the system returns to the previous interface.


### Sequence Diagram-- Alternate Course of Events


## UI Sketches
### Login
This is the page that the user must be on at the start to complete the use case.
![Login](/02-analysis/UI/00-login.png) 

### Register Page
This page is taken to when the user has successfully registered.
![Main Page](/02-analysis/UI/user/34-view_all_events.png)

### Main Page
This page is taken to when the user has successfully registered.
![Main Page](/02-analysis/UI/user/34-view_all_events.png)
