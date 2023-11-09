package homework10;

import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(95);
        numbers.add(0);
        numbers.add(155);

        int X = 100;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > X) {
                int number = numbers.remove(i);
                numbers.add(number);
            }
        }

        System.out.println("Result " + numbers);
    }
}

