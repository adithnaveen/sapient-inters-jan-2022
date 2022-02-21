package com.stackflow.interfaces;

import java.util.List;

import com.stackflow.beans.Question;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {

    @Query(value = "select votes from question where q_id=?1", nativeQuery = true)
    public int findVotesForQuestion(int qId);

    @Query(value = "select * from question where votes > ?1", nativeQuery = true)
    public List<Question> findAllQuestionByVotes(int votes);

}
