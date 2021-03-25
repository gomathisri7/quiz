package model;

public class Question {
	
	private String id;
	
	private String questionName;
	

	public Question(String id, String questionName) {
		super();
		this.id = id;
		this.questionName = questionName;
	}

	public String getId() {
		return id;
	}

	public String getQuestionName() {
		return questionName;
	}

}
