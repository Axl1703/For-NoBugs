package practice_3;

public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

    public static double calculateCircleArea(double r) {
        double circleArea = PI * r * r;
        return circleArea;
    }

    public static double calculateCircumference(double r) {
        double circumference = 2 * PI * r;
        return circumference;
    }
}
