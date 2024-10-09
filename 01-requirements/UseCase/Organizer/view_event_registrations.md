# View Event Registration Use Case

### **Actor**: Organizer

### **Description**
This use case allows an organizer to view the registration details of a specific event, focusing on the information about users who have registered for the event, including their contact details and ticket sales.

### **Trigger**
The organizer wants to see the registration details for a specific event they have created, including participant information and ticket sales.

### **Preconditions**
- The organizer must be logged into the system.
- The event must exist in the system.

### **Postconditions**
- The system displays the registration details for the selected event, including the list of registered users.

### **Basic Flow**
1. The organizer selects the "View Event Registration" option from the list of events.
2. The system retrieves the registration details of the selected event.
3. The system displays the registration details, including:
    - Event Name
    - Date and Time
    - Venue
    - Registered Participants (names, contact information)
    - Ticket Information (availability, types, prices, number of tickets sold, remaining tickets)

### **Alternate Flow**
- **Event Not Found**: If the selected event does not exist, the system displays an error message and prompts the organizer to select a valid event.

### **Exceptions**
- **System Error**: If a system error occurs while retrieving the registration details, the system displays an error message and prompts the organizer to try again later.

### **Related UI Prototypes**
|![2](../../UI/organizer/view_event_regitrations.png)|
