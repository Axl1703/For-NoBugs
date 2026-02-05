package practice_4.homework;

import java.util.Scanner;

public class BreakContinueTasks {
    public static void main(String[] args) {
        sumOfNumbers();
        skipNumber();
        printOnlyPositiveNumber();
        printLines();

    }

    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number  ");
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
            sum = sum + number;
            if (number < 0) {
                break;
            }
            System.out.println(sum);
            System.out.println("Type number  ");
        }
    }

//    Сумма чисел
//    до первого
//
//    отрицательного(использовать break):
//    cоздай бесконечный
//
//    цикл(while(true) или for(;;)).
//    На каждой
//    итерации считывай
//    число,
//    прибавляй его
//    к сумме, но
//    если число
//    отрицательное —используй break,
//    чтобы выйти
//    из цикла.


    public static void skipNumber() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public static void printOnlyPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        do {
            int number = scanner.nextInt();
            if (number <= 0) {
                continue;
            }
            System.out.println(number + " ");
        } while (true);
    }

    public static void printLines() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type line ");
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            }
        }
    }
}
