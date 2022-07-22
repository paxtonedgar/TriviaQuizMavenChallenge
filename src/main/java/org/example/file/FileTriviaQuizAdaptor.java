package org.example.file;

import org.example.trivia.TriviaQuestion;
import org.example.trivia.TriviaQuiz;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FileTriviaQuizAdaptor implements TriviaQuiz {
    // TODO - make a FileTriviaQuiz "fit" the TriviaQuiz interface using the Adaptor pattern.
    // Basically you just have to complete this class

    private FileTriviaQuiz fileTriviaQuiz;
    private Queue<FileQuestion> questionQueue = new LinkedList();

    private int playerPoints = 0;

    public FileTriviaQuizAdaptor(FileTriviaQuiz fileTriviaQuiz) {

        this.fileTriviaQuiz = fileTriviaQuiz;
        fileTriviaQuiz.getQuestions().stream().forEach(q -> questionQueue.add(q));
    }

    @Override
    public boolean hasNextQuestion() {
        // TODO
            return !questionQueue.isEmpty();

    }

    @Override
    public TriviaQuestion getNextQuestion()  {
        // TODO
        FileQuestion currQuestion = questionQueue.poll();
        TriviaQuestion triviaQuestion = new TriviaQuestion() {
            @Override
            public int getQuestionDifficulty() {
                return 1;
            }

            @Override
            public void askQuestion() {
                System.out.println(currQuestion.getPrompt());
            }

            @Override
            public boolean isRight(String userAnswer) {
                try{
                    String currAnswer = currQuestion.getAnswer();
                    if(currAnswer.matches(userAnswer)){
                        return true;
                    }

                }
                catch (NullPointerException e){
                    System.out.print("NullPointerException Caught");
                }
                return false;
            }
        };
        return triviaQuestion;
    }

    @Override
    public void addPoints(int points) {
        // TODO
        playerPoints =+ points;
    }

    @Override
    public int getTotalScore() {
        // TODO
        return playerPoints;
    }
}
