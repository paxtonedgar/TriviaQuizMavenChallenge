package org.example.trivia.implementations;

import org.example.trivia.TriviaQuestion;
import org.example.trivia.TriviaQuiz;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class JaysTriviaQuiz implements TriviaQuiz {
    private int score = 0;
    private Queue<TriviaQuestion> questions = new ArrayDeque<>(
            Arrays.asList(new FreeResponseTriviaQuestion(1, "What is your favorite teacher's name?", "Jay"),
                    new FreeResponseTriviaQuestion(10, "What kind of dog does Thomas have?", "Chihuahua"))
    );
    @Override
    public boolean hasNextQuestion() {
        return !questions.isEmpty();
    }

    @Override
    public TriviaQuestion getNextQuestion() {
        return questions.poll();
    }

    @Override
    public void addPoints(int points) {
        this.score += points;
    }

    @Override
    public int getTotalScore() {
        return score;
    }
}
