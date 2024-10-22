# Use Case: Log In

## Description
- This use case allows administrators organizers or users to log in this system.

## Actors
- Administrators, Organizer, user

## Triggers
- This use case is triggered when any accounts login

## Preconditions
- The accounts request login is existed in the system.

## Postconditions
- The user is taken to the main page of the system.

## Course of Events
### 01 - Basic course of events -
- 1.The user opens the application.
- 2.The system presents a login page and prompt the user to enter their email and password
- 3.The user enters their credentials
- 4.The system displays the main page of the system. The administrator is on their main page(01-view_all_events.png). The organizer is on their main page(17-view_all_events.png). The user is on their main page(34-view_all_events.png).


### 02 - Alternative Course of Events -
- 1.The user opens the application.
- 2.The system presents a login page and prompt the user to enter their email and password
- 3.The user enters their credentials
- 4.The system informs the user that their combination of username and password was incorrect and returns to the log in page


## Related UI Sketches

### Log in page
- This is the starting point for the use case.

![Login](../../UI/00-login.png) 
### Main Page
#### Administrator

![Admin Main Page](../../UI/admin/01-view_all_events.png) 

#### Organizer
![Organizer Main Page](../../UI/organizer/17-view_all_events.png) 

#### User
![User Main Page](../../UI/user/34-view_all_events.png) 




