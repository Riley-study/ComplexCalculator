package package1;

public class ComplexNumberCalculator implements CalculatorInterface {
    private ComplexNumber num1;

    public ComplexNumberCalculator(ComplexNumber num1) {
        this.num1 = num1;
    }

    public ComplexNumberCalculator sum(ComplexNumber num2) {
        double a = num1.getA() + num2.getA();
        double b = num1.getB() + num2.getB();
        num1 = new ComplexNumber(a,b);
        return this;
    }

    public ComplexNumberCalculator diff(ComplexNumber num2) {
        double a = num1.getA() - num2.getA();
        double b = num1.getB() - num2.getB();
        num1 = new ComplexNumber(a,b);
        return this;
    }

    public ComplexNumberCalculator multi(ComplexNumber num2) {
        double a = num1.getA()* num2.getA() - num1.getB()* num2.getB();
        double b = num1.getA()* num2.getA() + num1.getB()* num2.getB();
        num1 = new ComplexNumber(a,b);
        return this;
    }

    public ComplexNumberCalculator div(ComplexNumber num2) {
        double a = (num1.getA()* num2.getA() + num1.getB()* num2.getB())/
                (num2.getA()* num2.getA() + num2.getB()* num2.getB());
        double b = (num1.getB()* num2.getA() - num1.getA()* num2.getB())/
                (num2.getA()* num2.getA() + num2.getB()* num2.getB());
        num1 = new ComplexNumber(a,b);
        return this;
    }

    public ComplexNumber getResult() {
        return num1;
    }
}
