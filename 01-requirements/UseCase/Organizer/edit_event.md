# Edit Event Use Case

### **Actor**: Organizer

### **Description**
This use case allows an organizer to edit the details of an existing event in the event management system, such as the event name, date, time, venue, or ticket information.

### **Trigger**
The organizer wants to update information about an event due to changes in schedule or other reasons.

### **Preconditions**
- The organizer must be logged into the system.
- The organizer has appropriate privileges to edit the event.
- The event must already exist in the system.

### **Postconditions**
- The event details are updated in the system and the changes are reflected for users viewing the event.

### **Basic Flow**
1. The organizer selects the "Edit Event" option from the event management menu.
2. The system displays a list of events created by the organizer.
3. The organizer selects the event they wish to edit.
4. The system displays a form with the current event details.
5. The organizer updates the necessary fields (e.g., name, date, time, venue, ticket information).
6. The organizer clicks "Save" to confirm the changes.
7. The system validates the updated input and checks for any missing required fields.
8. If validation passes, the system updates the event details and displays a confirmation message.

### **Alternate Flow**
- **Missing Required Fields**: If the organizer submits the form with missing required fields (e.g., event name or date), the system highlights the missing fields and prompts the organizer to provide the necessary information.
- **Venue Unavailable**: If the selected venue is not available for the updated date and time, the system displays an error message and prompts the organizer to choose a different venue or date.

### **Exceptions**
- **System Error**: If a system error occurs while saving the updated event, the system displays an error message and prompts the organizer to try again later.

### **Related UI Prototypes**
