package nz.ac.op.cs.java_quiz_project.resources;

import nz.ac.op.cs.java_quiz_project.models.Quiz;
import nz.ac.op.cs.java_quiz_project.models.QuizUser;
import nz.ac.op.cs.java_quiz_project.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Spring RestController annotation is used to create RESTful web services using Spring MVC.
@RestController
public class QuizController {

    //Autowiring enables you to inject the object dependency implicitly.
    @Autowired
    private QuizService quizService;

    //Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/quiz")
    public List<Quiz> getQuiz(){
        return quizService.getAllQuizzs();
    }

    //Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/quiz/{id}")
    public Quiz getQuiz(@PathVariable Long id)
    {
        return quizService.getQuiz(id);
    }

    //Annotation for mapping HTTP GET requests onto specific handler methods.
    @PostMapping("/quiz")
    public void addQuiz(@RequestBody QuizUser quizUser){
        quizService.createQuiz(quizUser, 10);

    }

    //Annotation for mapping HTTP DELETE requests onto specific handler methods.
    @DeleteMapping("/quiz/{id}")
    public void deleteQuizUser(@PathVariable Long id){

        quizService.deleteQuiz(id);
    }
}
