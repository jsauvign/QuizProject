package edu.unca.csci201;

import java.util.Scanner;

//This class manages up to 25 Question objects
public class Quiz {
	private static double grade = 0;
	static int numQuestions = 0;
	private static Question[] questions = new Question[1]; //This array stores questions for the quiz
	TrueFalseQuestion [] tfquestions;
	
	public Quiz() {
	//Quiz.questions = questions;
	//Quiz.grade = grade;
	}
	
//This accepts a question object and adds it to it's list of questions
	public static void addQuestion(Question q) {
	questions[numQuestions] = q;
	numQuestions ++;
		}
	
	
	public static int getNumberQuestions(){
		return numQuestions;
	}
	
	
//This presents each question, one by one, to the user and asks for their answer.  
	public double giveQuiz() {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < questions.length; i++ ) {
			System.out.println(questions[i].getTheQuestionText());
			String answer = scan.nextLine();

//After each answer, it checks if the answer is correct and keeps track of the results.  
			if (questions[i].isCorrectAnswer(answer)){
				grade++;
			}
			
		}		

//Finally, it returns the score the user got.
		System.out.println("Congrats, You got " + grade + " out of " + questions.length + " correct!");
		scan.close();
		return grade;
			
	}


}
