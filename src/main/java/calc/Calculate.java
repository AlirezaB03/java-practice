package calc;

import java.util.Scanner;

public class Calculate {
    int option;
    private double number;
    private double number1;
    private double number2;

    public Calculate() {
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("choose one of the following options:");
            System.out.println("1) add");
            System.out.println("2) sub");
            System.out.println("3) mul");
            System.out.println("4) div");
            System.out.println("5) exit");

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
                    exit();
                    break;
                default:
                    System.out.println("Invalid option\n Try again");
            }
        } while (true);
    }

    public void choiceNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number1: ");
        number1 = scanner.nextDouble();
        System.out.print("enter number2: ");
        number2 = scanner.nextDouble();
    }

    public void intOrDouble(double number) {
        int b;
        b = (int) number;
        if (number == b) {
            System.out.print(b);
        } else {
            System.out.print(number);
        }
    }
    public void add() {
        choiceNumber();
        intOrDouble(number1);
        System.out.print(" + ");
        intOrDouble(number2);
        number = number1 + number2;
        System.out.print(" = ");
        intOrDouble(number);
        System.out.println("\n===================================\n");
    }

    public void sub() {
        choiceNumber();
        intOrDouble(number1);
        System.out.print(" - ");
        intOrDouble(number2);
        number = number1 - number2;
        System.out.print(" = ");
        intOrDouble(number);
        System.out.println("\n===================================\n");
    }

    public void mul() {
        choiceNumber();
        intOrDouble(number1);
        System.out.print(" * ");
        intOrDouble(number2);
        number = number1 * number2;
        System.out.print(" = ");
        intOrDouble(number);
        System.out.println("\n===================================\n");
    }

    public void div() {
        choiceNumber();
        if (number2 != 0) {
            intOrDouble(number1);
            System.out.print(" / ");
            intOrDouble(number2);
            number = number1 / number2;
            System.out.print(" = ");
            intOrDouble(number);
            System.out.println("\n===================================\n");
        } else {
            System.out.print("number2 cannot be zero");
            System.out.println("\n===================================\n");
        }
    }

    public void exit() {
        System.exit(0);
    }
}

