package hexlet.code.games;

import java.security.SecureRandom;
import java.util.Random;

public class ProgressionGame implements Game {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int START_BOUND = 100;
    private static final int STEP_BOUND = 10;
    private final Random random = new SecureRandom();
    private int hiddenValue;

    @Override
    public String getRule() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getQuestion() {
        int start = random.nextInt(START_BOUND);
        int step = random.nextInt(STEP_BOUND) + 1;
        int hiddenIndex = random.nextInt(PROGRESSION_LENGTH);
        int[] progression = buildProgression(start, step);
        hiddenValue = progression[hiddenIndex];

        StringBuilder result = new StringBuilder();
        for (int index = 0; index < progression.length; index++) {
            if (index > 0) {
                result.append(' ');
            }
            if (index == hiddenIndex) {
                result.append("..");
            } else {
                result.append(progression[index]);
            }
        }
        return result.toString();
    }

    @Override
    public String getCorrectAnswer(String question) {
        return String.valueOf(hiddenValue);
    }

    private int[] buildProgression(int start, int step) {
        int[] progression = new int[ProgressionGame.PROGRESSION_LENGTH];
        for (int index = 0; index < ProgressionGame.PROGRESSION_LENGTH; index++) {
            progression[index] = start + index * step;
        }
        return progression;
    }
}
