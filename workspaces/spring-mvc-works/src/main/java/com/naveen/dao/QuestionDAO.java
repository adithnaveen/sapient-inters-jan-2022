package com.naveen.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.naveen.beans.Question;

@Component
public class QuestionDAO {

	// you might have connect with DB to get the questions

	public List<Question> getAllQuestion() {
		return Arrays.asList(

				new Question("Who founded Java", "Jamesh Gostling", "Bill Gates", "Steve Jobs", "Patirck Naughton"),
				new Question("who is president of india", "Mr. Gandhi", "Mr. APJ Abdul Kalam", "Mrs. Prathiba",
						"Mr. Ramnath Kovind"),
				new Question("India Belongs to which continent", "Asia", "Africa", "America", "Europe"),
				new Question("Bengaluru is capital of ", "Tamil Nadu", "Delhi", "AndraPradesh", "Karnataka"));
	}

	public boolean saveQuestion(Question question) {
		System.out.println("Question " + question.getQuestion());
		System.out.println("Option 1 " + question.getOption1());
		System.out.println("Option 2 " + question.getOption2());
		System.out.println("Option 3 " + question.getOption3());
		System.out.println("Option 4 " + question.getOption4());
		
		return question.getQuestion().length() > 6;

	}
}
