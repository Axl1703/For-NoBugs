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

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        numbers.add(12);
        numbers.add(22);
        numbers.add(62);
        numbers.add(32);
        numbers.add(92);

        System.out.println(numbers);

        numbers.push(88);
        numbers.push(99);
        numbers.push(100);

        while (!numbers.isEmpty()) {
            System.out.println(numbers.pop());
        }

        numbers.addFirst(11);
        System.out.println(numbers);
        numbers.removeFirst();

        System.out.println(numbers);

        numbers.addLast(33);
        System.out.println(numbers);
        numbers.removeLast();

        System.out.println(numbers);
    }
}
