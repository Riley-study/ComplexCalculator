package package1.logger;

import package1.calculator.CalculatorInterface;
import package1.calculator.ComplexNumber;
import package1.calculator.ComplexNumberCalculator;

public class LogComplexNumberCalculator implements CalculatorInterface {

    private final Logger logger;
    private final CalculatorInterface calculator;

    public LogComplexNumberCalculator(Logger logger, CalculatorInterface calculator) {
        this.logger = logger;
        this.calculator = calculator;
        this.logger.log(String.format("Первое комплексное число = %s",this.calculator.getResult()));
    }


    @Override
    public ComplexNumberCalculator sum(ComplexNumber num2) {
        System.out.println("ПОЧЕМУ НЕ РАБОТАЕТ??");
        logger.log(String.format("Находим сумму с %s", num2));
        return calculator.sum(num2);
    }

    @Override
    public ComplexNumberCalculator diff(ComplexNumber num2) {
        logger.log(String.format("Находим разность с %s", num2));
        return calculator.diff(num2);
    }

    @Override
    public ComplexNumberCalculator multi(ComplexNumber num2) {
        logger.log(String.format("Находим произведение с %s", num2));
        return calculator.multi(num2);
    }

    @Override
    public ComplexNumberCalculator div(ComplexNumber num2) {
        logger.log(String.format("Находим частное с %s", num2));
        return calculator.div(num2);
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = calculator.getResult();
        logger.log(String.format("Результат555:  %s", result));
        return result;
    }
}
