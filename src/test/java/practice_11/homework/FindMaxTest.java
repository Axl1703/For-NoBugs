package practice_11.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest extends MethodsForTestingTest {

    public static Stream<Arguments> data() {
        return Stream.of(Arguments.of(new int[]{3, 5, 7, 2}, 7),
                (Arguments.of(new int[]{7}, 7)),
                (Arguments.of(new int[]{-7, -10, -1}, -1)));
    }

    @ParameterizedTest
    @MethodSource("data")
    public void findMaxTest(int[] array, int expected) {
        int result = methodsForTesting.findMax(array);
        assertEquals(expected, result);
    }

    @Test
    public void findMaxExceptionTest() {
        assertThrows(NoSuchElementException.class, () -> methodsForTesting.findMax(new int[]{}));
    }
}
