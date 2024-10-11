# View Organizer Account Use Case

## Description
This use case allows an organizer to view their account information, such as name, address, company name, email, and phone number. The organizer can also view a summary of their past and future events in the event management system.

## Actors
- Organizer

## Triggers
- The organizer wants to view their account information and review the list of past and future events.

## Preconditions
- The organizer must be logged into the system.
- The organizer has appropriate privileges to view their account information.

## Postconditions
- The organizer's account details and associated events are displayed in a read-only format.

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "View Account" option from the account management menu.
2. The system displays the organizer's account details, including:
    - Name
    - Address
    - Company Name
    - Email (displayed as read-only)
    - Password (displayed as masked input, e.g., "********")
    - Phone Number
3. Below the account details, the system displays a summary of the organizer's past events, with the following information:
    - Event Name
    - Event Date
    - Event Address
    - Number of People Reserved
4. The system also displays a summary of future events in a similar format to past events.
5. The organizer can click the "Edit" button to modify their account information (handled in the "Edit Organizer Account" use case).

### 02 - Alternate course of events

#### No Events Available
- If there are no past or future events associated with the organizer, the system displays an empty state message, such as "No Events Available".

## Exceptions
- **System Error**: If a system error occurs while retrieving the account details or event information, the system displays an error message and prompts the organizer to try again later.

## Related UI Prototypes
| View Organizer Account Page |
| --- |
| ![View Organizer Account](../../UI/organizer/30-view_organizer_account.png) |
