package edu.unca.csci201;

public class QuizTime {
	static double grade;
	static String q1 = "1+1 = 2";
	static String q2 = "1+1 = 9";
	static TrueFalseQuestion [] tfQuestions = {
			new TrueFalseQuestion(q1, "True"),
			new TrueFalseQuestion(q2, "False")
	};

	
	public static void main(String[] args) {
		Quiz tfQuiz = new Quiz(tfQuestions, grade);
		tfQuiz.giveQuiz();
	}

}
