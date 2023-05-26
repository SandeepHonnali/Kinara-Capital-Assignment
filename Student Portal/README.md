# Spring-Boot-Student-Portal

A student portal  that acts as an  portal between students and the admin. T It contains an admin who can enter details of students. 

# Student API's

Students can then Register and login using provided user id password and edit their profile details and image. When students login they can see their own marks details.

# Admin

Now admin can ad details of Students marks. These are marks of  4 subjects each. 

# Spring Boot

I have used spring boot to implement this application. This application is simple and I have used some spring boot modules while developing.

  I have used Rest Apis using spring boot start web.
  
  We can implement rest api by using annotations such as
  
  # @RestController
  To mark class as the controller we use it is the combination of @controller and @ResponseBody to write response back to server in the json format(we can also write XML based response).
  
  @GetMapping
  @PutMapping
  @PostMapping
  @DeleteMapping 
  
  These are the alternatives to the @RequestMapping where we give specific method as the input
  
  # Service
  Service Layer to write bit of buisness logic
  
  # Repository(DAO)
  This is the data access layer, we can perform data based related operation. I have used Spring-Boot-Data-JPA using CrudRepository using mysql database added in class path.
  
  # Spring Security
  I have implemented spring api security using spring-security-starter with database.
  
  # Logging
  Logging used to log the operations to log file
  
  # Swagger
  Swagger is used to keep the documentation of rest api's. It show and generates documentation automatically for rest apis.
  
  
  
 


