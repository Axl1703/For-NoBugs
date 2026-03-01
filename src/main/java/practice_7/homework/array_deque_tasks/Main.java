package practice_7.homework.array_deque_tasks;

import java.util.ArrayDeque;

public class Main {
//    Задача 1:
//    Создайте ArrayDeque, добавьте 5 элементов и выведите их.
//
//    Задача 2:
//    Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
//
//    Задача 3:
//    Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.


    public static void main(String[] args) {

        ArrayDeque<Integer> numbersForTask1 = new ArrayDeque<>();

        numbersForTask1.add(12);
        numbersForTask1.add(22);
        numbersForTask1.add(62);
        numbersForTask1.add(32);
        numbersForTask1.add(92);

        System.out.println(numbersForTask1);

        ArrayDeque<Integer> numbersForTask2 = new ArrayDeque<>();

        numbersForTask2.push(88);
        numbersForTask2.push(99);
        numbersForTask2.push(100);

        while (!numbersForTask2.isEmpty()) {
            System.out.println(numbersForTask2.pop());
        }

        ArrayDeque<Integer> numbersForTask3 = new ArrayDeque<>();

        numbersForTask3.addFirst(11);
        System.out.println(numbersForTask3);
        numbersForTask3.addLast(33);

        System.out.println(numbersForTask3);

        numbersForTask3.removeFirst();
        System.out.println(numbersForTask3);
        numbersForTask3.removeLast();

        System.out.println(numbersForTask3);
    }
}
