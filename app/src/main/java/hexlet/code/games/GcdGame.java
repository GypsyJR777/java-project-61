package hexlet.code.games;

import java.security.SecureRandom;
import java.util.Random;

public class GcdGame implements Game {
    private static final int MAX_NUMBER = 100;
    private final Random random = new SecureRandom();

    @Override
    public String getRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getQuestion() {
        int first = random.nextInt(MAX_NUMBER);
        int second = random.nextInt(MAX_NUMBER);
        return first + " " + second;
    }

    @Override
    public String getCorrectAnswer(String question) {
        String[] parts = question.split(" ");
        int first = Integer.parseInt(parts[0]);
        int second = Integer.parseInt(parts[1]);
        return String.valueOf(findGcd(first, second));
    }

    private int findGcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGcd(num2, num1 % num2);
    }
}
