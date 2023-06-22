package Log;

import Calculator.CalculatorFactorable;
import Calculator.ComplexNumber;
import Calculator.ComplexNumberCalculable;

public class LogCalculatorFactory implements CalculatorFactorable {

        private CalculatorFactorable firstFactory;
        private Loggable logger;

    public LogCalculatorFactory(CalculatorFactorable firstFactory, Loggable logger) {
        this.firstFactory = firstFactory;
        this.logger = logger;
    }

    @Override
        public ComplexNumberCalculable create(ComplexNumber resultNumber) {
            return new LogComplexNumberCalculator(firstFactory.create(resultNumber), logger);
        }
    }

