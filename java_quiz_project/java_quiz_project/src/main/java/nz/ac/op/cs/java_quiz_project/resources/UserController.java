package nz.ac.op.cs.java_quiz_project.resources;

import nz.ac.op.cs.java_quiz_project.models.QuizUser;
import nz.ac.op.cs.java_quiz_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Spring RestController annotation is used to create RESTful web services using Spring MVC.
@RestController
public class UserController {

    //Autowiring enables you to inject the object dependency implicitly.
    @Autowired
    private UserService userService;

    //Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/users")
    public List<QuizUser> getQuizUsers(){
        return userService.getAllQuizUsers();
    }

    //Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/users/{id}")
    public QuizUser getQuizUser(@PathVariable String id){
        return userService.getQuizUser(id);
    }

    //Annotation for mapping HTTP POST requests onto specific handler methods.
    @PostMapping("/users")
    public void addQuizUser(@RequestBody QuizUser quizUser){
        userService.addQuizUser(quizUser);

    }

    //Annotation for mapping HTTP PUT requests onto specific handler methods.
    @PutMapping("/users")
    public void updateQuizUser(@RequestBody QuizUser quizUser){
        userService.updateQuizUser(quizUser);
    }

    //Annotation for mapping HTTP DELETE requests onto specific handler methods.
    @DeleteMapping("/users/{id}")
    public void deleteQuizUser(@PathVariable String id){
        userService.deleteQuizUser(id);
    }
}
