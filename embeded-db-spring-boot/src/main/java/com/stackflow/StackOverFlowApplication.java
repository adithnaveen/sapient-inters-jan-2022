package com.stackflow;

import com.stackflow.beans.Question;
import com.stackflow.interfaces.QuestionRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StackOverFlowApplication {

	private static final Logger log = LoggerFactory.getLogger(StackOverFlowApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StackOverFlowApplication.class, args);
	}

	@Bean
	public CommandLineRunner questionDemo(QuestionRepository repository) {
		return (args) -> {
			repository.save(new Question(101, "What is the size of world", 2001, 0));
			repository.save(new Question(102, "When did Dr. Rajkumar born", 2001, 10));
			repository.save(new Question(103, "How many computer languages are in use? ", 2002, 0));

			// fetch all questions
			log.info("Questions Inserted:");
			log.info("-------------------------------");
			for (Question question : repository.findAll()) {
				log.info(question.toString());
			}
			log.info("");
		};
	}

}
