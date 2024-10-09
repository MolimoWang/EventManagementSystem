# Display Date Use Case

### **Actor**: Organizer

### **Description**
This use case allows an organizer to navigate to a specific date to view the current events scheduled for that date or add new events.

### **Trigger**
The organizer wants to:
- View the events scheduled for a particular date
- Create a new event for a particular date
- Modify existing events scheduled for that date

### **Preconditions**
- The organizer must be logged into the system.

### **Postconditions**
- The selected date and all events scheduled for that date will be displayed on the screen.

### **Basic Flow**
1. The organizer enters the date they want to view.
2. The system displays the events scheduled for that date, including details such as event name, time, and venue.

### **Related UI Prototypes**
| Display Events for Date Page |
| --- |
| ![Display Events for Date](ui/DisplayEventsForDate.png) |

### **Inclusions**
None

### **Data Outcomes**
**READ** - The system retrieves the details of the existing events for the specified date.