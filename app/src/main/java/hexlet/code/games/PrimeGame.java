package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

public final class PrimeGame {
    private static final int MAX_NUMBER = 100;

    private PrimeGame() {
    }

    public static String getRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[] getRoundData() {
        int number = RandomUtils.nextInt(MAX_NUMBER);
        String question = String.valueOf(number);
        String answer = isPrime(number) ? "yes" : "no";
        return new String[]{question, answer};
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int divider = 3; divider * divider <= number; divider += 2) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }
}
