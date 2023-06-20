package package1.logger;

import package1.calculator.CalculatorFactoryInterface;
import package1.calculator.CalculatorInterface;
import package1.calculator.ComplexNumber;
import package1.calculator.ComplexNumberCalculator;
import package1.logger.LogComplexNumberCalculator;

public class LogCalculatorFactory implements CalculatorFactoryInterface {

    Logger logger;
    CalculatorFactoryInterface calculatorFactory;

    public LogCalculatorFactory(Logger logger, CalculatorFactoryInterface calculatorFactory) {
        this.logger = logger;
        this.calculatorFactory = calculatorFactory;
    }

    @Override
    public CalculatorInterface create(ComplexNumber num1) {
        return new LogComplexNumberCalculator(logger, calculatorFactory.create(num1));
    }
}
