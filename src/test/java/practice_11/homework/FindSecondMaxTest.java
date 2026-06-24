package practice_11.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.annotations.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest extends MethodsForTestingTest {

    public static Stream<Arguments> data() {
        return Stream.of
                (Arguments.of(new int[]{3, 5, 7, 2}, 5),
                        (Arguments.of(new int[]{-3, -5, -7, -2}, -3)));
    }

    @ParameterizedTest
    @MethodSource("data")
    public void findSecondMaxTest(int[] numbers, int expected) {
        int result = methodsForTesting.findSecondMax(numbers);
        assertEquals(expected, result);
    }

    @Test
    public void findSecondMaxInOneElementTest() {
        assertThrows(NullPointerException.class, () -> methodsForTesting.findSecondMax(new int[2]));
    }

    @Test
    public void findSecondMaxSameTest() {
        assertThrows(NullPointerException.class, () -> methodsForTesting.findSecondMax(new int[]{2,2,2,2}));
    }
}
