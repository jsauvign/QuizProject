package edu.unca.csci201;

import java.util.Scanner;

//This class manages Question objects
public class Quiz {
	private double grade = 0;
	private Question[] questions = new Question[20]; //This array stores questions for the quiz
	private Question[] wrongQuestions = new Question[20];
	
//This accepts a question object and adds it to it's list of questions
	int h = 0;
	public void addQuestion(Question q) {
	questions[h] = q;
	h ++;
	
		}
	
	
//This presents each question, one by one, to the user and asks for their answer.  
	public double giveQuiz() {
		int wrongAnswers = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("This is a quiz about solar energy!");
		System.out.println("**************************************");
		System.out.println("press enter to continue");
		String wait = scan.nextLine();
		for(int i = 0; i < questions.length; i++ ) {
			System.out.println(questions[i].getTheQuestionText());
			String answer = scan.nextLine();

//After each answer, it checks if the answer is correct and keeps track of the results.  
			if (questions[i].isCorrectAnswer(answer)){
				grade++;
			}
			else {
				wrongQuestions[wrongAnswers] = (questions[i]);
				wrongAnswers++;
			}
		}		
//Finally, it returns the score the user got.
		int finalScore = (int) grade;
		System.out.println("Congrats, You got " + finalScore + " out of " + questions.length + " correct!");
		System.out.println();
		System.out.println("**************************************");
		System.out.println("Here's what you got wrong: ");
		
		for (int k= 0; k < wrongAnswers; k++) {
		System.out.println(wrongQuestions[k].getTheQuestionText());
		System.out.println();
		System.out.println("The corrects answer is:  " + wrongQuestions[k].getCorrectAnswer());
		System.out.println("press enter to continue");
		System.out.println();
		System.out.println();
		String waitmore = scan.nextLine();
		}
		System.out.println();
		System.out.println("**************************************");
		System.out.println("That's all. Thanks for taking this quiz!");
		scan.close();
		return grade;
			
	}


}
