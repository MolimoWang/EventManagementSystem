
# Team Project: *Group 05*

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

# Implementation

This part includes the implementation of the restaurant example system. In order to execute the application you will need to have the following installed:
1. Java 21
2. Maven
3. Docker
4. Docker Compose

## Running the Application (Method1: with Docker)	
Assuming that you have correctly installed and set up the above, you can run the application by following these steps:
1. Use maven to create a jar file of the application by running `mvn package` in the root directory of the project.
```bash
mvn package
```
2. Run the docker compose command to build and run the application.

(Due to the problem of the Chinese mirror source, it takes a very long time to download, about ten minutes for the first time(Related to the network))
```bash
docker-compose up --build -d
docker-compose up --build
```

This will build the application and run it on port 8000. You can then access the application by navigating to `localhost:8000` in your browser. This also starts the database, as such any changes you make shoudl persist between runs.

## Stopping the Application
When you are finished and want to stop the application, you can use the following command:
```bash
docker-compose down
```

If you want to stop the application and remove the database, you can use the following command:
```bash
docker-compose down -v
```

## Running the Application Locally (Method2: Without Docker)
### Prerequisites
Ensure the following are installed and properly configured on your system:
1. **Java 21**: Download and install JDK 21.
2. **Maven**: Install Maven (version 3.8.8 or higher).
3. **MySQL**: Install and ensure the MySQL server is running.

### Steps to Run

#### 1. Set up the Database
Open your MySQL client and execute the following commands to create a database and user for the application:
```sql
CREATE DATABASE event_management;

CREATE USER 'restaurant_user'@'localhost' IDENTIFIED BY '123456';

GRANT ALL PRIVILEGES ON event_management.* TO 'restaurant_user'@'localhost';

FLUSH PRIVILEGES;
```
#### 2. Build the Project
Navigate to the root directory of the project (where the pom.xml file is located) and build the project using Maven:
```bash
mvn install
```
#### 3. Run the Application
Use the following Maven command to start the Spring Boot application:
```bash
mvn spring-boot:run
```
#### 4. Access the Application
Once the application has started successfully, open your browser and visit:
```
http://localhost:8000
```


## Milestone 4 Implementation

### Distribution of work on this milestone
#### Overall Distribution of Work
| Team Member | TM1 | TM2 | TM3 | TM4 | TM5 | TM6 | TM7 | TM8 |
|-------------|-----|-----|-----|-----|-----|-----|-----|-----|
| Percentage  | 13% | 12% | 15% | 10% | 10% | 10% | 15% | 15% |
#### Task Allocation
| Item                           | Primary Author | Contributor | Contributor | Reviewer |
|--------------------------------|----------------|-------------|-------------|----------|
| Docker setup                   | TM1            |             |             | TM7      |
| UI development                 | TM7            |             |             | TM2      |
| Database initialization        | TM1            | TM7         |             | TM8      |
| SecurityConfig setup           | TM1            |             |             | TM3      |
| 00-login.md                    | TM1            | TM2         |             | TM2      |
| 01-view_all_events.md          | TM3            | TM8         |             | TM1      |
| 02-delete_event.md             | TM3            | TM8         |             | TM2      |
| 03-view_event_details.md       | TM3            | TM8         |             | TM3      |
| 04-view_event_registrations.md | TM3            | TM8         |             | TM3      |
| 05-create_venue.md             | TM5            | TM4         |             | TM3      |
| 06-edit_venue.md               | TM6            | TM5         |             | TM1      |
| 07-view_venue_details.md       | TM4            | TM6         |             | TM1      |
| 08-modify_account.md           | TM2            | TM1         |             | TM3      |
| 09-view_account.md             | TM2            | TM1         |             | TM3      |
| 10-search_filter_events.md     | TM3            | TM8         |             | TM3      |
| 11-display_date.md             | TM1            | TM2         |             | TM2      |
| 12-create_account.md           | TM2            | TM1         |             | TM1      |
| 13-view_all_accounts.md        | TM2            | TM1         |             | TM1      |
| 14-delete_account.md           | TM2            | TM2         |             | TM1      |
| 15-view_all_venues.md          | TM5            | TM6         |             | TM2      |
| 16-delete_venue.md             | TM4            | TM5         |             | TM2      |
| 17-view_venue_usage_history.md | TM7            | TM3         |             | TM8      |
| 18-view_events_history.md      | TM7            | TM3         |             | TM8      |
| 19-list_my_events.md           | TM7            | TM3         |             | TM8      |
| 20-create_event.md             | TM7            | TM3         |             | TM8      |
| 22-list_my_venues.md           | TM6            | TM4         |             | TM5      |
| 23-view_venue_bookings.md      | TM3            | TM7         |             | TM2      |
| 24-register_account.md         | TM1            | TM2         |             | TM3      |
| 25-list_upcoming_events.md     | TM8            | TM7         | TM3         | TM7      |
| 26-view_purchased_tickets.md   | TM8            | TM7         | TM3         | TM7      |
| 27-purchase_ticket.md          | TM8            | TM7         | TM3         | TM7      |
| 28-view_ticket_details.md      | TM8            | TM7         | TM3         | TM2      |
| 29-cancel_ticket.md            | TM4            | TM5         | TM6         | TM2      |


#### Reflection Statements
Due to the problem of project structure, our team opened a new repository to write part 04. The link is as follows:https://csgitlab.ucd.ie/WangShuhan/comp3013j-ood.git

| Team Member | Contribution Reflection Statement                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|-------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|TM1| (It is worth mentioning that TM1 has relatively few submission records because her task was at the beginning and submitted only after all tasks were completed and the final docker.) <br/><br/>Responsible for task allocation and project planning, initializing the Spring Boot project and setting up Spring Security for user authentication and authorization. Initialized the UI of all role pages. Initialized the project database, including creating the user table and other key data structures, and developed the login and registration functionalities, ensuring seamless integration with the security setup and database.<br/> <br/>Docker configuration, enabling the project to run in a containerized environment. |
|TM2| TM2 was responsible for the account management tasks(both frontend and backend), including modifying accounts, viewing accounts, view all accounts, creating accounts, and deleting accounts, ensuring the security of the system and the smoothness of user operations.                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
|TM3| TM3, TM7 and TM8 worked together to complete the entire front-end and back-end of event management and ticket management, including the production of all use cases and tables.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
|TM4| TM4, TM5 and TM6 worked together to complete the front-end and back-end of venue management and the initialization of the event front-end                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
|TM5| TM4, TM5 and TM6 worked together to complete the front-end and back-end of venue management and the initialization of the event front-end                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
|TM6| TM4, TM5 and TM6 worked together to complete the front-end and back-end of venue management and the initialization of the event front-end                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
|TM7| TM3, TM7 and TM8 worked together to complete the entire front-end and back-end of event management and ticket management, including the production of all use cases and tables.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
|TM8| TM3, TM7 and TM8 worked together to complete the entire front-end and back-end of event management and ticket management, including the production of all use cases and tables.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |

