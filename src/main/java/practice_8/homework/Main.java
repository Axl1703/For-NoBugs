package practice_8.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void getResult(int firstNumber, int secondNumber) {
        double result;
        result = (double) firstNumber / secondNumber;
        if (secondNumber == 0) {
            throw new ArithmeticException("Ошибка - деление на 0 невозможно");
        } else System.out.println(result);
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Невалидный возраст");
        }
    }

    public static void checkEmail(String email) throws InvalidEmailException {
        if (!email.contains("@") || !email.contains("."))
            throw new InvalidEmailException("Невалидный email");
    }

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("data.text");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        try {
            getResult(firstNumber, secondNumber);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Введите свой возраст ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            ;
        }

        Scanner scannerLine = new Scanner(System.in);
        System.out.println("Введите свой email ");
        String email = scannerLine.nextLine();

        try {
            checkEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
            ;
        }
    }
}
