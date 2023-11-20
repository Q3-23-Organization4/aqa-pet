package homework12;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Game {
    private static final Logger logg = LogManager.getLogger(Game.class);

    public static void main(String[] args) {
        String logLevel = System.getProperty("log.level", "debug");


        logg.info("Starting the game...");

        HumanPlayer humanPlayer = new HumanPlayer("Player");
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        Choice humanChoice = humanPlayer.choose();
        Choice computerChoice = computerPlayer.choose();

        logg.info("{} choose: {}", humanPlayer.getName(), humanChoice);
        logg.info("{} choose: {}", computerPlayer.getName(), computerChoice);

        int result = determineWinner(humanChoice, computerChoice);
        if (result == 0) {
            logg.info("It's a tie");
        } else if (result > 0) {
            logg.info("{} won", humanPlayer.getName());
        } else {
            logg.info("{} won", computerPlayer.getName());
        }
    }

    private static int determineWinner(Choice humanChoice, Choice computerChoice) {
        if (humanChoice == computerChoice) {
            return 0;
        }

        if ((humanChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) ||
                (humanChoice == Choice.PAPER && computerChoice == Choice.ROCK) ||
                (humanChoice == Choice.SCISSORS && computerChoice == Choice.PAPER)) {
            return 1;
        }
        return -1;
    }
}

