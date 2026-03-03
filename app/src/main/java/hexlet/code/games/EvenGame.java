package hexlet.code.games;

public class EvenGame implements Game {
    @Override
    public String getRule() {
        return YES_NO_ANSWER;
    }

    @Override
    public String getQuestion() {
        return String.valueOf(RANDOM.nextInt(MAX_NUMBER));
    }

    @Override
    public String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        return number % 2 == 0 ? "yes" : "no";
    }
}
