package com.stackflow.controller;

import java.util.List;

import com.stackflow.beans.Question;
import com.stackflow.exceptions.InvaliQuestionException;
import com.stackflow.exceptions.QuestionNotFoundException;
import com.stackflow.exceptions.QuestionSQLException;
import com.stackflow.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionAnswerController {

    @Autowired
    private QuestionService service;

    @GetMapping("/question")
    public List<Question> getAllQuestions() throws QuestionNotFoundException, QuestionSQLException {
        System.out.println("called getllquestions controller.");
        return service.getAllQuestions();
    }

    @PostMapping("/question")
    public ResponseEntity<Question> insertQuestion(@RequestBody Question question)
            throws InvaliQuestionException, QuestionSQLException {

        return new ResponseEntity<>(service.insertQuestion(question), HttpStatus.CREATED);
    }

    @GetMapping("/question/greater/votes/{votes}")
    public List<Question> getQuestionGreaterThanVotes(@PathVariable("votes") int votes)
            throws QuestionNotFoundException, QuestionSQLException {
        System.out.println("called getQuestionGreaterThanVotes controller.");
        return service.getAllQuestions(votes);
    }

    @GetMapping("/question/{questionId}")
    public Question getQuestion(@PathVariable("questionId") Integer questionId) throws QuestionNotFoundException {
        System.out.println("called getQuestion controller.");
        return service.getQuestion(questionId);
    }

    @GetMapping("/question/votes/{questionId}")
    public int getVotesForQuestion(@PathVariable("questionId") int questionId) {
        System.out.println("called getVotesForQuestion controller.");
        return service.getVotesForQuestion(questionId);
    }

    @DeleteMapping("/question/{questionId}")
    public String deleteQuestion(@PathVariable("questionId") int questionId)
            throws QuestionSQLException, QuestionNotFoundException {
        System.out.println("called deleteQuestion controller.");

        service.deleteQuestion(questionId);
        return "Question deleted " + service.getQuestion(questionId).getQId();
    }
}
