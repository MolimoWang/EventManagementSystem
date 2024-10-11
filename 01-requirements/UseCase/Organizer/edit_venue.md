# Edit Venue Use Case

## Description
This use case allows an organizer to edit the details of an existing venue in the event management system, such as the venue name, address, contact information, capacity, and ticket type availability.

## Actors
- Organizer

## Triggers
- The organizer wants to update information about a venue due to changes in capacity, contact information, or other reasons.

## Preconditions
- The organizer must be logged into the system.
- The organizer has appropriate privileges to edit the venue.
- The venue must already exist in the system.

## Postconditions
- The venue details are updated in the system, and the changes are reflected in all events using this venue.

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "Edit Venue" option from the venue management menu.
2. The system displays a list of venues created by the organizer.
3. The organizer selects the venue they wish to edit.
4. The system displays a form with the current venue details, including:
    - Venue Name
    - Venue Address
    - Local Contact Details (name, phone number, email)
    - Total Capacity
    - Ticket Types Available (e.g., Standing, Seated)
5. The organizer updates the necessary fields.
6. The organizer clicks "Save Changes" to confirm the modifications.
7. The system validates the updated input and checks for any missing required fields.
8. If validation passes, the system updates the venue details and displays a confirmation message.

### 02 - Alternate course of events

#### Missing Required Fields
- If the organizer submits the form with missing required fields (e.g., venue name or capacity), the system highlights the missing fields and prompts the organizer to provide the necessary information.

#### Invalid Ticket Capacity
- If the total capacity is set to a value lower than the total tickets already sold for events at this venue, the system displays an error message and prompts the organizer to adjust the capacity or cancel certain tickets.

## Exceptions
- **System Error**: If a system error occurs while saving the updated venue details, the system displays an error message and prompts the organizer to try again later.

## Related UI Prototypes
| Edit Venue Page |
| --- |
| ![Edit Venue](../../UI/organizer/edit_venue.png) |
