package practice_7.homework.tree_set_tasks;

import java.util.TreeSet;

public class Main {

//    Задача 1:
//    Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(12);
        numbers.add(52);
        numbers.add(2);
        numbers.add(67);
        numbers.add(82);

        System.out.println(numbers);
    }
}
