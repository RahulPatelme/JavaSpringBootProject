package nz.ac.op.cs.java_quiz_project.db;

import nz.ac.op.cs.java_quiz_project.models.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
