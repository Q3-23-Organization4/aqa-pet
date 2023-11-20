package homework12;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class HumanPlayer extends Player{
    private static final Logger logg = LogManager.getLogger(HumanPlayer.class);
    public HumanPlayer(String name) {
        super(name);
    }

    public Choice choose() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(getName() + ", choose (0 - ROCK, 1 - PAPER, 2 - SCISSORS): ");
        int choiceIndex = scanner.nextInt();
        while (choiceIndex < 0 || choiceIndex > 2) {
            logg.error("wrong");;
            choiceIndex = scanner.nextInt();
        }
        return Choice.values()[choiceIndex];
    }
}
