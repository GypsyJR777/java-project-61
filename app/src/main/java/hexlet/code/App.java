package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println();
                Cli.hello();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println();
                Engine.run(choice, scanner);
                break;
            default:
                break;
        }
    }
}
