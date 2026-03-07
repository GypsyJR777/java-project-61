package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;
import java.util.Scanner;

public final class EvenGame {
    private EvenGame() {
    }

    public static void run(Scanner scanner) {
        final int maxNumber = 100;
        final int roundsCount = 3;
        final int pairSize = 2;
        final int questionIndex = 0;
        final int answerIndex = 1;
        final String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] rounds = new String[roundsCount][pairSize];
        for (int round = 0; round < roundsCount; round++) {
            int number = RandomUtils.nextInt(maxNumber);
            rounds[round][questionIndex] = String.valueOf(number);
            rounds[round][answerIndex] = number % 2 == 0 ? "yes" : "no";
        }

        Engine.run(rule, rounds, scanner);
    }
}
