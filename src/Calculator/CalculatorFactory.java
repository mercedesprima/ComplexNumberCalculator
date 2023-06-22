package Calculator;

public class CalculatorFactory implements CalculatorFactorable{
    @Override
    public ComplexNumberCalculable create(ComplexNumber resultNumber) {
        return new ComplexNumberCalculator(resultNumber);
    }
}
