package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;
import java.util.Scanner;

public final class ProgressionGame {
    private ProgressionGame() {
    }

    public static void run(Scanner scanner) {
        final int maxNumber = 100;
        final int progressionLength = 10;
        final int stepBound = 10;
        final int roundsCount = 3;
        final int pairSize = 2;
        final int questionIndex = 0;
        final int answerIndex = 1;
        final String rule = "What number is missing in the progression?";

        String[][] rounds = new String[roundsCount][pairSize];
        for (int round = 0; round < roundsCount; round++) {
            int start = RandomUtils.nextInt(maxNumber);
            int step = RandomUtils.nextInt(1, stepBound + 1);
            String[] progression = generateProgression(start, step, progressionLength);
            int hiddenIndex = RandomUtils.nextInt(progressionLength);
            String hiddenValue = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            rounds[round][questionIndex] = String.join(" ", progression);
            rounds[round][answerIndex] = hiddenValue;
        }

        Engine.run(rule, rounds, scanner);
    }

    private static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int index = 0; index < length; index++) {
            progression[index] = String.valueOf(start + index * step);
        }
        return progression;
    }
}
