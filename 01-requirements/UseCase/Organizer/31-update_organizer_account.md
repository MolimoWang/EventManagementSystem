# Update Organizer Account Use Case

## Description
This use case allows an organizer to update their account information in the event management system, such as name, address, company name, email, password, and phone number. The organizer can also view a summary of their past and future events.

## Actors
- Organizer

## Triggers
- The organizer wants to update their account details or review their event history.

## Preconditions
- The organizer must be logged into the system.
- The organizer has appropriate privileges to modify their account information.

## Postconditions
- The organizer's account details are updated in the system and the changes are reflected in their profile.

## Courses of Events

### 01 - Basic course of events

#### Course of Events
1. The organizer selects the "Update Account" option from their account management menu.
2. The system displays a form with the current organizer account details, including:
    - Name
    - Address
    - Company Name
    - Email
    - Password
    - Phone Number
    - Summary of Past Events (event name, date, address, and number of people reserved)
    - Summary of Future Events (event name, date, address, and number of people reserved)
3. The organizer updates the necessary fields.
4. The organizer clicks "Save Changes" to confirm the modifications.
5. The system validates the updated input and checks for any missing required fields or invalid values.
6. If validation passes, the system updates the account details and displays a confirmation message.

### 02 - Alternate course of events

#### Missing Required Fields
- If the organizer submits the form with missing required fields (e.g., name, email), the system highlights the missing fields and prompts the organizer to provide the necessary information.

#### Invalid Email or Password
- If the email format is invalid or the password does not meet security requirements, the system displays an error message and prompts the organizer to enter a valid email or password.

## Exceptions
- **System Error**: If a system error occurs while saving the updated account details, the system displays an error message and prompts the organizer to try again later.

## Related UI Prototypes
| Update Organizer Account Page                                                                       |
|-----------------------------------------------------------------------------------------------------|
| ![Update Organizer Account](../../UI/organizer/31-update_organizer_account.png)                     |
| Missing Required Fields                                                                             |
| ![Add Venue](../../UI/organizer/Alternative/update_organizer_account_Missing Required Fields.png)   |
| Invalid Email or Password                                                                           |
| ![Add Venue](../../UI/organizer/Alternative/update_organizer_account_Invalid Email or Password.png) |