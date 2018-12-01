package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {
	private String text;
	private String correctAnswer;
	
	public MultipleChoiceQuestion(String text, String correctAnswer) {
		this.text = text;
		this.correctAnswer = correctAnswer;
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

