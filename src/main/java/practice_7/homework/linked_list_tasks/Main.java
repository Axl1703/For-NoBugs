package practice_7.homework.linked_list_tasks;

import java.util.LinkedList;

public class Main {

//    Задача 1:
//    Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.

//    Задача 3:
//    Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.

    public static void main(String[] args) {
        LinkedList<String> lines = new LinkedList<>();

        lines.add("First");
        lines.add("Second");
        lines.add("Third");
        lines.add("Forth");
        lines.add("Fifth");

        System.out.println("All LinkedList: " + lines);

        System.out.println("First element is: " + lines.getFirst());
        System.out.println("Last element is: " + lines.getLast());
    }
}
