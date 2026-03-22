package practice_9.homework.part4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReduction {
    static void main() {

        List<String> names = Arrays.asList("Anna", "Boris", "Bella", "Dima", "Egor");

        Map<Character, List<String>> groupsByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(groupsByFirstLetter);

        List<Integer> numbers = Arrays.asList(100, 222, 355, 4, 50, 6, 7, 88, 9, 10);

        Map<Boolean, List<Integer>> groupByEven = numbers.stream()
                .collect((Collectors.groupingBy(n -> n % 2 == 0)));
        System.out.println(groupByEven);

        Double average = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(average);
    }
}
