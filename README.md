# Random_Number_Generator_in_Spring_Boot_Application


This Spring Boot application creates a REST API to manage student data, utilizing Spring's web handling and MySQL database integration. Its key feature is a random number generator, producing unique IDs within a specified range. This function highlights how Spring Boot can efficiently generate distinct identifiers, enhancing the program's utility for student record management.


This is the End point

POST:
http://localhost:8080/student/save


json

{
    "studentname": "ashan",
    "address": "kahathuduwa",
    "mobile": "0769800565",
    "active": true
}
