package edu.unca.csci201;

public class QuizTime {
	
	public static void main(String[] args) {
		Question q1 = new TrueFalseQuestion ("a?", "a");
		Quiz tfQuiz = new Quiz();	
		Quiz.addQuestion(q1);
		tfQuiz.giveQuiz();
	}
}
