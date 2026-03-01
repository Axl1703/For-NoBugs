package practice_7.homework.linked_hash_set_tasks;

import java.util.LinkedHashSet;

public class Main {

//    Задача 1:
//    Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
//
//            Задача 2:
//    Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

    public static void checkDuplicates(LinkedHashSet<String> set, String line) {
        if (set.contains(line)) {
            System.out.println("Error " + line + " is duplicate");
        } else System.out.println(set.add(line) + " has added");

    }

    public static void main(String[] args) {
        LinkedHashSet<String> lines = new LinkedHashSet<>();

        lines.add("First");
        lines.add("Second");
        lines.add("Third");
        lines.add("Forth");
        lines.add("Fifth");

        System.out.println("Lines: " + lines);

        checkDuplicates(lines, "Second");
        checkDuplicates(lines, "Ten");
    }
}
