package nz.ac.op.cs.java_quiz_project.service;

import nz.ac.op.cs.java_quiz_project.db.QuizUserRepository;
import nz.ac.op.cs.java_quiz_project.models.QuizUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// @Service annotation is used with classes that provide some functionalities.
@Service
public class UserService {

    //Autowiring enables you to inject the object dependency implicitly.
    @Autowired
    private QuizUserRepository userRepository;

    public List<QuizUser> getAllQuizUsers(){
        List<QuizUser> users = new ArrayList<QuizUser>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public QuizUser getQuizUser(String id){
        return userRepository.findById(id).get();
    }

    public void addQuizUser(QuizUser user){
        userRepository.save(user);
    }

    public void updateQuizUser(QuizUser user){
        userRepository.save(user);
    }
    public void deleteQuizUser(String id){
        userRepository.deleteById(id);
    }

}
