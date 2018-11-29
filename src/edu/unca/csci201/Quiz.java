package edu.unca.csci201;

import java.util.Scanner;

//This class manages up to 25 Question objects
public class Quiz {
	static double grade = 0;
	static int numWrong = 0;
	static int numQuestions = 0;
	static Question [] wrongQuestions = new Question[numWrong];
	static Question [] questions;
	
	public Quiz(Question[] questions, double grade) {
	Quiz.questions = questions;
	Quiz.grade = grade;
	}
	
//This accepts a question object and adds it to it's list of questions
	public void addQuestion(Question q) {
		questions[numQuestions] = q;
		numQuestions ++;
		}

	
	
	public double giveQuiz() {
//This presents each question, one by one, to the user and asks for their answer.  
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < questions.length; i++ ) {
			System.out.println(questions[i].getTheQuestionText());
			String answer = scan.nextLine();

			
//After each answer, it checks if the answer is correct and keeps track of the results.  
			if (questions[i].isCorrectAnswer(answer)){
				grade++;
			}
//			else {
//				wrongQuestions[numWrong] = questions[i];
//				numWrong++;
//				System.out.println("Sorry, the answer was " + questions[i].getCorrectAnswer());
//			}
			
		}		

//Finally, it returns the score the user got.
		System.out.println("Congrats, You got " + grade + " out of " + questions.length + " correct!");
		System.out.println("Here's what you missed: ");
		System.out.println(wrongQuestions[numWrong]);
		scan.close();
		return grade;
		

		
	}


}
