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

# Design

This phase continues the development process by performing further realisations on the courses of events that we
described in the analysis phase. This requires the creation of new sequence diagrams for each course of events. These
diagrams will be more detailed in that they will contain all parameter and type infromation. Additionally, the diagrams
will now include the UI and database components of the system.

Decisions made while constructing these diagrams are also documented in the class diagram.

## Use Case Realisations (Sequence Diagrams)

Each use case contains the separate sequence diagrams for each course of events. The diagrams are stored in the `images`
folder and referenced in the markdown files.

1. [Use Case 1](01-name.md)
2. [Use Case 2](02-name.md)
3. [Use Case 3](03-name.md)
4. [Use Case 4](04-name.md)
5. [Use Case 5](05-name.md)

## Class Diagram

The class diagram represents the information gained about the system by completing the use case realisations.

![class diagram](images/class-diagram.png)

## Data Persistence

Within the restaurant the following classes should be maintained between executions.

1. Customer - id, name, phone number
2. Table - id, number, places
3. WalkIn - id, table, date, time, covers, is overfull
4. Reservation - id, customer, table, date, time, covers, is overfull

### Relationships

1. Customer - Reservation (1 to many)
2. Reservation - Customer (1 to 1)
2. Table - Booking (1 to many)
3. Booking - Table (1 to 1)

## Milestone 3 Design Anlaysis

### Distribution of work on this milestone

#### Overall Distribution of Work

| Team Member | TM1 | TM2 | TM3 | TM4 | TM5 | TM6 | TM7 | TM8 |
|-------------|-----|-----|-----|-----|-----|-----|-----|-----|
| Percentage  | 12% | 12% | 12% | 12% | 12% | 12% | 12% | 12% |

#### Task Allocation
Special note: the task of each use case includes: sequence diagrams(png and txt files).

| Item                            | Primary Author | Contributor | Reviewer |
|---------------------------------|----------------|-------------|----------|
| Description of Responsibilities | TM3            |             |          |
| Class Diagram                   | TM2            |             |          |
| Use Case 1: "create_event"      | TM4 & TM5      |             |          |
| Use Case 2: "deleted_event"     | TM3 & TM8      |             |          |
| Use Case 3: "updated_event"     | TM2 & TM7      |             |          |
| Use Case 4: "retrieved_event"   | TM1 & TM6      |             |          |

#### Reflection Statements

| Team Member | Contribution Reflection Statement                                                       |
|-------------|-----------------------------------------------------------------------------------------|
| TM1         | <*Required*: Completed the files related to retrieved_event. >                          |
| TM2         | <*Required*: Completed the files related to update_event and revise class diagram.>     |
| TM3         | <*Required*: Completed the files related to deleted_event. >                            |
| TM4         | <*Required*: Completed the files related to created_event. >                            |
| TM5         | <*Required*: Completed the files related to created_event. >                            |
| TM6         | <*Required*: Completed the files related to retrieved_event. >                          |
| TM7         | <*Required*: Completed the files related to updated_event and write basic README file.> |
| TM8         | <*Required*: Completed the files related to deleted_event. >                            |

