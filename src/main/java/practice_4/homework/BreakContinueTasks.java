package practice_4.homework;

import java.util.Scanner;

public class BreakContinueTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        sumOfNumbers(scanner);
        skipNumber();
        printOnlyPositiveNumber(scanner);
        printLines(scanner);
    }

    public static void sumOfNumbers(Scanner scanner) {
        System.out.println("Type number  ");
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum = sum + number;

            System.out.println(sum);
            System.out.println("Type number  ");
        }
    }

    public static void skipNumber() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public static void printOnlyPositiveNumber(Scanner scanner) {
        do {
            int number = scanner.nextInt();
            if (number < 0) {
                continue;
            } else if (number == 0) {
                break;
            }
            System.out.println(number + " ");
        } while (true);
    }

    public static void printLines(Scanner scanner) {
        while (true) {
            System.out.println("Type line ");
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            }
        }
    }
}
