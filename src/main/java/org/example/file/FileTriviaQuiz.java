package org.example.file;

import java.util.List;

public class FileTriviaQuiz {
    private String gameName;
    private List<FileQuestion> questions;

    public FileTriviaQuiz() {
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public List<FileQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<FileQuestion> questions) {
        this.questions = questions;
    }
}
