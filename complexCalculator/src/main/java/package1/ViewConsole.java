package package1;

import package1.calculator.*;

import java.util.Scanner;

public class ViewConsole {
    private CalculatorFactoryInterface calculatorFactory;

    public ViewConsole(CalculatorFactoryInterface calculatorFactory) {
        this.calculatorFactory = calculatorFactory;
    }

    public void start(){
        while (true){
            ComplexNumber firstComplexNum = promptComplexNumber("Первое комплексное число ");
            CalculatorFactory complexCalculator = new CalculatorFactory();
            CalculatorInterface complexNumberCalculator = complexCalculator.create(firstComplexNum);
            while (true){
                String userChoice = prompt("Введите действие (+, -, /, *, =): ");
                if(userChoice.equalsIgnoreCase("+")){
                    ComplexNumber secondComplexNum = promptComplexNumber("Второе комплексное число ");
                    complexNumberCalculator.sum(secondComplexNum);
                    continue;
                }
                if(userChoice.equalsIgnoreCase("-")){
                    ComplexNumber secondComplexNum = promptComplexNumber("Задайте второе комплексное число: ");
                    complexNumberCalculator.diff(secondComplexNum);
                    continue;
                }
                if(userChoice.equalsIgnoreCase("*")){
                    ComplexNumber secondComplexNum = promptComplexNumber("Задайте второе комплексное число: ");
                    complexNumberCalculator.multi(secondComplexNum);
                    continue;
                }
                if(userChoice.equalsIgnoreCase("/")){
                    ComplexNumber secondComplexNum = promptComplexNumber("Задайте второе комплексное число: ");
                    complexNumberCalculator.div(secondComplexNum);
                    continue;
                }
                if (userChoice.equalsIgnoreCase("=")){
                    ComplexNumber result = complexNumberCalculator.getResult();
                    System.out.println("Результат: "+ result);
                    break;
                }

            }
        String whatDoNext = prompt("Продолжить работу калькулятора? Y/N");
            if (whatDoNext.equalsIgnoreCase("Y")){
                continue;
            }
            break;
        }
    }

    private String prompt (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    private ComplexNumber promptComplexNumber(String massage){
        Scanner scanner = new Scanner(System.in);
        System.out.println(massage);
        System.out.println("Введите действительную часть комплексного числа: ");
        double a = scanner.nextDouble();
        System.out.println("Введите действительную часть комплексного числа: ");
        double b = scanner.nextDouble();
        return new ComplexNumber(a,b);
    }
}
