package model;

public class Answer {
	private String id;
	private String answerToQuestion;
	
	public String getId() {
		return id;
	}

	public Answer(String id, String answerToQuestion) {
		super();
		this.id = id;
		this.answerToQuestion = answerToQuestion;
	}


	public String getAnswerToQuestion() {
		return answerToQuestion;
	}

}
