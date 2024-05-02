# spring-boot-demo
learnings:

## 
@Controller is used to mark classes as Spring MVC Controller.
@RestController is a convenience annotation that does nothing more than adding the @Controller and @ResponseBody annotations (see: Javadoc)
So the following two controller definitions should do the same

@Controller
@ResponseBody
public class MyController { }

@RestController
public class MyRestController { }



###
Spring scans the classes in your application to identify beans, 
which are typically annotated with stereotypes like @Component, 
@Service, @Repository, or configured using @Bean.

## to run spring boot application :: ./mvnw spring-boot:run

## if you have to hit url you can use:: $ curl http://localhost:8080


