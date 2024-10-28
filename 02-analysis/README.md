# Team Project: *Group 05*
This report details the work that was completed by together by all team members for the Analysis phase of the project.
## Team Members

| Number | Name        | Email(s)                  | CSGitLab Username |
|--------|-------------|---------------------------|-------------------|
| TM1    | Wang Shuhan | shuhan.wang@ucdconnect.ie | @WangShuhan       |
| TM2    | Gu Ruixin   | ruixin.gu@ucdconnect.ie   | @RuixinGu         |     
| TM3    | Rong Yuze   | yuze.rong@ucdconnect.ie   | @22207274         |     
| TM4    | An Ran      | ran.am@ucdconnect.ie      | @RanAnQWQ         |     
| TM5    | Li Siying   | siying.li@ucdconnect.ie   | @siying.li        |     
| TM6    | Shen Jinyan | jinyan.shen@ucdconnect.ie | @Shen_Jinyan      |     
| TM7    | Wan Zitong  | zitong.wan@ucdconnect.ie  | @Rostiute         |     
| TM8    | Qin Chenle  | chenle.qin@ucdconnect.ie  | @22207284         |

# Milestone 2 Requirements Analysis

This phase continues the development process by realising the courses of events that we described in the requirements
analysis phase. This requires the creation of sequence diagrams for each course of events. Decisions made while
constructing these diagrams are also documented in the class diagram.

## Distribution of work on this milestone

### Overall Distribution of Work

| Team Member | TM1 | TM2 | TM3 | TM4 | TM5 | TM6 | TM7 | TM8 |
|-------------|-----|-----|-----|-----|-----|-----|-----|-----|
| Percentage  | 12% | 13% | 13% | 12% | 12% | 12% | 13% | 13% |


## Class Diagram
The class diagram represents the information gained about the system by completing the use case realisations.

![class diagram](/02-analysis/class-diagram/classDiagram.png)

## Description of Responsibilities
[Description of Responsibilities](/02-analysis/class-diagram/descriptions.md)

### Class Diagram Description - Responsibilities

#### **Account Management**

##### **Account**
The `Account` class represents a generic account in the system. It stores account information like name, email, and password. It provides getter and setter methods to access and modify the account attributes.

##### **Administrator**
The `Administrator` class is a subclass of the `Account` class. It represents an account with administrative privileges, inheriting common attributes and methods from the `Account` superclass.

##### **Organiser**
The `Organiser` class is a concrete subclass of the `Account` class. It represents an event organizer with additional attributes such as address, company name, and phone number. It provides methods to manage these additional attributes.

##### **User**
The `User` class is another subclass of `Account`, representing a regular user in the system. It inherits basic attributes and functionalities from the `Account` superclass.

##### **AccountService**
The `AccountService` class is responsible for managing all account-related operations, such as creating, deleting, updating, and retrieving accounts. It ensures that the account data is consistent and handles validation checks (e.g., duplicate accounts or invalid permissions).

##### **AccountCreationRequest**
The `AccountCreationRequest` class encapsulates the details required for creating an account, such as account name, email, and password.

##### **AccountSystem**
The `AccountSystem` class acts as a controller, handling interactions with the user interface. It processes user inputs related to account management, such as login, logout, account creation, and updates.

#### **Venue Management**

##### **Venue**
The `Venue` class represents a location where events can take place. It includes information about the venue’s name, address, and contact details, along with methods to manage these attributes.

##### **VenueService**
The `VenueService` class manages venue-related operations, including creating, updating, deleting, and retrieving venues. It also handles checks for duplicate venues and the availability of venues for events.

##### **VenueCreationRequest**
The `VenueCreationRequest` class contains details necessary for creating a venue, such as the venue’s name, address, and contact information.

##### **VenueSystem**
The `VenueSystem` class serves as a controller for handling venue management use cases, such as displaying venue information and managing venue-related operations.

#### **Event Management**

##### **Event**
The `Event` class represents an event organized in the system. It contains information about the event’s name, description, date, and time. It provides methods to manage these attributes.

##### **EventService**
The `EventService` class manages event-related operations, including creating, updating, deleting, and retrieving events. It also tracks venue usage and handles the association between events and venues.

##### **EventCreationRequest**
The `EventCreationRequest` class holds the details required to create an event, such as the event's name, description, date, and time.

##### **EventSystem**
The `EventSystem` class is responsible for processing event-related use cases, such as creating events, viewing event details, and filtering events based on keywords or dates.

