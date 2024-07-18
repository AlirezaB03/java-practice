package calc;

import java.util.Scanner;

public class Calculate {
        int option;
        static double number;
        static double number1;
        static double number2;

        public Calculate() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("choose one of the following options:");
            System.out.println("1 - add");
            System.out.println("2 - sub");
            System.out.println("3 - mul");
            System.out.println("4 - div");

            System.out.print("your choice:");
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
                default:
                    System.out.println("Invalid option\n Try again");
            }
        }

        public static void choiceNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("your choice 1: ");
            number1 = scanner.nextDouble();
            System.out.print("your choice 2: ");
            number2 = scanner.nextDouble();
        }

        public static void intOrDouble(double number) {
            int b;
            b = (int) number;
            if (number == b) {
                System.out.println(b);
            } else {
                System.out.println(number);
            }
        }

        public static void add() {
            choiceNumber();
            number = number1 + number2;
            System.out.print("add result: ");
            intOrDouble(number);
        }

        public static void sub() {
            choiceNumber();
            number = number1 - number2;
            System.out.print("add result: ");
            intOrDouble(number);
        }

        public static void mul() {
            choiceNumber();
            number = number1 * number2;
            System.out.print("add result: ");
            intOrDouble(number);
        }

        public static void div() {
            choiceNumber();
            number = number1 / number2;
            if (number2 != 0) {
                System.out.print("add result: ");
                intOrDouble(number);
            }
            else {
                System.out.print("number2 cannot be zero");
            }
        }
    }

