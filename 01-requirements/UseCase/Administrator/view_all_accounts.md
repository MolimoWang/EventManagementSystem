# Use Case: View All Accounts

## Description
- This use case allows the administrator to view a list of all accounts (administrators, organizers, and users).

## Actors
- Administrator

## Triggers
- The administrator decides to view all existing accounts in the system.

## Preconditions
- The administrator must be logged into the system.

## Postconditions
- The administrator is able to view the details of all accounts in the system.

## Courses of Events

### 01 - Basic course of events -

#### Course of Events
- The administrator selects 'View All Accounts' from the 'View All Events' page.
- The system retrieves and displays a list of all existing accounts (administrators, organizers, users).

#### Related UI Prototypes
- Account list view

### 02 - Alternate course of events -

#### No Accounts Found
- The system shows that no accounts exist in the system.

#### Related UI Prototypes
- Message indicating no accounts found
