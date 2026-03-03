package hexlet.code.games;

public class EvenGame implements Game {
    @Override
    public String getRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
