package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

public final class PrimeGame {
    private static final int MAX_NUMBER = 100;
    private static final int FIRST_ODD_DIVISOR = 3;
    private static final int DIVISOR_STEP = 2;

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

        for (int divider = FIRST_ODD_DIVISOR; divider * divider <= number; divider += DIVISOR_STEP) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }
}
