package org.example;

import org.example.trivia.TriviaQuestion;
import org.example.trivia.TriviaQuiz;
import org.example.trivia.TriviaQuizFactory;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //On my end of things,
        TriviaQuizFactory myFactory = new TriviaQuizFactory();

        boolean playingGames = true;
        Scanner sc = new Scanner(System.in);
        while (playingGames) {
            TriviaQuiz chosenQuiz = myFactory.getQuiz(sc);
            if (chosenQuiz == null) {
                playingGames = false;
            } else {
                //While the chosen quiz has a next question available
                while (chosenQuiz.hasNextQuestion()) {
                    //Get the next question from the quiz
                    TriviaQuestion thisQuestion = chosenQuiz.getNextQuestion();
                    //Ask this question
                    thisQuestion.askQuestion();
                    //get an answer from the user
                    String answer = sc.nextLine();
                    //If this question is right for this answer then add 1 point
                    if (thisQuestion.isRight(answer)) {
                        int thisQuestionsDifficulty = thisQuestion.getQuestionDifficulty();
                        chosenQuiz.addPoints(thisQuestionsDifficulty);
                    }
                }
                System.out.println("You received " + chosenQuiz.getTotalScore() + " points!");
            }

        }
    }
}