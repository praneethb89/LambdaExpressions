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
}
