package Log;

import Calculator.ComplexNumber;
import Calculator.ComplexNumberCalculable;
import Calculator.ComplexNumberCalculator;

public class LogComplexNumberCalculator implements ComplexNumberCalculable {
    private ComplexNumberCalculable calculator;
    private Loggable logger;

    public LogComplexNumberCalculator(ComplexNumberCalculable calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
        this.logger.log(String.format("Первое комплексное число: %s",this.calculator.getResult()));
    }

    @Override
    public ComplexNumberCalculator addition(ComplexNumber secondNumber) {
        return calculator.addition(secondNumber);
    }

    @Override
    public ComplexNumberCalculator multiplication(ComplexNumber secondNumber) {
        return calculator.multiplication(secondNumber);
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = calculator.getResult();
        logger.log(String.format("Итого: %s", result));
        return result;
    }
}
