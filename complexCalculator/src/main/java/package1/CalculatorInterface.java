package package1;

public interface CalculatorInterface {
    ComplexNumberCalculator sum(ComplexNumber num2);
    ComplexNumberCalculator diff(ComplexNumber num2);
    ComplexNumberCalculator multi(ComplexNumber num2);
    ComplexNumberCalculator div(ComplexNumber num2);
    ComplexNumber getResult();

}