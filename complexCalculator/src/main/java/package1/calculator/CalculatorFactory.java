package package1.calculator;


//import package1.logger.LogComplexNumberCalculator;

public class CalculatorFactory implements CalculatorFactoryInterface {


    @Override
    public CalculatorInterface create(ComplexNumber num1) {
        return new ComplexNumberCalculator(num1);
    }
}
