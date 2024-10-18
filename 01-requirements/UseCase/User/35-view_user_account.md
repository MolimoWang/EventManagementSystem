# View User Account

## Description
- This use case allows a user to view his/her account in the account management.

## Actors
- User

## Triggers
- The user wants to view his/her own account.

## Preconditions
- The user must be logged into the system.

## Postconditions:
- The user can view his/her own account, including: Name, password and email.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The user click the 'Account' option from the account management.
- The system displays the details about his/her account.


### 02 - Alternate course of events - 

#### Edit Account
- The user click the 'Account' option from the account management.
- The system displays the details about his/her account.
- The user can change at most two things:
  1. Name.
  2. Password.
  3. Email.
- The user click the 'Submit' option to save the change.



## Exceptions
- **System Error** : If there occur some unknown errors while viewing account, the system will prompt user to try again.

### **Related UI Prototypes**
| View All Events Page                                     |
|----------------------------------------------------------|
|![View All Events Page  ](../../UI/user/35-view_user_account.png)|