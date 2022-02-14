package com.naveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naveen.dao.QuestionDAO;

@Controller
public class QuestionController {
	@Autowired
	QuestionDAO dao; 
	
	// methods 
	
	@RequestMapping( method = RequestMethod.GET,   path="/all-question")
	public String getAllQuestions(Model model) {
		model.addAttribute("TITLE", "List Of Questions"); 
		model.addAttribute("QUESTIONS", dao.getAllQuestion()); 
		
		return "show-questions";
	}
	
}
