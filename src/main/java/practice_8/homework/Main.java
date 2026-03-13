package practice_8.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void getResult(int firstNumber, int secondNumber) {
        double result;
        if (secondNumber == 0) {
            throw new ArithmeticException("Ошибка - деление на 0 невозможно");
        } else {
            result = (double) firstNumber / secondNumber;
        }
        System.out.println(result);
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Невалидный возраст");
        }
    }

    public static void checkEmail(String email) throws InvalidEmailException {
        String regular = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (!email.matches(regular)) {
            throw new InvalidEmailException("Невалидный email");
        }
    }

    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("data.text");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        assert reader != null;
        reader.close();

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
        }

        Scanner scannerLine = new Scanner(System.in);
        System.out.println("Введите свой email ");
        String email = scannerLine.nextLine();

        try {
            checkEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
