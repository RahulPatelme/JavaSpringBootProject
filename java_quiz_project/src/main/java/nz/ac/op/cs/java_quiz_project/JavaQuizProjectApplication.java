package nz.ac.op.cs.java_quiz_project;

import nz.ac.op.cs.java_quiz_project.service.MyQuizService;
import nz.ac.op.cs.java_quiz_project.service.QuestionService;
import nz.ac.op.cs.java_quiz_project.service.QuizService;
import nz.ac.op.cs.java_quiz_project.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


//@SpringBootApplication annotation is used to mark a configuration class that
//declares one or more @Bean methods and also triggers auto-configuration and
//component scanning.
@SpringBootApplication
public class JavaQuizProjectApplication {

	//@Bean annotation tells that a method produces a bean to be managed by the Spring container.
	@Bean
	public UserService getUserService() {
		return new UserService();
	}
	@Bean
	public QuestionService getQuestionService(){
		return new QuestionService();
	}
	@Bean
	public QuizService getQuizService(){
		return new QuizService();
	}
	@Bean
	public MyQuizService getMyQuizService(){
		return new MyQuizService();
	}
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaQuizProjectApplication.class, args);
	}

}
