package hexlet.code.games;

import java.security.SecureRandom;
import java.util.Random;

public class EvenGame implements Game {
    private static final int MAX_NUMBER = 100;
    private final Random random = new SecureRandom();

    @Override
    public String getRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        return String.valueOf(random.nextInt(MAX_NUMBER));
    }

    @Override
    public String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        return number % 2 == 0 ? "yes" : "no";
    }
}
