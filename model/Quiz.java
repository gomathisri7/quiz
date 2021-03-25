package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Quiz {
	private String id;
			
	private HashMap<Question,Answer> quizMap;

	public Quiz(String id) {
		super();
		this.id = id;
	//	questionsInThisQuiz = new ArrayList<Question>();
		quizMap = new HashMap<Question,Answer>();
		
	}

	public String getId() {
		return id;
	}



	public HashMap<Question, Answer> getQuizMap() {
		return quizMap;
	}
	
	public String toString()
	{
		return this.id;
	}

}
