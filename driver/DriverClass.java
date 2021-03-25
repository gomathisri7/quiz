package driver;

import java.util.ArrayList;
import java.util.Scanner;

import service.QuizService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> questions = new ArrayList<String>();
		ArrayList<String> answers = new ArrayList<String>();
		System.out.println("Enter the Quiz id");
		
		String quizId = sc.nextLine();
		System.out.println("Enter number of Questions");
		int noQuestions = sc.nextInt();
		while(noQuestions>0)
		{
			Scanner qnsc = new Scanner(System.in);
			Scanner ans = new Scanner(System.in);
			questions.add(qnsc.nextLine());
			answers.add(ans.nextLine());
			noQuestions--;
		}
		QuizService service = new QuizService();
		service.createQuiz(quizId,noQuestions,questions,answers);
		service.listQuizzes(2);
		
	}

}
