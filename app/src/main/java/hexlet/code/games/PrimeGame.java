package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;
import java.util.Scanner;

public final class PrimeGame {
    private PrimeGame() {
    }

    public static void run(Scanner scanner) {
        final int maxNumber = 100;
        final int roundsLimit = 3;
        final int pairSize = 2;
        final int questionIndex = 0;
        final int answerIndex = 1;
        final String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] rounds = new String[roundsLimit][pairSize];
        for (int round = 0; round < roundsLimit; round++) {
            int number = RandomUtils.nextInt(maxNumber);
            rounds[round][questionIndex] = String.valueOf(number);
            rounds[round][answerIndex] = isPrime(number) ? "yes" : "no";
        }

        Engine.run(rule, rounds, scanner);
    }

    private static boolean isPrime(int number) {
        final int firstPrime = 2;
        final int firstOddDivisor = 3;
        final int divisorStep = 2;

        if (number < firstPrime) {
            return false;
        }
        if (number == firstPrime) {
            return true;
        }
        if (number % firstPrime == 0) {
            return false;
        }

        for (int divider = firstOddDivisor; divider * divider <= number; divider += divisorStep) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }
}
