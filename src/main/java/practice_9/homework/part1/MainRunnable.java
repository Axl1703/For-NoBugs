package practice_9.homework.part1;

public class MainRunnable {
    static void main() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        runnable.run();
    }
}
