## Data Persistence

do we remember role?

1. Administrator: id: Long, name: String, email: String, password: String, role: ROLE
2. Organiser: id: Long, name: String, email: String, password: String, role: ROLE, address: String, companyName: String, phoneNumber: String
3. Customer: id: Long, name: String, email: String, password: String, role: ROLE
4. Ticket: id: Long, type: String, price: Double
5. TicketQuantity: id: Long, numberSold: int, price: Double
6. TicketAvailability: id: Long, ticketTypeName: String, numberAvailable: int
7. Venue: id: Long, name: String, address: String, contactName: String, contactPhoneNumber: String, contactEmail: String, capacity: TicketAvailability[*]
8. Event: id: Long, name: String, description: String, date: Date, time: Time, venue: Venue

## Relationships

1. Customer - Ticket (1 to many)
2. Ticket - Event (1 to 1)
3. Ticket - TicketQuantity (1 to 1)
4. TicketAvailability - TicketQuantity (1 to 1)  Do we describe inheritance?
5. Venue - TicketAvailability (1 to many)
6. Venue - Event (1 to many)
7. Event - EventQuantity (1 to many)
8. Organiser - Event (1 to many)