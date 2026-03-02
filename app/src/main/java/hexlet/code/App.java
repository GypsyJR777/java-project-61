package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println();
            Cli.hello();
        } else if (choice == 2) {
            System.out.println();
            Engine.run(new EvenGame(), scanner);
        }
    }
}
