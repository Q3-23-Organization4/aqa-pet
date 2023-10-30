package homework9;

import java.util.Random;
public class ComputerPlayer extends Player{
    public ComputerPlayer(String name) {
        super(name);
    }
    public Choice choose() {
        Random random = new Random();
        int choiceIndex = random.nextInt(3);
        return Choice.values()[choiceIndex];
    }
}
