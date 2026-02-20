package practice_4.homework;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        positiveNumber(scanner);
        checkPassword(scanner);
        tenNumbers();
        correctCommand(scanner);
        countDigits(scanner);
    }

    public static void positiveNumber(Scanner scanner) {
        int n;
        do {
            System.out.println("Type number ");
            n = scanner.nextInt();
        } while (n <= 0);
        System.out.println("Number is positive");
    }

    public static void checkPassword(Scanner scanner) {
        String password;
        do {
            System.out.println("Type password ");
            password = scanner.nextLine();
        } while (!password.equals("qwerty"));
        System.out.println("welcome");
    }

    public static void tenNumbers() {
        int n = 1;
        do {
            System.out.print(n + " ");
            n++;
        } while (n <= 10);
    }

    public static void correctCommand(Scanner scanner) {
        String command;
        do {
            System.out.println("Type command ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
        System.out.println("Turn off");
    }

    public static void countDigits(Scanner scanner) {
        int number = scanner.nextInt();
        int count = 0;
        do {
            number = number / 10;
            count++;
        } while (number != 0);
        System.out.println(count);
    }
}
