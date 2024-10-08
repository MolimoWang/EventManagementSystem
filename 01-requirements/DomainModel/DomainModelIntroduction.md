# Domain Model Introduction

## Overview
This domain model diagram shows a system based on account management, event management, and venue management. The main entities such as users, administrators, organizers, events, tickets, and venues and their properties, relationships, and behaviors are defined in the model.

## Entities and Attributes

### Account
- `name`: The name of the account holder.
- `email`: The account holder's email.
- `password`: The password for the account.

### User (a subclass of Account)

### Administrator (a subclass of Account)

### Organizer (a subclass of Account)
- `address`: The address of the organizer.
- `companyName`: The company name of the organizer.
- `phoneNumber`: The contact number for the organizer.

### Venue
- `name`: Name of the venue.
- `address`: The address of the venue.
- `contactName`: The name of the contact.
- `contactPhoneNumber`: The contact's phone number.
- `contactEmail`: Contact email.
- `capacity`: The number of people in the venue.

### Event
- `name`: The name of the activity.
- `description`: Description of the activity.
- `date`: Date of the event.
- `time`: The activity time.

### Ticket
- `type`: Type of ticket.
- `price`: The price of admission.
- `available_number`: The number of tickets available.
- `sold_number`: Number of tickets sold.

## Relationships

- **Administrator**, **Organizer**, and **User** all inherit from **Account** and therefore share basic attributes of the account (name, email, and password).
- A **Venue** can host multiple events; an **Event** corresponds to one **Venue**.
- One **Event** can generate multiple tickets; a **Ticket** corresponds to one **Event**.
- An **Organizer** can organize multiple events; an event could have many organizers.
- A **User** can have multiple tickets. But each **Ticket** only belongs to one user.

## Summary
This domain model diagram clearly shows the main roles in the system and their relationships, helping the development team to maintain an understanding of the system structure during design and implementation.
