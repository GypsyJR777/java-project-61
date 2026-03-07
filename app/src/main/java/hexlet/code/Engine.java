package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private Engine() {
    }

    public static void run(String rule, String[][] rounds, Scanner scanner) {
        final int questionIndex = 0;
        final int answerIndex = 1;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(rule);

        for (String[] roundData : rounds) {
            String question = roundData[questionIndex];
            String correctAnswer = roundData[answerIndex];
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
}
