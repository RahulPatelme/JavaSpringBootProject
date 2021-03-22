package nz.ac.op.cs.java_quiz_project.db;

import nz.ac.op.cs.java_quiz_project.models.MyQuiz;
import org.springframework.data.repository.CrudRepository;


public interface MyQuizRepository extends CrudRepository<MyQuiz, Long> {
}
