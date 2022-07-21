package org.example.trivia;

public interface TriviaQuestion {
    int getQuestionDifficulty();
    void askQuestion();
    boolean isRight(String userAnswer);
}
