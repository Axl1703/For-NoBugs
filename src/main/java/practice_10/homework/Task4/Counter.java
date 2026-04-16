package practice_10.homework.Task4;

public class Counter {
    private int count;

    public synchronized void increment() {
        this.count++;
    }

    public synchronized int getCount() {
        return this.count;
    }
}
