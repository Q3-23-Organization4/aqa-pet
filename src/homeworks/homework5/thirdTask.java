package homeworks.homework5;

public class thirdTask {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 12, 1, 5, 6, 3, 8};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
            System.out.println(numbers[i]);
        }
    }
}
