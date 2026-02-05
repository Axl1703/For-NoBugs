package practice_4.homework;

import java.util.Scanner;

public class IfElseTasks {

    public static void main(String[] args) {
        checkNumber();
        findMaxValue();
        printRating();
        checkParity();
        discount();
        checkTestResult();
    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        if (command > 0) {
            System.out.println("Число положительное");
        } else if (command < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }


    public static void findMaxValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number 1");
        int firstNumber = scanner.nextInt();
        System.out.println("Type number 2");
        int secondNumber = scanner.nextInt();

        int maxValue;
        if (firstNumber > secondNumber) {
            maxValue = firstNumber;
        } else {
            maxValue = secondNumber;
        }
        System.out.println(maxValue);
    }

    public static void printRating() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number from 1 to 5 ");
        int number = scanner.nextInt();
        if (number == 5) {
            System.out.println("Отлично");
        } else if (number == 4) {
            System.out.println("Хорошо");
        } else if (number == 3) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }

    public static void checkParity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
    }

    public static void discount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your age ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("25%");
        } else if (age >= 65) {
            System.out.println("30%");
        } else {
            System.out.println("without discount");
        }
    }

    public static void checkTestResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number from 0 to 100 ");
        int result = scanner.nextInt();
        if (result >= 90) {
            System.out.println("Отлично");
        } else if (result >= 75 && result <= 89) {
            System.out.println("Хорошо");
        } else if (result >= 60 && result <= 74) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}
