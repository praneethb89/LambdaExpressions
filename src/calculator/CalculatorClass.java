package calculator;

import calculator.interfaces.Calculator;

public class CalculatorClass {

    public Calculator addition() {
        return (x, y) -> x + y;
    }

    public Calculator subtraction() {
        return (x, y) -> x - y;
    }

    public Calculator multiplication() {
        return (x, y) -> x * y;
    }

    public Calculator division() {
        return (x, y) -> x / y;
    }

    public static void implementation() {
        CalculatorClass calculatorClass = new CalculatorClass();

        System.out.println("Addition: " + calculatorClass.addition().calculate(5, 10));
        System.out.println("Subtraction: " + calculatorClass.subtraction().calculate(15, 10));
        System.out.println("Multiplication: " + calculatorClass.multiplication().calculate(55, 10));
        System.out.println("Division: " + calculatorClass.division().calculate(50, 10));
    }
}
