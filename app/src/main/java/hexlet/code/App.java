package hexlet.code;

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
            case CALC:
            case GCD:
            case PROGRESSION:
            case PRIME:
                System.out.println();
                Engine.run(gameId, scanner);
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
