package practice_4.homework;

import java.util.Scanner;

public class WhileTasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        factorial(scanner);
        evenNumbers(scanner);
        countdown(scanner);
    }

    public static void factorial(Scanner scanner) {
        System.out.println("Type number ");
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }

    public static void evenNumbers(Scanner scanner) {
        System.out.println("Type number ");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
    }

    public static void countdown(Scanner scanner) {
        System.out.println("Type number ");
        int n = scanner.nextInt();
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
    }
}
