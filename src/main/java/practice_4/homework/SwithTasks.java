package practice_4.homework;

import java.util.Scanner;

public class SwithTasks {
    public static void main(String[] args) {
//        daysOfWeek();
//        ticketPrice();
//        convertion();
//        commands();
        calculate();
    }

    public static void daysOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number from 1 to 7");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void ticketPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type day of a week from 1 to 7");
        int number = scanner.nextInt();
        switch (number) {
            case 1, 2, 3, 4, 5:
                System.out.println("300 рублей");
                break;
            case 6, 7:
                System.out.println("450 рублей");
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void convertion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number from 0 to 100");
        int number = scanner.nextInt();
        if (number >= 90 && number <= 100) {
            System.out.println("A");
        } else if (number >= 80 && number <= 89) {
            System.out.println("B");
        } else if (number >= 70 && number <= 79) {
            System.out.println("C");
        } else if (number >= 60 && number <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void commands() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the command");
        String command = scanner.nextLine();
        switch (command) {
            case "start":
                System.out.println("System running");
                break;
            case "stop":
                System.out.println("System stopped");
                break;
            case "restart":
                System.out.println("System restarting");
                break;
            case "status":
                System.out.println("System working");
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type firstNumber");
        int firstNumber = scanner.nextInt();
        System.out.println("Type secondNumber");
        int secondNumber = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type operator");
        String operator = scanner2.nextLine();

        switch (operator) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Error 0");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            default:
                System.out.println("Wrong operator");
        }
    }
}
