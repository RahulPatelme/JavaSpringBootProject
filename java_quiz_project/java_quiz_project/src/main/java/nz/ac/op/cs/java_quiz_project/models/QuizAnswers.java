package nz.ac.op.cs.java_quiz_project.models;

import java.util.List;

public class QuizAnswers {
    String userId;
    Long quizId;
    List<nz.ac.op.cs.java_quiz_project.models.UserAnswer> answers;

    public QuizAnswers() {

    }

    public QuizAnswers(String userId, Long quizId, List<nz.ac.op.cs.java_quiz_project.models.UserAnswer> answers)  {
        this.userId = userId;
        this.quizId = quizId;
        this.answers = answers;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getQuizId() {
        return quizId;
    }
    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public List<nz.ac.op.cs.java_quiz_project.models.UserAnswer> getAnswers() {
        return answers;
    }
    public void setAnswers(List<nz.ac.op.cs.java_quiz_project.models.UserAnswer> answers) {
        this.answers = answers;
    }

}


