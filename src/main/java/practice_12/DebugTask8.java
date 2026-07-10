package practice_12;

public class DebugTask8 {
    static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        if (Math.abs(a - b) < 0.0000000001) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
