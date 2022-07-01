# API Assignment

## Overview
You are being asked to build a Web API from scratch. This API will need to support only two operations, GET ALL and POST on behalf of a single resource/model.
You will have until 4pm EST to complete the assignment, at which point I will expect all code to be pushed to github and ready for review.

## Instructions  (these can be completed in any order that makes sense to you)
1. Create a new Postgres container with Docker
2. Connect to the database with DBeaver and build your tables in accordance with the Data Model below
3. Create a new Gradle Project and initialize it as a git repository
4. Design your Java Model as a Java Bean in accordance with the Data Model below
5. Build a ConnectionUtility class that utilizes the Singleton Design pattern and can retrieve a connection
6. Design a DAO interface such that it leverages generics in java and defines at least two operations, getAll() and create()
7. Build a repository that implements your DAO interface (getAll() and create()) on behalf of the Data Model listed below
8. Build a service that is able to call your repository NOTE: this service should act as a middle man
9. Build a controller that leverages Javalin Handlers to handle the getAll and create requests
10. Create a Javalin object that can start the web server on port 8080
11. Bind your controller handlers to the Javalin object on a route that matches a pluralized name of the data model, make sure the HTTP action is correct
12. Test your implementation with Postman by building out the requests, have at least 3 records in the db to showcase the getAll properly
13. Once you are happy with the results, take a screenshot of both Postman requests in action and add the images to your project
14. Commit and push your code to a new repository that you created under the organization with the naming convention: firstname_lastname_gremlins-api

## Data Model
Resource Name: Gremlin
Properties:
- name: String
- age: Integer
- color: String   (use an enum if you have the time/ want the practice)
- isEvil: Boolean
