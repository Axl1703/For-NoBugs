package practice_11.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest extends MethodsForTestingTest {

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    public void isLeapYear(int ints) {
        assertTrue(methodsForTesting.isLeapYear(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {2023, 1900, 21005, 1, 2077})
    public void isNotLeapYear(int ints) {
        assertFalse(methodsForTesting.isLeapYear(ints));
    }
}
