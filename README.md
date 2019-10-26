## SpringBoot-RESTful-MySQL

Construct a `RESTful` web service using `SpringBoot` and `MySQL`. 

#### Author: Dr. YUHANG ZHAO

### Overview:
The methods handling `HTTP` `CRUD` requests reside in `Web` layer (`controller` component),
and are implemented by calling methods in `Service` layer
which are implemented by methods in `Repository` layer for querying DB.
Such modularization separates concerns.

![ApplicationArchitecture](https://github.com/yuhang2685/SpringBoot-RESTful-MySQL/blob/master/ApplicationLayers.png)

### In this demo we covered the applications of following concepts:
- HTTP CRUD requests
- Postman
- @RestController
- @RequestMapping
- @PostMapping
- @PutMapping
- @DeleteMapping
- @PathVariable
- @RequestBody
- Dependency "MySQL-connector" 
- JDBC
- MySQL queries


### System Configuration:
- Windows 7
- Java 1.8
- Spring Boot v2.1.7.RELEASE
- MySQL Connector 8.0.17

### Related Projects
[SpringBoot-RESTful-MySQL-JPA](https://github.com/yuhang2685/SpringBoot-RESTful-MySQL-JPA),
which is a `RESTful` web service using `SpringBoot` and `JPA` for `MySQL`.


### Reference: 
- "Rest API | Web Service Tutorial" by Telusko. https://www.youtube.com/watch?v=BZi44GOD8kY
- "@PostMapping and @RequestBody Example in Spring MVC" by Sergey Kargopolov. http://appsdeveloperblog.com/postmapping-requestbody-spring-mvc/
