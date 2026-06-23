package practice_11.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends MethodsForTestingTest {


    public static Stream<Arguments> data() {
        return Stream.of(Arguments.of("Привет мир", 2),
                Arguments.of("Изучаем основы java", 3),
                Arguments.of("", 0),
                Arguments.of(" ", 0),
                Arguments.of("12324", 1));
    }

    @ParameterizedTest
    @MethodSource("data")
    public void countWordsTest(String sentence, int expected) {
        int result = methodsForTesting.countWords(sentence);
        assertEquals(expected, result);
    }

    @Test
    public void countWordsTestForNull() {
        assertThrows(NullPointerException.class, () -> methodsForTesting.countWords(null));
    }
}
