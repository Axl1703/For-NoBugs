package practice_11.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest extends MethodsForTestingTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("qwerty", "ytrewq"),
                Arguments.of("w", "w"),
                Arguments.of("", ""),
                Arguments.of(null, null));
    }

    @ParameterizedTest
    @MethodSource("data")
    public void isReversed(String input, String expected) {
        String result = methodsForTesting.reverse(input);
        assertEquals(expected, result);
    }
}
