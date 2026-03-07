package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        printMenu();

        Scanner scanner = new Scanner(System.in);
        GameId gameId = GameId.fromCode(scanner.nextInt());

        if (gameId == null) {
            return;
        }

        switch (gameId) {
            case GREET:
                System.out.println();
                Cli.hello();
                break;
            case EVEN:
                System.out.println();
                EvenGame.run(scanner);
                break;
            case CALC:
                System.out.println();
                CalcGame.run(scanner);
                break;
            case GCD:
                System.out.println();
                GcdGame.run(scanner);
                break;
            case PROGRESSION:
                System.out.println();
                ProgressionGame.run(scanner);
                break;
            case PRIME:
                System.out.println();
                PrimeGame.run(scanner);
                break;
            default:
                break;
        }
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        for (GameId gameId : GameId.values()) {
            System.out.println(gameId.getCode() + " - " + gameId.getTitle());
        }
        System.out.print("Your choice: ");
    }
}
