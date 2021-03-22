package nz.ac.op.cs.java_quiz_project.service;

import nz.ac.op.cs.java_quiz_project.db.QuestionRepository;
import nz.ac.op.cs.java_quiz_project.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// @Service annotation is used with classes that provide some functionalities.
@Service
public class QuestionService {

    //Autowiring enables you to inject the object dependency implicitly.
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions(){
        List<Question> questions = new ArrayList<Question>();
        questionRepository.findAll().forEach(questions::add);
        return questions;

    }

    public Question getQuestion(Long id){
        return questionRepository.findById(id).get();

    }
    public void addQuestions(List<Question> questions){
        for(Question q:questions){
            questionRepository.save(q);
        }

    }

    public void addQuestion(Question question){
        questionRepository.save(question);
        //quizUsers.add(user);
    }

    public void updateQuestion(Question question){
        questionRepository.save(question);
    }
    public void deleteQuestion(Long id){
        questionRepository.deleteById(id);
    }


}
