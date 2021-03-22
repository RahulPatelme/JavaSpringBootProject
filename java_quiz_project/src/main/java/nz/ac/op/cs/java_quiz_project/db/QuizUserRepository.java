package nz.ac.op.cs.java_quiz_project.db;

import nz.ac.op.cs.java_quiz_project.models.QuizUser;
import org.springframework.data.repository.CrudRepository;

public interface QuizUserRepository  extends CrudRepository<QuizUser, String>{
}
