# Create User Account

## Description
- This use case allows a user to register a user account 

## Actors
- User

## Triggers
- The user wants to create an account at login page (00-login.png).

## Preconditions
- The user's name and email cannot be duplicated.

## Postconditions:
- The user is created into the account system.
- This user can perform normal operations such as editing information, buying tickets, etc.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- A new user select 'Create User Account' in the account management.
- The user fill in necessary information to create a user, including:
  1. name
  2. email
  3. password
- The user selects the 'Create'.
- The system asks the user to confirm.
- The user select **Create**.
- The account is created and the information will be stored in the account management.



### 02 - Alternate course of events -

#### Do not Create
- A new user select 'Create User Account' in the account management.
- The user fill in necessary information to create a user, including:
    1. name
    2. email
    3. password
- The system asks the user to confirm.
- The user select **Cancel**.
- No account will be created and the system returns to the previous interface.



## Exceptions
- **System Error** : If there occur some unknown errors while creating account, the system will prompt user to try again.

### **Related UI Prototypes**
| Display Events for Date Page                   |
|------------------------------------------------|
| ![2](../../UI/user/32-create_user_account.png) |