package nz.ac.op.cs.java_quiz_project.service;

import nz.ac.op.cs.java_quiz_project.db.TaskRepository;
import nz.ac.op.cs.java_quiz_project.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// @Service annotation is used with classes that provide some functionalities.
@Service
public class TaskService {

    //Autowiring enables you to inject the object dependency implicitly.
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        List<Task> tasks = new ArrayList<Task>();
        taskRepository.findAll().forEach(tasks::add);
        return tasks;
        //return quizUsers;
    }

    public Task getTask(Integer id){
        return taskRepository.findById(id).get();

    }

    public void addTask(Task task){
        taskRepository.save(task);
        //quizUsers.add(user);
    }

    public void updateTask(Task task){
        taskRepository.save(task);
    }
    public void deleteTask(Integer id){
        taskRepository.deleteById(id);
    }
}
