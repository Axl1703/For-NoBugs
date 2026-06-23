package practice_11.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends MethodsForTestingTest {

    public static Stream<Arguments> data() {
        return Stream.of(Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040));
    }

    @ParameterizedTest
    @MethodSource("data")
    public void countFactorial(int number, int expected) {
        int result = methodsForTesting.factorial(number);
        assertEquals(expected, result);
    }

    @Test
    public void countFactorialForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> methodsForTesting.factorial(-10));
    }
}
