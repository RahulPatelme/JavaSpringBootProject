// MyQuiz class will make quizes for users.
package nz.ac.op.cs.java_quiz_project.models;

import javax.persistence.*;
import java.util.List;

//Entity class MyQuiz
@Entity
public class MyQuiz {

    //@ID is the primary key
    @Id

    //To generate Id automatically
    @GeneratedValue( strategy= GenerationType.AUTO )
    Long id;
    String start_date;
    Integer amount;

    //This command is connecting QuizUser class via Many to One relation.
    @ManyToOne
    QuizUser user;

    //This command is connecting Question r class via One to Many relation.
    @OneToMany( targetEntity=Question.class )
    private List<Question> questions;

    public MyQuiz(){
    }


    public MyQuiz(Long id, String start_date, Integer amount) {
        this.id = id;
        this.start_date = start_date;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public QuizUser getUser() {
        return user;
    }

    public void setUser(QuizUser user) {
        this.user = user;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
