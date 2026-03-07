package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;
import java.util.Scanner;

public final class CalcGame {
    private CalcGame() {
    }

    public static void run(Scanner scanner) {
        final int maxNumber = 100;
        final char[] operations = {'+', '-', '*'};
        final int roundsCount = 3;
        final int pairSize = 2;
        final int questionIndex = 0;
        final int answerIndex = 1;
        final String rule = "What is the result of the expression?";

        String[][] rounds = new String[roundsCount][pairSize];
        for (int round = 0; round < roundsCount; round++) {
            int left = RandomUtils.nextInt(maxNumber);
            int right = RandomUtils.nextInt(maxNumber);
            char operation = operations[RandomUtils.nextInt(operations.length)];
            int result = switch (operation) {
                case '+' -> left + right;
                case '-' -> left - right;
                case '*' -> left * right;
                default -> throw new RuntimeException("Unknown operator " + operation);
            };

            rounds[round][questionIndex] = left + " " + operation + " " + right;
            rounds[round][answerIndex] = String.valueOf(result);
        }

        Engine.run(rule, rounds, scanner);
    }
}
