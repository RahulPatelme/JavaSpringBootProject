package nz.ac.op.cs.java_quiz_project.service;

import nz.ac.op.cs.java_quiz_project.db.QuizRepository;
import nz.ac.op.cs.java_quiz_project.models.Quiz;
import nz.ac.op.cs.java_quiz_project.models.QuizUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

// @Service annotation is used with classes that provide some functionalities.
@Service
public class QuizService {

    //Autowiring enables you to inject the object dependency implicitly.
    @Autowired
    private QuizRepository quizRepository;


    public void createQuiz(QuizUser quizUser, Integer amount){
        Quiz quiz = new Quiz();
        quiz.setStart_date("16 March 2021");
        quiz.setAmount(amount);
        quiz.setUser(quizUser);

        quizRepository.save(quiz);
    }

    public List<Quiz> getAllQuizzs(){
        List<Quiz> quizzes = new ArrayList<Quiz>();
        quizRepository.findAll().forEach(quizzes::add);
        return quizzes;
        //return quizUsers;
    }

    public Quiz getQuiz(Long id) {
        return quizRepository.findById(id).get();
    }
    public void deleteQuiz(Long id){
        quizRepository.deleteById(id);
    }
}
