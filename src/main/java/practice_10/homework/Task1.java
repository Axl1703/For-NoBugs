package practice_10.homework;

public class Task1 {


//    Условие задачи: Напишите программу, в которой создается отдельный поток,
//    выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
//

    static void main() {
        Thread printHello = new Thread(() -> {
            for (int i = 0; i <= 4; i++) {
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        );

        printHello.start();
    }
}
