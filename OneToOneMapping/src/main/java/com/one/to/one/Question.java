package com.one.to.one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION")
public class Question {
	
	@Id
	private int id;
	@Column(length=200)
	private String question;
	@OneToOne
	private Answer answer;
	
	public Question(int id, String question, Answer answer) {
		
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question() {
	
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	

}
