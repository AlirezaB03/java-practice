package calc;

public class CalculationTest {
    public static void main(String[] args) {
        InMemoryHistoryHandler historyHandler = new InMemoryHistoryHandler();
        Calculate calc = new Calculate(historyHandler);
        calc.run();
    }
}
