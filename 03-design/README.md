### Message From Sean

I have now checked out the contents of the repository for grading. Any further details added after the deadline will be ignored.


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

## Use Case Realisations

The software includes the following use cases, grouped by topic for convenience. Each is defined in a separate markdown
file and is linked below.

1. [Login](/03-design/usecases/docs/00-login.md)
2. [View All Events](/03-design/usecases/docs/01-view_all_events.md)
3. [Delete Event](/03-design/usecases/docs/02-delete_event.md)
4. [View Event Details](/03-design/usecases/docs/03-view_event_details.md)
5. [View Event Registrations](/03-design/usecases/docs/04-view_event_registrations.md)
6. [Create Venue](/03-design/usecases/docs/05-create_venue.md)
7. [Edit Venue](/03-design/usecases/docs/06-edit_venue.md)
8. [View Venue Details](/03-design/usecases/docs/07-view_venue_details.md)
9. [Modify Account](/03-design/usecases/docs/08-modify_account.md)
10. [View Account](/03-design/usecases/docs/09-view_account.md)
11. [Search and Filter Events](/03-design/usecases/docs/10-search_filter_events.md)
12. [Display Date](/03-design/usecases/docs/11-display_date.md)
13. [Create Account](/03-design/usecases/docs/12-create_account.md)
14. [View All Accounts](/03-design/usecases/docs/13-view_all_accounts.md)
15. [Disable Account](/03-design/usecases/docs/14-disable_account.md)
16. [Delete Account](/03-design/usecases/docs/15-delete_account.md)
17. [View All Venues](/03-design/usecases/docs/16-view_all_venues.md)
18. [Delete Venue](/03-design/usecases/docs/17-delete_venue.md)
19. [View Venue History](/03-design/usecases/docs/18-view_venue_usage_history.md)
20. [View Events History](/03-design/usecases/docs/19-view_events_history.md)
21. [List My Events](/03-design/usecases/docs/20-list_my_events.md)
22. [Create Event](/03-design/usecases/docs/21-create_event.md)
23. [Edit Event](/03-design/usecases/docs/22-edit_event.md)
24. [List My Venues](/03-design/usecases/docs/23-list_my_venues.md)
25. [View Venue Bookings](/03-design/usecases/docs/24-view_venue_bookings.md)
26. [Register Account](/03-design/usecases/docs/25-register_account.md)
27. [List Upcoming Events](/03-design/usecases/docs/26-list_upcoming_events.md)
28. [Tickets List](/03-design/usecases/docs/27-view_purchased_tickets.md)
29. [Purchase Ticket](/03-design/usecases/docs/28-purchase_ticket.md)
30. [View Ticket Details](/03-design/usecases/docs/29-view_ticket_details.md)
31. [Cancel Ticket](/03-design/usecases/docs/30-cancel_ticket.md)

## Class Diagram

The class diagram represents the information gained about the system by completing the use case realisations.

![class diagram](/03-design/class-diagram/classDiagram.svg)

## Description of Database

[Description of Database](/03-design/class-diagram/descriptions.md)


## Milestone 3 Design

### Distribution of work on this milestone

#### Overall Distribution of Work

| Team Member | TM1 | TM2 | TM3 | TM4 | TM5 | TM6 | TM7 | TM8 |
|-------------|-----|-----|-----|-----|-----|-----|-----|-----|
| Percentage  | 13% | 13% | 13% | 13% | 12% | 12% | 12% | 12% |

#### Task Allocation

Special note: the task of each use case includes: sequence diagrams(png and txt files).

