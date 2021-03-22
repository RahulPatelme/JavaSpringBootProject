package nz.ac.op.cs.java_quiz_project.db;

import nz.ac.op.cs.java_quiz_project.models.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
}
