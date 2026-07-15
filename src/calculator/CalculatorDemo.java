package calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorClass calculatorClass = new CalculatorClass();

        System.out.println("Addition: " + calculatorClass.addition().calculate(5, 10));
        System.out.println("Subtraction: " + calculatorClass.subtraction().calculate(15, 10));
        System.out.println("Multiplication: " + calculatorClass.multiplication().calculate(55, 10));
        System.out.println("Division: " + calculatorClass.division().calculate(50, 10));
    }
}
