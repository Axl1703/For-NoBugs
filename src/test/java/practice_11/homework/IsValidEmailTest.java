package practice_11.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmailTest extends MethodsForTestingTest {

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "QWERTY@mail.ru", "q@y.com", "q-1h_r.t@mail.ru"})
    public void isValidEmail(String strings) {
        assertTrue(methodsForTesting.isValidEmail(strings));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol", "@missing-user.com", "user@domain", "", "null"})
    public void isNotValidEmail(String strings) {
        assertFalse(methodsForTesting.isValidEmail(strings));
    }
}