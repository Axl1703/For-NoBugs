package practice_9.homework.part1;

public class MainForMathOperations {
    static void main() {
        MathOperation add = (x, y) -> x + y;
        MathOperation subtract = (x, y) -> x - y;
        MathOperation multipy = (x, y) -> x * y;
        MathOperation divide = (x, y) -> x / y;

        System.out.println(add.action(1, 2));
        System.out.println(subtract.action(5, 2));
        System.out.println(multipy.action(2, 2));
        System.out.println(divide.action(10, 2));
    }
}
