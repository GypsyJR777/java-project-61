package hexlet.code.utils;

import java.security.SecureRandom;
import java.util.Random;

public final class RandomUtils {
    private static final Random RANDOM = new SecureRandom();

    private RandomUtils() {
    }

    public static int nextInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    public static int nextInt(int min, int maxExclusive) {
        return min + RANDOM.nextInt(maxExclusive - min);
    }
}
