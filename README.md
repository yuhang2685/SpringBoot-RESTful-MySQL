# DemoSpringBootRestMySQL
This demo intends to supply a quick-start template for a project using Spring Boot REST APIs and MySQL. 

Author: Dr. YUHANG ZHAO

Introduction: 
In this demo we supply a quick-start code base with explanation for constructing a REST service with MySQL.

Overview:
According to the principle that the database manipulation should be separated from CONTROLLER and located in MODEL, the methods in UserAccountResourse.java handling HTTP CRUD requests are implemented by calling methods implemented by querying DB in UserAccountRepository.java.

In this demo we covered the use of some new stuffs, i.e.,
HTTP CRUD requests, Postman,
@RestController,
@RequestMapping, @PostMapping, @PutMapping, @DeleteMapping,
@PathVariable,
@RequestBody,
dependency "MySQL-connector", JDBC, MySQL queries.

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
