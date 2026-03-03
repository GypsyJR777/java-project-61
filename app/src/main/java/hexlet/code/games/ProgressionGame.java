package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

public final class ProgressionGame {
    private static final int MAX_NUMBER = 100;
    private static final int PROGRESSION_LENGTH = 10;
    private static final int STEP_BOUND = 10;

    private ProgressionGame() {
    }

    public static String getRule() {
        return "What number is missing in the progression?";
    }

    public static String[] getRoundData() {
        int start = RandomUtils.nextInt(MAX_NUMBER);
        int step = RandomUtils.nextInt(1, STEP_BOUND + 1);
        int hiddenIndex = RandomUtils.nextInt(PROGRESSION_LENGTH);
        int hiddenValue = start + hiddenIndex * step;

        StringBuilder question = new StringBuilder();
        for (int index = 0; index < PROGRESSION_LENGTH; index++) {
            if (index > 0) {
                question.append(' ');
            }
            if (index == hiddenIndex) {
                question.append("..");
            } else {
                question.append(start + index * step);
            }
        }

        return new String[]{question.toString(), String.valueOf(hiddenValue)};
    }
}
