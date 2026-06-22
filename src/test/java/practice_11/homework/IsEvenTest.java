package practice_11.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest extends MethodsForTestingTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, -2, -6})
    public void IsEven(int ints) {
        assertTrue(methodsForTesting.isEven(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, -5, -7})
    public void IsNotEven(int ints) {
        assertFalse(methodsForTesting.isEven(ints));
    }
}