#### **Ticket Management**

##### **Ticket**
The `Ticket` class represents a relationship between users and events. It tracks ticket information and user-event associations.

##### **TicketInfo**
The `TicketInfo` class stores information related to tickets, such as the number of tickets available, sold, and their prices. It provides methods to manage ticket details.

##### **TicketType**
The `TicketType` class represents different types of tickets, such as VIP or regular. It tracks the number of tickets of each type and their respective information.

##### **TicketService**
The `TicketService` class manages ticket-related operations, such as buying tickets, viewing ticket details, and managing user registrations for events.

##### **TicketPurchaseRequest**
The `TicketPurchaseRequest` class holds details related to ticket purchases, such as user information, event details, and ticket type.

##### **TicketSystem**
The `TicketSystem` class handles the interaction between the user and ticket-related functionalities, such as purchasing tickets, viewing ticket details, and displaying ticket-related information.

#### **System Classes**
The `AccountSystem`, `VenueSystem`, `EventSystem`, and `TicketSystem` classes serve as controllers, managing user interactions and delegating tasks to their respective service classes. They ensure that use cases are completed efficiently and that data is displayed to the user as needed.

### Note About Responsibilities
The described responsibilities focus on application classes without considering database interactions or user interfaces. In a complete system, responsibilities might shift, with the controller classes handling more UI logic and service classes managing database operations.


## Use Case Realisations
The software includes the following use cases, grouped by topic for convenience. Each is defined in a separate markdown
file and is linked below.
1. [Login](/02-analysis/usecases/docs/00-login.md)
2. [View All Events](/02-analysis/usecases/docs/01-view_all_events.md)
3. [Delete Event](/02-analysis/usecases/docs/02-delete_event.md)
4. [View Event Details](/02-analysis/usecases/docs/03-view_event_details.md)
5. [View Event Registrations](/02-analysis/usecases/docs/04-view_event_registrations.md)
6. [Create Venue](/02-analysis/usecases/docs/05-create_venue.md)
7. [Edit Venue](/02-analysis/usecases/docs/06-edit_venue.md)
8. [View Venue Details](/02-analysis/usecases/docs/07-view_venue_details.md)
9. [Modify Account](/02-analysis/usecases/docs/08-modify_account.md)
10. [View Account](/02-analysis/usecases/docs/09-view_account.md)
11. [Search and Filter Events](/02-analysis/usecases/docs/10-search_filter_events.md)
12. [Display Date](/02-analysis/usecases/docs/11-display_date.md)
13. [Create Account](/02-analysis/usecases/docs/12-create_account.md)
14. [View All Accounts](/02-analysis/usecases/docs/13-view_all_accounts.md)
15. [Disable Account](/02-analysis/usecases/docs/14-disable_account.md)
16. [Delete Account](/02-analysis/usecases/docs/15-delete_account.md)
17. [Edit Account Permission](/02-analysis/usecases/docs/16-edit_account_permission.md)
18. [View All Venues](/02-analysis/usecases/docs/17-view_all_venues.md)
19. [Delete Venue](/02-analysis/usecases/docs/18-delete_venue.md)
20. [View Venue Usage History](/02-analysis/usecases/docs/19-view_venue_usage_history.md)
21. [View Events History](/02-analysis/usecases/docs/20-view_events_history.md)
22. [List My Events](/02-analysis/usecases/docs/21-list_my_events.md)
23. [Create Event](/02-analysis/usecases/docs/22-create_event.md)
24. [Edit Event](/02-analysis/usecases/docs/23-edit_event.md)
25. [List My Venues](/02-analysis/usecases/docs/24-list_my_venues.md)
26. [View Venue Bookings](/02-analysis/usecases/docs/25-view_venue_bookings.md)
27. [Register Account](/02-analysis/usecases/docs/26-register_account.md)
28. [List Upcoming Events](/02-analysis/usecases/docs/27-list_upcoming_events.md)
29. [Tickets List](/02-analysis/usecases/docs/28-tickets_list.md)
30. [Purchase Ticket](/02-analysis/usecases/docs/29-purchase_ticket.md)
31. [View Ticket Details](/02-analysis/usecases/docs/30-view_ticket_details.md)
32. [Cancel Ticket](/02-analysis/usecases/docs/31-cancel_ticket.md)



## Reflection Statements

