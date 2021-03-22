package nz.ac.op.cs.java_quiz_project.resources;

import nz.ac.op.cs.java_quiz_project.models.Task;
import nz.ac.op.cs.java_quiz_project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Spring RestController annotation is used to create RESTful web services using Spring MVC.
@RestController
public class TaskController {

    //Autowiring enables you to inject the object dependency implicitly.
    @Autowired
    private TaskService taskService;

    //Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return taskService.getAllTasks();
    }

    //Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable Integer id){
        return taskService.getTask(id);
    }

    //Annotation for mapping HTTP POST requests onto specific handler methods.
    @PostMapping("/tasks")
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }

    //Annotation for mapping HTTP PUT requests onto specific handler methods.
    @PutMapping("/tasks")
    public void updateQuizUser(@RequestBody Task task){
        taskService.updateTask(task);
    }

    //Annotation for mapping HTTP DELETE requests onto specific handler methods.
    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable Integer id){
        taskService.deleteTask(id);
    }
}
