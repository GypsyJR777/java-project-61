package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

public final class GcdGame {
    private static final int MAX_NUMBER = 100;

    private GcdGame() {
    }

    public static String getRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[] getRoundData() {
        int first = RandomUtils.nextInt(MAX_NUMBER);
        int second = RandomUtils.nextInt(MAX_NUMBER);
        String question = first + " " + second;
        String answer = String.valueOf(findGcd(first, second));
        return new String[]{question, answer};
    }

    private static int findGcd(int first, int second) {
        int a = Math.abs(first);
        int b = Math.abs(second);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
