package practice_7.homework.hash_set_tasks;


import java.util.HashSet;

public class Main {
    //    Задача 1:
//    Создайте HashSet из 5 чисел и выведите его содержимое.
//
//            Задача 2:
//    Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        int i = 1;

        while (i <= 5) {
            numbers.add(i);
            i++;
        }

        System.out.println("HasSet: " + numbers);

        HashSet<Integer> tenNumbers = new HashSet<>();

        int y = 1;

        while (y <= 10) {
            tenNumbers.add(y);
            y++;
        }
        System.out.println("Second HasSet: " + tenNumbers);
        if (tenNumbers.contains(9)) {
            System.out.println("Number 9 is in HashSet ");
        }else System.out.println("Number 9 isn't in HashSet");
    }


}
