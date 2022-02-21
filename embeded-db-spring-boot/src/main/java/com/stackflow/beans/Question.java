package com.stackflow.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question implements Serializable {
    @Id
    private int qId;
    @Column
    private String question;
    private int userId;
    private int votes;

    public Question() {
    }

    public Question(int qId, String question, int userId, int votes) {
        this.qId = qId;
        this.question = question;
        this.userId = userId;
        this.votes = votes;
    }

    public int getQId() {
        return this.qId;
    }

    public void setQId(int qId) {
        this.qId = qId;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVotes() {
        return this.votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "{" + " qId='" + getQId() + "'" + ", question='" + getQuestion() + "'" + ", userId='" + getUserId() + "'"
                + ", votes='" + getVotes() + "'" + "}";
    }

}
