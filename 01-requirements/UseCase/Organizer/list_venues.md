# List Venues Use Case

### **Actor**: Organizer

### **Description**
This use case allows an organizer to view a list of venues available in the event management system for a specific date.

### **Trigger**
The organizer wants to review the available venues to select one for an event on a specific date.

### **Preconditions**
- The organizer must be logged into the system.
- There are venues available in the system.

### **Postconditions**
- The system displays a list of available venues for the selected date.

### **Basic Flow**
1. The organizer selects the "List Venues" option from the venue management menu.
2. The system prompts the organizer to enter the desired date.
3. The system retrieves all available venues for the specified date.
4. The system displays the list of venues, including details such as venue name, address, capacity, and contact information.

### **Alternate Flow**
- **No Venues Found**: If there are no venues available for the selected date, the system displays a message indicating that no venues are available.

### **Exceptions**
- **System Error**: If a system error occurs while retrieving the venues, the system displays an error message and prompts the organizer to try again later.

### **Related UI Prototypes**
|![2](../../UI/organizer/list_venues.png)|
