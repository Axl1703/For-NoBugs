package practice_9.homework.part3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AggregationOperations {
    static void main() {

        List<Integer> numbers = Arrays.asList(100, 222, 355, 4, 50, 6, 7, 88, 9, 10);

        int maxNumber = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(maxNumber);

        int minNumber = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(minNumber);

        int sumOfNumbers = numbers.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(sumOfNumbers);

        List<String> names = Arrays.asList("Anna", "Boris", "Bella", "Dima", "Egor");

        String firstNameWithB = String.valueOf(names.stream()
                .filter(name -> name.startsWith("B"))
                .findFirst());
        System.out.println(firstNameWithB);

        Boolean evenNumber = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(evenNumber);
    }
}
