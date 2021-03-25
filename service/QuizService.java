package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Answer;
import model.Question;
import model.Quiz;

public class QuizService {
	
	HashMap<Quiz,Integer> quizAttended = new HashMap<Quiz,Integer>();
	
	HashMap<Integer,Quiz> quizzesCreated = new HashMap<Integer,Quiz>();
	
	//List<Question> questions = new ArrayList<Question>();
	
	public void listQuizzes(int pagination)
	{		
		int page=1;
		for(Map.Entry<Quiz, Integer> map :quizAttended.entrySet())
		{
			if(pagination % page==0)
			{
				System.out.println("Page "+page);
			}
			System.out.println("Quiz ID "+map.getKey().getId()+" with score "+map.getKey());
			page++;
		}
	}
	
	public void createQuiz(String id,int numberOfQuestions,ArrayList<String> questions,ArrayList<String> answers )
	{
		Quiz quizCreated = new Quiz(id);
		
		for(int i=0;i<numberOfQuestions;i++)
		{
			Question qn = createQuestion(String.valueOf(i+1),questions.get(i));
			//quizCreated.getQuestionsInThisQuiz().add(qn);
			quizCreated.getQuizMap().put(qn,createAnswer(String.valueOf(i+1),answers.get(i)) );
		}
	}
	
	public Question createQuestion(String id,String questionName)
	{
		return new Question(id,questionName);
	}
	
	public Answer createAnswer(String id, String answer)
	{
		return new Answer(id,answer);
	}
		
	public void attendQuiz(int quizId,ArrayList<String> answers)
	{
		Quiz test = quizzesCreated.get(quizId);
		int i=0,marksCount=0;
		HashMap<Question,Answer> questionMap = test.getQuizMap();
		for(Map.Entry<Question, Answer> map :questionMap.entrySet())
		{
			if(verifyAnswer(map.getValue(),answers.get(i)))
			{
				marksCount++;
			}
			i++;
		}
		quizAttended.put(test, marksCount);
	}
	
	public boolean verifyAnswer(Answer answer,String userAnswer)
	{
		return answer.getAnswerToQuestion().equalsIgnoreCase(userAnswer);
	}
}
