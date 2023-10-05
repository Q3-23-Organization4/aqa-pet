package homework5;

public class secondTask {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 12, 1, 5, 6, 3, 8};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}



