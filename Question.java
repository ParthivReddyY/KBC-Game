import java.util.Arrays;

public class Question {
    private String question;
    private String[] options;
    private int correctIndex;
    private int level;

    public Question(String question, String[] options, int correctIndex, int level) {
        this.question = question;
        this.options = options;
        this.correctIndex = correctIndex;
        this.level = level;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public int getLevel() {
        return level;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setCorrectIndex(int correctIndex) {
        this.correctIndex = correctIndex;
    }

    public void updateCorrectIndex(String correctAnswer) {
        this.correctIndex = Arrays.asList(options).indexOf(correctAnswer);
    }
}
