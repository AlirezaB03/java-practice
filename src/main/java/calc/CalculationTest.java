package calc;

public class CalculationTest {
    public static void main(String[] args) {
        String input = "Memory";
        HistoryHandler historyHandler;

        if (input.equals("file")) {
            historyHandler = new FileHistoryHandler();
        }
        else {
            historyHandler = new InMemoryHistoryHandler();
        }

        Calculate calc = new Calculate(historyHandler);
        calc.run();
    }
}
