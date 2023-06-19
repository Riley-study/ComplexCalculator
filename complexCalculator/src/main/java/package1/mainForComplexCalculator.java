package package1;
import package1.CalculatorFactory;
import package1.CalculatorFactoryInterface;
import package1.ComplexNumber;
import package1.ComplexNumberCalculator;


public class mainForComplexCalculator {

    public static void main(String[] args) {
        CalculatorFactoryInterface calculator = new CalculatorFactory();
        ViewConsole viewConsole = new ViewConsole(calculator);
        viewConsole.start();
    }
}
