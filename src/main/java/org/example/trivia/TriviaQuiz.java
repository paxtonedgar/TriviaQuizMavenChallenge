package org.example.trivia;

public interface TriviaQuiz {
    boolean hasNextQuestion();
    TriviaQuestion getNextQuestion();
    void addPoints(int points);
    int getTotalScore();
}
