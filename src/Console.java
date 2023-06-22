import Calculator.CalculatorFactorable;
import Calculator.ComplexNumber;
import Calculator.ComplexNumberCalculable;

import java.util.Scanner;

public class Console {
    private CalculatorFactorable calculatorFactory;

    public Console(CalculatorFactorable calculatorFactory) {
        this.calculatorFactory = calculatorFactory;
    }

    public void run() {
        while (true) {
            ComplexNumber resultNumber = inputComplex("Введите первое комплексное число: ");
            ComplexNumberCalculable calculator = calculatorFactory.create(resultNumber);
            while (true) {
                String cmd = input("Введите команду (+, *, =) : ");
                if (cmd.equals("+")) {
                    ComplexNumber num2 = inputComplex("Введите второе комплексное число: ");
                    calculator.addition(num2);
                    continue;
                }
                if (cmd.equals("*")) {
                    ComplexNumber num2 = inputComplex("Введите второе комплексное число: ");
                    calculator.multiplication(num2);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }
            String cmd = input("Продолжить (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String input(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumber inputComplex(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        System.out.print("Введите действительную часть : ");
        double real = in.nextDouble();
        System.out.print("Введите мнимую часть : ");
        double imaginary = in.nextDouble();
        return new ComplexNumber(real,imaginary);
    }
}



