package homework7.calculator;

import homework6.calculator.Calculator;

class ProgramCalculator extends Calculator {
    public static String decToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }
}