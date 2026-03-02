package hexlet.code;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class EvenGame implements Game {
    private static final int BOUND = 100;
    private static final int ROUNDS_COUNT = 3;
    private final Random random = new SecureRandom();

    @Override
    public void run(Scanner scanner, String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int round = 0; round < ROUNDS_COUNT; round++) {
            int number = random.nextInt(BOUND);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer
                        + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
    }
}



