package practice_1;

import static java.lang.Math.*;

public class MathOperations {

    static int x = 5;
    static int y = 10;
    static int a = 2;
    static int b = 3;
    static int side = 6;
    static int seconds = 100;
    static double distance = 100;
    static double time = 2;
    static double radius = 2.2;
    static double total = 200;
    static double part = 25;
    static double c = 20;
    static double f = 22;


    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int substract(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    public static double divide(int x, int y) {
        double result = (double) x / y;
        return result;
    }

    public static int findMax(int a, int b) {
        int maxNumber = max(a, b);
        return maxNumber;
    }

    public static int difference(int x, int y) {
        int module = abs(x - y);
        return module;

    }

    public static int squareArea(int side) {
        int squareArea = side * side;
        return squareArea;
    }

    public static int squarePerimeter(int side) {
        int squarePerimeter = side * 4;
        return squarePerimeter;
    }

    public static double convertSecondsToMinutes(int seconds){
        double result = (double) seconds / 60;
        return result;
    }

    public static double averageSpeed(double distance, double time){
        double averageSpeed = distance / time;
        return averageSpeed;
    }

    public static double findHypotenuse(double a, double b){
        double hypotenuse = sqrt(a * a + b * b);
        return hypotenuse;
    }

    public static double circleCircumference(double radius){
        double circleCircumference = 2 * PI * radius;
        return circleCircumference;
    }

    public static double calculatePercentage(double total, double part){
        double percentage = (part / total) * 100;
        return percentage;
    }

    public static double celsiusToFahrenheit(double c){
        double celsiusToFahrenheit = c * 9 / 5 + 32;
        return celsiusToFahrenheit;
    }

    public static double fahrenheitToCelsius(double f){
        double fahrenheitToCelsius = (f - 32) * 5 / 9;
        return fahrenheitToCelsius;
    }

    public static void main(String[] args) {
        System.out.println(add(x, y));
        System.out.println(substract(x, y));
        System.out.println(multiply(x, y));
        System.out.println(divide(x, y));
        System.out.println(findMax(a, b));
        System.out.println(difference(x, y));
        System.out.println(squareArea(side));
        System.out.println(squarePerimeter(side));
        System.out.println(convertSecondsToMinutes(seconds));
        System.out.println(averageSpeed(distance, time));
        double a = 4;
        double b = 2;
        System.out.println(findHypotenuse(a, b));
        System.out.println(circleCircumference(radius));
        System.out.println(calculatePercentage(total, part));
        System.out.println(celsiusToFahrenheit(c));
        System.out.println(fahrenheitToCelsius(f));
    }
}


