package practice_9.homework.part2;

import java.util.Arrays;
import java.util.List;

public class BaseOperations {
    static void main() {
        List<String> list = Arrays.asList("Moscow", "SPB", "Omsk", "Samara", "Vladivostok");

        List<String> filteredList = list.stream()
                .filter(name -> name.length() > 5)
                .toList();
        System.out.println(filteredList);

        List<Integer> numbers = Arrays.asList(100, 222, 355, 4, 50, 6, 7, 88, 9, 10);

        List<Integer> filterNumbers = numbers.stream()
                .filter(number -> number % 5 == 0)
                .toList();
        System.out.println(filterNumbers);

        List<Integer> linesLength = list.stream()
                .map(String::length)
                .toList();
        System.out.println(linesLength);

        List<Integer> squares = numbers.stream()
                .map(number -> number * number)
                .toList();
        System.out.println(squares);

        List<Integer> numbersWithDubles = Arrays.asList(10, 2, 3, 4, 50, 6, 50, 88, 4, 10);

        List<Integer> withoutDoubles = numbersWithDubles.stream()
                .distinct()
                .toList();
        System.out.println(withoutDoubles);
    }
}
