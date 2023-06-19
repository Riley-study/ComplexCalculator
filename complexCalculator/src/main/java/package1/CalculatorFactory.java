package package1;

public class CalculatorFactory implements CalculatorFactoryInterface {
    public ComplexNumberCalculator create(ComplexNumber num1) {
        return new ComplexNumberCalculator(num1);
    }
}
