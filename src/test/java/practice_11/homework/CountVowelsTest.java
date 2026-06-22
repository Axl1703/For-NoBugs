package practice_11.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.annotations.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends MethodsForTestingTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("www", 0));
    }

    @ParameterizedTest
    @MethodSource("data")
    public void IsVowels(String word, int count) {
        int result = methodsForTesting.countVowels(word);
        assertEquals(result, count);
    }


    @Test
    public void IsNullVowels() {
        assertThrows(NullPointerException.class, () -> methodsForTesting.countVowels(null));
    }
}
