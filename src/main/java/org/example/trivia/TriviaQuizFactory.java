package org.example.trivia;

import org.example.file.FileTriviaQuizAdaptor;
import org.example.file.TriviaQuizFileService;
import org.example.trivia.implementations.JaysTriviaQuiz;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TriviaQuizFactory {
    private Map<String, TriviaQuiz> quizzes;
    //Constructor to make our factory
    public TriviaQuizFactory() throws IOException {
        quizzes = new HashMap<>();
        TriviaQuiz jaysGame = new JaysTriviaQuiz();
        quizzes.put("Jay", jaysGame); // Add each person's quiz like this

        quizzes.put("File", getTriviaQuizFromFile());
    }


    public TriviaQuiz getQuiz(Scanner scanner) {
        try {
            System.out.println("Type \"quit\" to quit playing quizzes.");
            boolean gettingInput = true;
            //While we are getting input
            while (gettingInput) {
                System.out.println("Whose quiz do you want to play? " + quizzes.keySet());
                //Get a choice from the user
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("quit")){
                    return null;
                } else {
                    //If we have the chosen quiz, return it.
                    TriviaQuiz chosenQuiz = quizzes.get(choice);
                    if (chosenQuiz != null) {
                        return chosenQuiz;
                    } else {
                        System.out.println("Invalid input, try again!");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Received invalid input");
            scanner.next();
            System.out.println("try again?");
            return getQuiz(scanner);
        }
        //We should never get here.
        return null;
    }

    private TriviaQuiz getTriviaQuizFromFile() throws IOException {
        return new FileTriviaQuizAdaptor(TriviaQuizFileService.getInstance().getQuizFromFile());
    }
}
