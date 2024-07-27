package calc;

import java.io.IOException;
import java.util.Scanner;

public class CalculationTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify how you want your calculator history to be saved");
        System.out.println("1)in file");
        System.out.println("2)temporary");
        System.out.print("inter your choice: ");
        int history = scanner.nextInt();
        HistoryHandler historyHandler;

        if (history == 1) {
            historyHandler = new FileHistoryHandler();
        }else if (history == 2) {
            historyHandler = new InMemoryHistoryHandler();
        } else {
            System.out.println("Invalid history");
            return;
        }

        Calculate calc = new Calculate(historyHandler);
        calc.run();
    }
}
