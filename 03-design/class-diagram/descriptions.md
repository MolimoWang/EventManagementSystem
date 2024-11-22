## Data Persistence

1. Administrator: id: Long, name: String, email: String, password: String, role: Role,is_active : Boolean
2. Organiser: id: Long, name: String, email: String, password: String, role: Role, address: String, companyName: String, phoneNumber: String,is_active : Boolean
3. Customer: id: Long, name: String, email: String, password: String, role: Role,is_active : Boolean
4. Ticket: id: Long, type: String, price: Double, customerId : Long,eventId : Long
5. TicketQuantity: id: Long, ticketTypeName: String, numberAvailable: int, numberSold: int, price: Double
6. TicketAvailability: id: Long, ticketTypeName: String, numberAvailable: int
7. Venue: id: Long, name: String, address: String, contactName: String, contactPhoneNumber: String, contactEmail: String, capacity: TicketAvailability[*]
8. Event: id: Long, name: String, description: String, date: Date, time: Time, venue: Venue

## Relationships

1. Customer -> Ticket (1 to many)
2. Ticket -> Customer (1 to 1)
3. Ticket -> Event (1 to 1)
4. Event -> Ticket (1 to many)
5. Ticket <-> TicketQuantity (1 to 1)
6. Venue -> TicketAvailability (1 to many)
7. TicketAvailability -> Venue (1 to 1)
8. Venue -> Event (1 to many)
9. Event -> Venue (1 to 1)
10. Event -> TicketQuantity (1 to many)
11. TicketQuantity -> Event (1 to 1)
12. Organiser -> Event (1 to many)
13. Event -> Organiser (1 to 1)