package homework9;

import java.util.Scanner;

public class HumanPlayer extends Player{
    public HumanPlayer(String name) {
        super(name);
    }

    public Choice choose() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(getName() + ", choose (0 - ROCK, 1 - PAPER, 2 - SCISSORS): ");
        int choiceIndex = scanner.nextInt();
        while (choiceIndex < 0 || choiceIndex > 2) {
            System.out.println("Wrong choice");
            choiceIndex = scanner.nextInt();
        }
        return Choice.values()[choiceIndex];
    }
}
