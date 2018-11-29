package edu.unca.csci201;

public class TrueFalseQuestion implements Question {
private static String text;
private static String correctAnswer;

public TrueFalseQuestion(String text, String correctAnswer) {
	TrueFalseQuestion.text = text;
	TrueFalseQuestion.correctAnswer = correctAnswer;
}

	public String getTheQuestionText() {
		return text;
	}
	
	public boolean isCorrectAnswer(String answer) {
		if (answer.equals(correctAnswer)) {
		return true;
		}
		else {
		return false;
		}
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	public String toString() {
	    return text;
	}
}
