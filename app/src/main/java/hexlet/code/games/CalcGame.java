package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

public final class CalcGame {
    private static final int MAX_NUMBER = 100;
    private static final char[] OPERATIONS = {'+', '-', '*'};

    private CalcGame() {
    }

    public static String getRule() {
        return "What is the result of the expression?";
    }

    public static String[] getRoundData() {
        int left = RandomUtils.nextInt(MAX_NUMBER);
        int right = RandomUtils.nextInt(MAX_NUMBER);
        char operation = OPERATIONS[RandomUtils.nextInt(OPERATIONS.length)];
        int result = switch (operation) {
            case '+' -> left + right;
            case '-' -> left - right;
            case '*' -> left * right;
            default -> 0;
        };
        return new String[]{left + " " + operation + " " + right, String.valueOf(result)};
    }
}
