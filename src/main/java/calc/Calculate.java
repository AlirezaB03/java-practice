package calc;

import java.util.List;
import java.util.Scanner;
import java.util.logging.MemoryHandler;

public class Calculate {
    private double number1;
    private double number2;
    private final HistoryHandler historyHandler;

    public Calculate(HistoryHandler historyHandler) {
        this.historyHandler = historyHandler;
    }

    public void run() {
        int option;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("choose one of the following options:");
            System.out.println("1) add");
            System.out.println("2) sub");
            System.out.println("3) mul");
            System.out.println("4) div");
            System.out.println("5) History");
            System.out.println("6) exit");

            System.out.print("your choice: ");
            option = scanner.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    history();
                    break;
                case 6:
                    exit();
                    break;
                default:
                    System.out.println("Invalid option\n Try again");
            }
        } while (option != 6);
    }

    private void choiceNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number1: ");
        number1 = scanner.nextDouble();
        System.out.print("enter number2: ");
        number2 = scanner.nextDouble();
    }

    private void add() {
        choiceNumber();
        double number = number1 + number2;
        String result = number1 + " + " + number2 + " = " + number;
        printResult(result);
        historyHandler.add(result);
    }

    private void sub() {
        choiceNumber();
        double number = number1 - number2;
        String result = number1 + " - " + number2 + " = " + number;
        printResult(result);
        historyHandler.add(result);


    }

    private void mul() {
        choiceNumber();
        double number = number1 * number2;
        String result = number1 + " * " + number2 + " = " + number;
        printResult(result);
        historyHandler.add(result);

    }

    private void div() {
        choiceNumber();
        try {
            double number = number1 / number2;
            String result = number1 + " / " + number2 + " = " + number;
            printResult(result);
            historyHandler.add(result);
        } catch (Exception e) {
            System.out.print("number2 cannot be zero");
            printDelimiter();
        }
    }

    private void history() {
        System.out.println("<<History>>\n");

        List<String> list = historyHandler.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ") " + list.get(i));
        }
        printDelimiter();
    }

        private void printResult(String result) {
            System.out.println(result);
            printDelimiter();
        }
    public void printDelimiter() {
        System.out.println("===================================\n");
    }

    private void exit() {
        System.exit(0);
    }
}


