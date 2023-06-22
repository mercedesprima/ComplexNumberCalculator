package Calculator;

public class ComplexNumberCalculator implements ComplexNumberCalculable {
    private ComplexNumber resultNumber;

    public ComplexNumberCalculator(ComplexNumber resultNumber) {
        this.resultNumber = resultNumber;
    }

    @Override
    public ComplexNumberCalculator addition(ComplexNumber secondNumber) {
        resultNumber = new ComplexNumber (resultNumber.getReal() + secondNumber.getReal(),
                resultNumber.getImaginary() + secondNumber.getImaginary());
        return this;
    }

    @Override
    public ComplexNumberCalculator multiplication(ComplexNumber secondNumber) {
        double real = resultNumber.getReal() * secondNumber.getReal() - resultNumber.getImaginary() * secondNumber.getImaginary();
        double imaginary = resultNumber.getReal() * secondNumber.getImaginary() + resultNumber.getImaginary() * secondNumber.getReal();
        resultNumber = new ComplexNumber (real, imaginary);
        return this;
    }
    @Override
    public ComplexNumber getResult() {
        return resultNumber;
    }
}
