package package1;

public class ComplexNumber {
    private double a;
    private double b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return String.format("Complex number (%s, %s)",a, b);
    }
}
