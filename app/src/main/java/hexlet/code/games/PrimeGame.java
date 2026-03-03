package hexlet.code.games;

import java.util.stream.IntStream;

public class PrimeGame implements Game {
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
        return isPrime(number) ? "yes" : "no";
    }

    private boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }
}
