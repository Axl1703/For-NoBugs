package practice_4.homework;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        numbersOf3();
        sumOfNumbers(scanner);
        multiplicationTable(scanner);
        isSimpleNumber(scanner);
        printNumbers();
    }

    public static void numbersOf3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumOfNumbers(Scanner scanner) {
        System.out.println("Type number ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }

    public static void multiplicationTable(Scanner scanner) {
        System.out.println("Type number to bild multiplication table ");
        int number = scanner.nextInt();
        int result;
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }

    public static void isSimpleNumber(Scanner scanner) {
        System.out.println("Type number to check is it simple ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0 || number <= 1) {
                isPrime = false;
            }
        }
        System.out.println("Your number " + isPrime);
    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
