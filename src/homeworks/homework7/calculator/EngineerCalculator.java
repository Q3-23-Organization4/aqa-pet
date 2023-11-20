package homeworks.homework7.calculator;

import homeworks.homework6.calculator.Calculator;

public class EngineerCalculator extends Calculator {
    public static double tangeValue(double a) {
        return Math.tan(a);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
