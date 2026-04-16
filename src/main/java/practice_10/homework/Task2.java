package practice_10.homework;

public class Task2 {

    //    Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.
    static void main() throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <= 4; i++) {
                System.out.println("A");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <= 4; i++) {
                System.out.println("B");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread1.join();

        thread2.start();
    }
}