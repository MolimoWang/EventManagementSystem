
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
