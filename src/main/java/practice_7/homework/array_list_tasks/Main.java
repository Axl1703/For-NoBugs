package practice_7.homework.array_list_tasks;

import java.util.ArrayList;

public class Main {

//    Задача 1:
//    Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
//
//        Задача 2:
//    Напишите программу, которая выводит все чётные числа из ArrayList.

    public static void getEvenNumber(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println("Even number from list: " + list.get(i));
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);

        System.out.println("Size of list " + numbers);

        numbers.add(60);

        System.out.println("Size of list after add " + numbers);

        getEvenNumber(numbers);

    }
}


