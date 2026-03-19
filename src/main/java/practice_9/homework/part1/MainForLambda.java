package practice_9.homework.part1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainForLambda {
    static void main() {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Function<String, Integer> parse = String::length;
        System.out.println(parse.apply("Hello"));

        Consumer<String> printer = System.out::println;
        printer.accept("World");
    }
}
