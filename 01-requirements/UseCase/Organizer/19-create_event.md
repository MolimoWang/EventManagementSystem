# Create Event Use Case

## Description
This use case allows an organizer to create a new event in the event management system by providing event details such as name, date, time, and venue.

## Actors
- Organizer

## Triggers
- The organizer wants to create a new event to be hosted at a specific venue.

## Preconditions
- The organizer must be logged into the system.
- The organizer has appropriate privileges to create an event.
- At least one venue is available in the system.

## Postconditions
- A new event is added to the system and is available for users to view and purchase tickets.

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "Create Event" option from the event management menu.
2. The system displays a form to enter event details, including:
   - Event Name
   - Date and Time
   - Venue
   - Description
   - Ticket Information (types, prices, quantity)
3. The organizer fills in the required details and clicks "Save".
4. The system validates the input and checks for any missing required fields.
5. If validation passes, the system stores the new event and displays a confirmation message.
6. The system updates the list of upcoming events.




### 02 - Alternate course of events

#### Missing Required Fields
- If the organizer submits the form with missing required fields (e.g., event name or date), the system highlights the missing fields and prompts the organizer to provide the necessary information.

#### Venue Unavailable
- If the selected venue is not available for the chosen date and time, the system displays an error message and prompts the organizer to choose a different venue or date.

## Exceptions
- **System Error**: If a system error occurs while saving the event, the system displays an error message and prompts the organizer to try again later.

### **Related UI Prototypes**
| Create Event Page                                             |
|---------------------------------------------------------------|
| ![Create Event](../../UI/organizer/19-create_event.png)       |
| Error: Venue Unavaliable                                      |
| ![Add Venue](../../UI/organizer/Alternative/create_event.png) |                                                        |