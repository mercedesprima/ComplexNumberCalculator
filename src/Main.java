import Calculator.CalculatorFactorable;
import Calculator.CalculatorFactory;
import Log.LogCalculatorFactory;
import Log.Loggable;
import Log.Logger;

public class Main {
    public static void main(String[] args) {
        Loggable logger = new Logger();
        CalculatorFactorable factory = new CalculatorFactory();
        LogCalculatorFactory logFactory = new LogCalculatorFactory(factory, logger);
        Console console = new Console(logFactory);
        console.run();
    }
}
