package practice_10.homework;

import java.util.concurrent.atomic.AtomicInteger;

public class Task3 {

    //    Создайте поток, который бесконечно увеличивает счетчик.
//    В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
    public static volatile boolean stop;

    static void main() {
        AtomicInteger i = new AtomicInteger();
        Thread t1 = new Thread(() -> {
            while (!stop) {
                i.getAndIncrement();
                System.out.println(i.get());
            }
        });

        t1.start();

        try {
            Thread.sleep(2000);
            stop = true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
