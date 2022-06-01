# Project 1 Requirements

In this project you will be building a Car Dealership Web API. This is NOT a full stack assignment, so there will not be a UI element, just an API to serve data to be consumed via Postman.

The project will be due at **10:00am EST on 06/24/2022** and should be pushed to a remote GitHub repository under the following naming convention: 
<br> **first_last_p1**
<br> Ex: **brandon_pinkerton_p1**

## Tech Stack
- Java 8
- Gradle
- JUnit 5
- Log4J
- Javalin
- JDBC
- PostgreSQL
- Postman
- Git

## Requirements
1. API Functionality should reflect the user stories listed below
2. Data is stored in a database, not in application memory
3. Data Access is performed through the use of JDBC in a data layer consisting of Data Access Objects
4. All Exceptions are properly handled and logged to a file utilizing Log4J
5. All Service-Layer methods have one or many corresponding test cases (I suggest practicing TDD)
6. Project is well organized and operations and methods are contained within appropriate classes.

## Specifications
1. Users should have two roles to choose from: CUSTOMER, EMPLOYEE
2. Offers should have three status options: OPEN, APPROVED, REJECTED
3. Your API should effictively utilize Authentication. I.e. only users with a specific role should be able to perform certain operations.
4. You will likely need the following Endpoints:
- Users: to handle CRUD operations for the User model
- Cars: to handle CRUD operations for the Car model
- Offers: to handle CRUD operations for the Offer model
- (stretch goal) Payments: to handle CRUD operations for the Payment model

## User Stories
[ ] - As a non-user, I can create a Customer or Employee Account
[ ] - As a Customer, I can view available Cars on the lot
[ ] - As a Customer, I can make an Offer on an available Car
[ ] - As a Customer, I can view my open offers
[ ] - As a Customer, I can view the Cars that I own
[ ] - As an Employee, I can add a new Car to the lot
[ ] - As an Employee, I can accept or reject an Offer on a Car

## Stretch Goals
[ ] - As a Customer, I can setup a Payment Plan to pay off a Car's balance
[ ] - As a Customer, I can view my existing Payment Plans
[ ] - As a Customer, I can make a Payment

## Presentation
Your presentation will consist of a demonstration of your API. You will be given 5 minutes to showcase the completed User Stories listed above in Postman to demonstrate the functionality of the API. The demo will be followed by technical questions from your trainer about your project.
