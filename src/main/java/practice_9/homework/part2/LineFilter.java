package practice_9.homework.part2;

import java.util.Arrays;
import java.util.List;

public class LineFilter {
    static void main() {
        List<String> list = Arrays.asList("Moscow", "SPB", "Omsk","Samara", "Vladivostok");

        List<String> filteredList = list.stream()
                .filter(name->name.length() > 5)
                .toList();
        System.out.println(filteredList);
    }
}
