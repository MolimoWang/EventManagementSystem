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
- The service checks if the name and email are unique.
- Account information is unique, return true.
- The account is created and the information will be stored in the account management.


### Sequence Diagram
![Register Account](/02-analysis/sequence-diagrams/User/26-register_account.png)

## Alternate Course of Events
### Do not Create
- A new user select 'Create User Account' in the account management.
- The user fill in necessary information to create a user, including:
    1. name
    2. email
    3. password
- The system asks the user to confirm.
- The user select **Cancel**.
- No account will be created and the system returns to the previous interface.


### Sequence Diagram-- Alternate Course of Events
![Register Account Cancel](/02-analysis/sequence-diagrams/User/26-register_account_cancel.png)


- A new user select 'Create User Account' in the account management.
- The user fill in necessary information to create a user, including:
  1. name
  2. email
  3. password
- The user selects the 'Create'.
- The system asks the user to confirm.
- The user select **Create**.
- The service checks if the name and email are unique.
- Account information is not unique, return failure.

### Sequence Diagram-- Alternate Course of Events
![Register Account Duplicated](/02-analysis/sequence-diagrams/User/26-register_account_duplicated.png)

## UI Sketches

### Login
This is the page that the user must be on at the start to complete the use case.


![Login](/02-analysis/UI/00-login.png) 

### Register Page
This page is taken to when the user has successfully registered.


![Main Page](/02-analysis/UI/customer/34-main_page_customer.png)

### Main Page
This page is taken to when the user has successfully registered.


![Main Page](/02-analysis/UI/customer/34-main_page_customer.png)
