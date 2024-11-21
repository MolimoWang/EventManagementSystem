# 25 Register Account

## Basic Course of Events
- A new customer select 'Register' in the Login page(00-login.png).
- The customer fill in necessary information to create a user, including:
    1. name
    2. email
    3. password
- The customer selects the 'Create'.
- The system display the customer main page (34-main_page_customer.png).


### Sequence Diagram

![Register Account](/03-design/sequence-diagrams/Customer/25-register_account-basic.png)




## Alternate Course of Events
### Cancel
- A new customer select 'Register' in the account management.
- The user fill in necessary information to create a user, including:
    1. name
    2. email
    3. password
- The system asks the customer to confirm.
- The user select **Cancel**.
- No account will be created and the system returns to the previous interface.


### Duplicated information

- A new customer select 'Register' in the account management.
- The user fill in necessary information to create a customer, including:
  1. name
  2. email
  3. password
- The customer selects the 'Create'.
- The system asks the user to confirm.
- The customer select **Create**.
- The service checks if the name and email are unique.
- Account information is not unique, return failure.

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
