package homework6;

public class CalculatorValidation {
    public static void main(String[] args) {
        double number1 = 50;
        double number2 = 5;

        double sum = Calculator.add(number1, number2);
        System.out.println(sum);

        double devide = Calculator.divide(number1,number2);
        System.out.println(devide);

        double subtract = Calculator.subtract(number1,number2);
        System.out.println(subtract);

        double multiply = Calculator.multiply(number1,number2);
        System.out.println(multiply);

    }
}