| Team Member | Contribution Reflection Statement                                                                                                                                                                                                                     |
|-------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| TM1         | <*Required*: Responsible for Ticket. Complete use case of users.>                                                                                                                                                                                     |
| TM2         | <*Required*: Assign tasks and coordinate work; Modify use cases based on feedback;Designing the Class Diagram, arranging task allocation and reviewing all project. >                                                                                 |
| TM3         | <*Required*: Modify use cases based on feedback;Completed half part of Common and draw the Class Diagram. >                                                                                                                                           |
| TM4         | <*Required*: Assist TM5,TM6 who are responsible for organizer part to make class diagram changes. Completed part of the organizer section.>                                                                                                       . > |
| TM5         | <*Required*: Completed part of the organizer section. >                                                                                                                                                                                               |
| TM6         | <*Required*: Completed part of the organizer section. >                                                                                                                                                                                               |
| TM7         | <*Required*: Completed a small portion of Administrator and half part of Common and write the final README file. >                                                                                                                                    |
| TM8         | <*Required*: Completed mostly part of Administrator and write the final Class Description Document                   >                                                                                                                                |


#### Task Allocation
Special note: the content of each use case here includes: sequence diagrams (png and txt files) for that use case in all cases, and descriptions in the md file.

| Item                                    | Primary Author | Contributor | Contributor | Reviewer |
|-----------------------------------------|----------------|-------------|-------------|----------|
| Modify use cases based on feedback      | TM2            | TM3         |             | TM1&TM7  |
| Class Diagram                           | TM2            | TM3         | TM4         | TM1&TM7  |
| Class Diagram Document                  | TM8            |             |             | TM1&TM7  |
| Final README file                       | TM7            |             |             | TM2      |
| Use Case 00: "Login"                    | TM7            | TM2         |             | TM8      |
| Use Case 01: "View All Events"          | TM7            | TM2         |             | TM8      |
| Use Case 02: "Delete Event"             | TM7            | TM2         |             | TM8      |
| Use Case 03: "View Event Details"       | TM7            | TM2         |             | TM8      |
| Use Case 04: "View Event Registrations" | TM7            | TM2         |             | TM8      |
| Use Case 05: "Create Venue"             |                |             |             | TM2      |
| Use Case 06: "Edit Venue"               |                |             |             | TM2      |
| Use Case 07: "View Venue Details"       | TM3            |             |             | TM2&TM8  |
| Use Case 08: "Modify Account"           | TM3            |             |             | TM2&TM8  |
| Use Case 09: "View Account"             | TM3            |             |             | TM2&TM8  |
| Use Case 10: "Search Filter Events"     | TM3            |             |             | TM2&TM8  |
| Use Case 11: "Display date"             | TM3            |             |             | TM2&TM8  |
| Use Case 12: "Create Account"           | TM8            |             |             | TM2&TM3  |
| Use Case 13: "View All Accounts"        | TM8            |             |             | TM2&TM3  |
| Use Case 14: "Disable Account"          | TM8            |             |             | TM2&TM3  |
| Use Case 15: "Delete Account"           | TM8            |             |             | TM2&TM3  |
| Use Case 16: "Edit Account Permission"  | TM8            |             |             | TM2&TM3  |
| Use Case 17: "View All Venues"          | TM8            |             |             | TM2&TM3  |
| Use Case 18: "Delete Venue"             | TM8            |             |             | TM2&TM3  |
| Use Case 19: "View Venue Usage History" | TM7            | TM2         |             | TM2&TM3  |
| Use Case 20: "View Events History"      | TM8            |             |             | TM2&TM3  |
| Use Case 21: "List My Events"           |                |             |             | TM2      |
| Use Case 22: "Create Event"             |                |             |             | TM2      |
| Use Case 23: "Edit Event"               |                |             |             | TM2      |
| Use Case 24: "List My Venues"           |                |             |             | TM2      |
| Use Case 25: "View Venue Bookings"      |                |             |             | TM2      |
| Use Case 26: "Register Account"         | TM1            |             |             | TM2      |
| Use Case 27: "List Upcoming Events"     | TM1            |             |             | TM2      |
| Use Case 28: "Tickets List"             | TM1            |             |             | TM2      |
| Use Case 29: "Purchase Ticket"          | TM1            |             |             | TM2      |
| Use Case 30: "View Ticket Details"      | TM2            |             |             | TM1      |
| Use Case 31: "Cancel Ticket"            | TM1            |             |             | TM2      |