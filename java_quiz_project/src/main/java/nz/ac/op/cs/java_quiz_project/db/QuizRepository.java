package nz.ac.op.cs.java_quiz_project.db;

import nz.ac.op.cs.java_quiz_project.models.Quiz;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends CrudRepository<Quiz,Long> {
}
