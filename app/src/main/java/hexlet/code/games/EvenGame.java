package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;
import java.util.Scanner;

public final class EvenGame {
    private EvenGame() {
    }

    public static void run(Scanner scanner) {
        final int limit = 100;
        final int maxRounds = 3;
        final int pairSize = 2;
        final int question = 0;
        final int answer = 1;
        final String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] rounds = new String[maxRounds][pairSize];
        for (int round = 0; round < maxRounds; round++) {
            int number = RandomUtils.nextInt(limit);
            rounds[round][question] = String.valueOf(number);
            rounds[round][answer] = number % 2 == 0 ? "yes" : "no";
        }

        Engine.run(rule, rounds, scanner);
    }
}
