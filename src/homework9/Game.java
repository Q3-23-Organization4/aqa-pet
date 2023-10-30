package homework9;

public class Game {
    public static void main(String[] args) {
        HumanPlayer humanPlayer = new HumanPlayer("Player");
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        Choice humanChoice = humanPlayer.choose();
        Choice computerChoice = computerPlayer.choose();

        System.out.println(humanPlayer.getName() + " choose: " + humanChoice);
        System.out.println(computerPlayer.getName() + " choose: " + computerChoice);

        int result = determineWinner(humanChoice, computerChoice);
        if (result == 0) {
            System.out.println("нічия");
        } else if (result > 0) {
            System.out.println(humanPlayer.getName() + " won");
        } else {
            System.out.println(computerPlayer.getName() + " won");
        }
    }

    public static int determineWinner(Choice humanChoice, Choice computerChoice) {
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