| Item                                    | Primary Author | Contributor | Contributor | Reviewer    |
|-----------------------------------------|----------------|-------------|-------------|-------------|
| Class Diagram                           | TM2            | TM3         | TM4         | TM2&TM3&TM4 |
| Responsibilities of Classes             | TM8            | TM3         |             | TM2         |
| Description of Database                 | TM2            | TM3         |             | TM4         |
| Final README file                       | TM7            | TM2         | TM1         | TM1         |
| Use Case 00: "Login"                    | TM4            | TM2         |             | TM2         |
| Use Case 01: "View All Events"          | TM4            | TM2         |             | TM2         |
| Use Case 02: "Delete Event"             | TM4            | TM5         |             | TM2         |
| Use Case 03: "View Event Details"       | TM5            | TM6         |             | TM2         |
| Use Case 04: "View Event Registrations" | TM5            | TM6         |             | TM2         |
| Use Case 05: "Create Venue"             | TM5            | TM6         |             | TM2         |
| Use Case 06: "Edit Venue"               | TM5            | TM2         |             | TM2         |
| Use Case 07: "View Venue Details"       | TM3            | TM7         |             | TM2         |
| Use Case 08: "Modify Account"           | TM3            | TM2         |             | TM2         |
| Use Case 09: "View Account"             | TM3            | TM7         |             | TM2         |
| Use Case 10: "Search Filter Events"     | TM2            |             |             | TM2         |
| Use Case 11: "Display date"             | TM1            |             |             | TM2         |
| Use Case 12: "Create Account"           | TM8            |             |             | TM2&TM3     |
| Use Case 13: "View All Accounts"        | TM8            | TM3         |             | TM2&TM3     |
| Use Case 14: "Disable Account"          | TM8            | TM3         |             | TM2&TM3     |
| Use Case 15: "Delete Account"           | TM8            | TM3         |             | TM2&TM3     |
| Use Case 16: "View All Venues"          | TM7            |             |             | TM2&TM3     |
| Use Case 17: "Delete Venue"             | TM7            |             |             | TM2&TM3     |
| Use Case 18: "View Venue Usage History" | TM7            |             |             | TM2         |
| Use Case 19: "View Events History"      | TM7            |             |             | TM2         |
| Use Case 20: "List My Events"           | TM6            |             |             | TM2         |
| Use Case 21: "Create Event"             | TM6            | TM5         |             | TM2         |
| Use Case 22: "Edit Event"               | TM6            | TM5         |             | TM2         |
| Use Case 23: "List My Venues"           | TM6            | TM5         |             | TM2         |
| Use Case 24: "View Venue Bookings"      | TM6            | TM5         |             | TM2         |
| Use Case 25: "Register Account"         | TM1            |             |             | TM2         |
| Use Case 26: "List Upcoming Events"     | TM1            |             |             | TM2         |
| Use Case 27: "Tickets List"             | TM1            |             |             | TM2         |
| Use Case 28: "Purchase Ticket"          | TM1            |             |             | TM2         |
| Use Case 29: "View Ticket Details"      | TM2            |             |             | TM2         |
| Use Case 30: "Cancel Ticket"            | TM2            |             |             | TM2         |

#### Reflection Statements

| Team Member | Contribution Reflection Statement                                                                                                                                   |
|-------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| TM1         | <*Required*: Assist with final inspection. Completed the 11,25,26,27,28 use case. >                                                                                 |
| TM2         | <*Required*: Assign tasks to everyone and give regular feedback on all sequence diagrams. Completed the 10,30,11 use case, class diagram and database description.> |
| TM3         | <*Required*: Assist with final inspection. Completed the 07,08,09 use case and class diagram. >                                                                     |
| TM4         | <*Required*: Completed the 00,01,02 use case, class diagram, database description, fix up classes description. >                                                    |
| TM5         | <*Required*: Completed the 03,04,05,06 use case. >                                                                                                                  |
| TM6         | <*Required*: Completed the 20,21,22,23,24 use case. >                                                                                                               |
| TM7         | <*Required*: Assist with final inspection. Completed the 16,17,18,19 use case and write basic README file.>                                                         |
| TM8         | <*Required*: Completed the 12,13,14,15,16 use case. >                                                                                                               |

