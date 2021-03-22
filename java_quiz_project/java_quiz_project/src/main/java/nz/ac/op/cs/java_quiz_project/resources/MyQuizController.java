package nz.ac.op.cs.java_quiz_project.resources;

import com.fasterxml.jackson.core.JsonProcessingException;

import nz.ac.op.cs.java_quiz_project.models.MyQuiz;
import nz.ac.op.cs.java_quiz_project.models.MyQuizParam;
import nz.ac.op.cs.java_quiz_project.service.MyQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Spring RestController annotation is used to create RESTful web services using Spring MVC.
@RestController
public class MyQuizController {

    //Autowiring enables you to inject the object dependency implicitly.
    @Autowired
    private MyQuizService myQuizService;

    //Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/myquiz")
    public List<MyQuiz> getQuiz(){
        return myQuizService.getAllQuiz();
    }

    //Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/myquiz/{id}")
    public MyQuiz getQuiz(@PathVariable Long id)
    {
        return myQuizService.getQuiz(id);
    }

    //Annotation for mapping HTTP POST requests onto specific handler methods.
    @PostMapping("/myquiz")
    public void addQuiz(@RequestBody MyQuizParam quizParam) throws JsonProcessingException {
        myQuizService.createQuiz(quizParam);
    }

    //Annotation for mapping HTTP DELETE requests onto specific handler methods.
    @DeleteMapping("/myquiz/{id}")
    public void deleteQuiz(@PathVariable Long id){
        myQuizService.deleteQuiz(id);
    }
}
