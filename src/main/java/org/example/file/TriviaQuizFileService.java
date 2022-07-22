package org.example.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.trivia.TriviaQuiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class TriviaQuizFileService {
    private static final String FILE_NAME = "quiz.json";
    private static TriviaQuizFileService INSTANCE;
    public FileTriviaQuiz getQuizFromFile() throws IOException {
            // TODO you want to read the JSON file, convert it to a FileTriviaQuiz and return that from this method
            ObjectMapper mapper = new ObjectMapper();
            FileTriviaQuiz json = mapper.readValue(Paths.get(FILE_NAME).toFile(), FileTriviaQuiz.class);
            return json;

    }
    public static TriviaQuizFileService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TriviaQuizFileService();
        }
        return INSTANCE;
    }
}
