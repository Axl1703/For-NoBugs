package practice_7.homework.hash_map_tasks;

import java.util.HashMap;

public class Main {

    //        Задача 1:
//        Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
//
//        Задача 2:
//        Проверьте, есть ли определённое имя в HashMap.

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alex", 30);
        map.put("Nick", 20);
        map.put("Maria", 10);
        map.put("Olga", 27);
        map.put("Dima", 33);

        System.out.println(map);

        if (map.containsKey("Nick")) {
            System.out.println("Nick is here");
        } else System.out.println("Error");

    }
}
