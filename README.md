The application is my first application using Spring Boot. 
I have implemented the main the Dependency Injection concept of Spring Boot.


Find the main java files at:
https://github.com/gobsyats/FirstSpringBootApplication/tree/master/myfirstspringapplication/src/main/java/com/example/demo

The Person, Car, CellPhone are Pojo classes and also the components in the Spring Container and are created using the keyword @Component.

Person uses the Car and CellPhone objects through Dependency Injection or using the annotation @Autowired.

The ConfigurableApplicationContext or the run method which is the main SpringBoot method is in DemoApplication class.
DemoApplication explicitly uses the Person object to inject dependencies for Car and CellPhone object.

I have created the project using SpringToolSuite or STS which provides auto-configuration and embedded dependencies.
You can also use Eclipse but you will have to download the starter project from https://start.spring.io/ first and then import the downloaded project in Eclipse to resolve the SpringBoot required dependencies. 
You can also use Eclipse but you will have to download the starter project from https://start.spring.io/ first and then import the downloaded project in Eclipse to resolve the SpringBoot required dependencies. 