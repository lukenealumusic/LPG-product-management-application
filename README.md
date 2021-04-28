# LPG-product-management-application


Application to persist two small data sets, and pull a list of formatted data into a table into React.

How to run:

1. Run `docker-compose up -d` to start sql container

2. Run ApiApplication as a Spring Boot application.

3. `cd ./ui` and `npm install` then `npm start` to run React application.


Notes:

I ran out of time on this one. 

The React application is non-functional. I chose Material table as I have experience using it in Angular.

The JPA fetch for Categories on Products is broken, although the constraints seemed to
have worked in the database. That would be my first thing to fix.

I would have written two small unit tests for the Controller and the Service using Mockito.
