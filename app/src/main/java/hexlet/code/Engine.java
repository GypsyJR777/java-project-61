package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

final class Engine {
    private static final int ROUNDS_COUNT = 3;

    private Engine() {
    }

    public static void run(int gameId, Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(getRule(gameId));

        for (int round = 0; round < ROUNDS_COUNT; round++) {
            String[] roundData = getRoundData(gameId);
            String question = roundData[0];
            String correctAnswer = roundData[1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }

    private static String getRule(int gameId) {
        return switch (gameId) {
            case 2 -> EvenGame.getRule();
            case 3 -> CalcGame.getRule();
            case 4 -> GcdGame.getRule();
            case 5 -> ProgressionGame.getRule();
            case 6 -> PrimeGame.getRule();
            default -> "";
        };
    }

    private static String[] getRoundData(int gameId) {
        return switch (gameId) {
            case 2 -> EvenGame.getRoundData();
            case 3 -> CalcGame.getRoundData();
            case 4 -> GcdGame.getRoundData();
            case 5 -> ProgressionGame.getRoundData();
            case 6 -> PrimeGame.getRoundData();
            default -> new String[]{"", ""};
        };
    }
}
