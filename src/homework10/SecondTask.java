package homework10;

import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(50000);
        numbers.add(950);
        numbers.add(0);
        numbers.add(155);

        int X = 100;

        numbers.sort((a, b) -> {
            if (a <= X && b > X) {
                return -1;
            } else if (a > X && b <= X) {
                return 1;
            } else {
                return 0;
            }
        });

        System.out.println("Result " + numbers);
    }
}

