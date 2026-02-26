package practice_7.homework.tree_map_tasks;

import java.util.TreeMap;

public class Main {

//    Задача 1:
//    Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
public static void main(String[] args) {
    TreeMap<String,Integer> results = new TreeMap<>();

    results.put("Alex", 88);
    results.put("Tom", 44);
    results.put("Maria", 98);
    results.put("John", 38);
    results.put("Vlad", 36);

    System.out.println(results);
}



}
