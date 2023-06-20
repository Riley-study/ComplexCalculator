package package1;
import package1.calculator.*;
import package1.logger.Log;
import package1.logger.LogCalculatorFactory;
import package1.logger.LogComplexNumberCalculator;
import package1.logger.Logger;


public class mainForComplexCalculator {

    public static void main(String[] args) {
        Logger logger = new Log();
        CalculatorFactoryInterface calculatorFactory = new CalculatorFactory();
        CalculatorFactoryInterface logCalculatorFactory = new LogCalculatorFactory(logger, calculatorFactory);
        ViewConsole viewConsole = new ViewConsole(logCalculatorFactory);
        viewConsole.start();
    }
}
