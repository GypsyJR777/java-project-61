package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
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
                System.out.println();
                Engine.run(new EvenGame(), scanner);
                break;
            case 3:
                System.out.println();
                Engine.run(new CalcGame(), scanner);
                break;
            case 4:
                System.out.println();
                Engine.run(new GcdGame(), scanner);
                break;
            default:
                break;
        }
    }
}
