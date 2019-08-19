# DemoSpringBootRestMySQL
This demo intends to supply a quick-start template for Spring Boot REST APIs with MySQL. 

Author: Dr. YUHANG ZHAO

Introduction: 
In this demo we supply a quick-start code base with explanation for constructing a REST service with MySQL.

Big Picture:
- In UserAccountResourse.java, which is a RestController, we have methods to handle HTTP CRUD requests. According to the principle that the database manipulation should be separated from CONTROLLER and located in MODEL, the methods are implemented by calling methods in UserAccountRepository.java;
- In UserAccountRepository.java, which is a MODEL responsible for interaction with DB, we use the constructor to establish the connection with DB. In this class, we also have methods implemented by querying DB.

Future Work: Replace MySQL queries with JPA.

System Configuration:
- Windows 7
- Spring Tool Suite 3.9.9.RELEASE
- Spring Boot v2.1.7.RELEASE
- MySQL Workbench v8.0
- MySQL Connector 8.0.17
- POSTMAN

Reference: 
- "Rest API | Web Service Tutorial" by Telusko. https://www.youtube.com/watch?v=BZi44GOD8kY
- "@PostMapping and @RequestBody Example in Spring MVC" by Sergey Kargopolov. http://appsdeveloperblog.com/postmapping-requestbody-spring-mvc/
