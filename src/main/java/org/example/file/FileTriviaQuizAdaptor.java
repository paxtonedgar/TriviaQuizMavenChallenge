package org.example.file;

import org.example.trivia.TriviaQuestion;
import org.example.trivia.TriviaQuiz;

public class FileTriviaQuizAdaptor implements TriviaQuiz {
    // TODO - make a FileTriviaQuiz "fit" the TriviaQuiz interface using the Adaptor pattern.
    // Basically you just have to complete this class

    private FileTriviaQuiz fileTriviaQuiz;

    public FileTriviaQuizAdaptor(FileTriviaQuiz fileTriviaQuiz) {
        this.fileTriviaQuiz = fileTriviaQuiz;
    }

    @Override
    public boolean hasNextQuestion() {
        // TODO
        return false;
    }

    @Override
    public TriviaQuestion getNextQuestion() {
        // TODO
        return null;
    }

    @Override
    public void addPoints(int points) {
        // TODO

    }

    @Override
    public int getTotalScore() {
        // TODO
        return 0;
    }
}
