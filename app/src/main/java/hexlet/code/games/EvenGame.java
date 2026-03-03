package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

public final class EvenGame {
    private static final int MAX_NUMBER = 100;

    private EvenGame() {
    }

    public static String getRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[] getRoundData() {
        int number = RandomUtils.nextInt(MAX_NUMBER);
        String question = String.valueOf(number);
        String answer = number % 2 == 0 ? "yes" : "no";
        return new String[]{question, answer};
    }
}
