package com.stackflow.service;

import java.util.List;
import java.util.Optional;

import com.stackflow.beans.Question;
import com.stackflow.exceptions.InvaliQuestionException;
import com.stackflow.exceptions.QuestionNotFoundException;
import com.stackflow.exceptions.QuestionSQLException;
import com.stackflow.interfaces.QuestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Naveen
 * @implNote 1. To build Service Layer for Question Bank 2. This class shall be
 *           considered for testing
 * 
 */

@Component
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    /**
     * @author <Your Name>
     * @apiNote Check if all the fields of the question is passed properly with
     *          below requirement 1. questionId - should be number and value should
     *          be +ve 2. question - should be string with minimum 20 chars 3. uid -
     *          should be number and value should be +ve 4. votes - should always be
     *          zero, When any of the cases fail
     * @throws InvalidQuestionException
     * 
     *                                  when the question is not inserted
     * @throws QuestionSQLException
     */
    public Question insertQuestion(Question question) throws InvaliQuestionException, QuestionSQLException {
        if (question.getQId() < 0 || question.getQuestion().length() < 10 || question.getUserId() < 0
                || question.getVotes() < 0) {
            throw new InvaliQuestionException();
        }
        return questionRepository.save(question);
    }

    /**
     * @author <Your Name>
     * @apiNote This method shall return all the questions which are on the DBMS
     * 
     *          When there are no questions
     * @throws QuestionNotFoundException
     * 
     *                                   When the queries is not successful
     * @throws QuestionSQLException
     * 
     *                                   Refer to IQuestionDAO.List<Question>
     *                                   getAllQuestions() throws SQLException;
     */
    public List<Question> getAllQuestions() throws QuestionNotFoundException, QuestionSQLException {
        return (List<Question>) questionRepository.findAll();
    }

    /**
     * @author <Your Name>
     * @apiNote This method shall return all the questions which has votes greater
     *          than the specified number of votes
     * 
     *          When there are no questions
     * @throws QuestionNotFoundException
     * 
     *                                   When the query is not successful
     * @throws QuestionSQLException
     * 
     *                                   Refer to IQuestionDAO.List<Question>
     *                                   getAllQuestions(int votes) throws
     *                                   SQLException;
     */
    public List<Question> getAllQuestions(int votes) throws QuestionNotFoundException, QuestionSQLException {
        return questionRepository.findAllQuestionByVotes(votes);
    }

    /**
     * @author <Your Name>
     * @apiNote This method shall return question given valid question id when the
     *          question is not found return null
     * 
     *          When there are no question with given id
     * @throws QuestionNotFoundException
     * @see When Question is not found error message should be
     *      "Question Not Found With ID :"+questionId Refer to
     *      IQuestionDAO.Optional<Question> getQuestion(int questionId) throws
     *      SQLException;
     */
    public Question getQuestion(Integer questionId) throws QuestionNotFoundException {
        Optional<Question> question = questionRepository.findById(questionId);

        System.out.println("is present question " + question.isPresent());
        if (question.isPresent()) {
            return question.get();
        }

        System.out.println("*************************");
        question.orElseThrow(() -> new QuestionNotFoundException());

        return new Question();
    }

    /**
     * @author <Your Name>
     * @apiNote This method shall return number of votes for the question given
     *          valid question id when the question is not found return -1
     * 
     *          Refer to IQuestionDAO.Optional<Question> getQuestion(int questionId)
     *          throws SQLException; for implementation
     * 
     */
    public int getVotesForQuestion(int questionId) {
        return questionRepository.findVotesForQuestion(questionId);
    }

    /**
     * @author <Your Name>
     * @apiNote This method shall delete the specified question with questionId
     * 
     *          When Question with ID is not found
     * @throws QuestionSQLException.class
     * 
     * @see IQuestionDAO.boolean deleteQuestion(int questionId) throws SQLException;
     */

    public void deleteQuestion(int questionId) throws QuestionSQLException {
        questionRepository.deleteById(questionId);
    }
}
