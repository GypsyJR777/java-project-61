package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;
import java.util.Scanner;

public final class GcdGame {
    private GcdGame() {
    }

    public static void run(Scanner scanner) {
        final int numberMax = 100;
        final int roundsCount = 3;
        final int pairSize = 2;
        final int qIndex = 0;
        final int aIndex = 1;
        final String rule = "Find the greatest common divisor of given numbers.";

        String[][] rounds = new String[roundsCount][pairSize];
        for (int round = 0; round < roundsCount; round++) {
            int first = RandomUtils.nextInt(numberMax);
            int second = RandomUtils.nextInt(numberMax);
            rounds[round][qIndex] = first + " " + second;
            rounds[round][aIndex] = String.valueOf(findGcd(first, second));
        }

        Engine.run(rule, rounds, scanner);
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
