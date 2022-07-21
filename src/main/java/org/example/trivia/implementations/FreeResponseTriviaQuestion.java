package org.example.trivia.implementations;

import org.example.trivia.TriviaQuestion;

public class FreeResponseTriviaQuestion implements TriviaQuestion  {
    private int difficulty;
    private String question;
    private String correctAnswer;

    public FreeResponseTriviaQuestion(int difficulty, String question, String correctAnswer) {
        this.difficulty = difficulty;
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public int getQuestionDifficulty() {
        return this.difficulty;
    }

    @Override
    public void askQuestion() {
        System.out.println(question);
    }

    @Override
    public boolean isRight(String userAnswer) {
        return userAnswer.equals(correctAnswer);
    }
}
