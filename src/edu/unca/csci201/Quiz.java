package edu.unca.csci201;

public class Quiz {
	Question [] list = new Question;
			TFQuestions = {"1+1 = 2"};
	//I manage up to 25 Question objects
	
	public void addQuestion(Question q) {
		Question [] list = new Question[TFQuestions.length];
		
		for (int i = 0; i <TFQuestions.length; i++) {
			list[i] = new TrueFalseQuestion();
		}
		q.getTheQuestionText();
	//This accepts a question object and adds it to it's list of questions
	}
	public double giveQuiz() {
	//This presents each question, one by one, to the user and asks for their answer.  
	//After each answer, it checks if the answer is correct and keeps track of the results.  
	//Finally, it returns the score the user got.
		return 0;
	}


}
