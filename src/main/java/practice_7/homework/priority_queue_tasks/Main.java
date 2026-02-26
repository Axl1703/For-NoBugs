package practice_7.homework.priority_queue_tasks;

import java.util.PriorityQueue;

public class Main {

//    Задача 1:
//    Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.


    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(12);
        numbers.add(36);
        numbers.add(49);
        numbers.add(47);
        numbers.add(17);

        while(!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }
    }
}
