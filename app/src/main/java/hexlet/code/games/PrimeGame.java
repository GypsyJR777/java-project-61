package hexlet.code.games;

import java.security.SecureRandom;
import java.util.Random;
import java.util.stream.IntStream;

public class PrimeGame implements Game {
    private static final int MAX_NUMBER = 100;
    private final Random random = new SecureRandom();

    @Override
    public String getRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        return String.valueOf(random.nextInt(MAX_NUMBER));
    }

    @Override
    public String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        return isPrime(number) ? "yes" : "no";
    }

    private boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }
}
