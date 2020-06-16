package com.codecademy.unquote;

public class Question {

    public int imageId;
    public String questionText;
    public String answer0;
    public String answer1;
    public String answer2;
    public String answer3;
    public int correctAnswer;
    public int playerAnswer;

    public Question(int imageIdentifier,
                    String questionString,
                    String answerZero,
                    String answerOne,
                    String answerTwo,
                    String answerThree,
                    int correctAnswerIndex) {
        this.imageId = imageIdentifier;
        this.questionText = questionString;
        this.answer0 = answerZero;
        this.answer1 = answerOne;
        this.answer2 = answerTwo;
        this.answer3 = answerThree;
        this.correctAnswer = correctAnswerIndex;
        this.playerAnswer = -1;
    }

    public boolean isCorrect() {
        return playerAnswer == correctAnswer;
    }

}
