package org.example.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.trivia.TriviaQuiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TriviaQuizFileService {
    private static final String FILE_NAME = "quiz.json";
    private static TriviaQuizFileService INSTANCE;
    public FileTriviaQuiz getQuizFromFile() {
            // TODO you want to read the JSON file, convert it to a FileTriviaQuiz and return that from this method
            return null;

    }
    public static TriviaQuizFileService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TriviaQuizFileService();
        }
        return INSTANCE;
    }
}
