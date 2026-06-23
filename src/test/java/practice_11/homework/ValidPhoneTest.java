package practice_11.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPhoneTest extends MethodsForTestingTest {

    @ParameterizedTest
    @ValueSource(strings = {"+7 9119876543", "+7 8125553535", "+44 9876543210"})
    public void isValidPhoneNumber(String phone) {
        assertTrue(methodsForTesting.isValidPhoneNumber(phone));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+79119876543", "78125553535", "trrk", "", "47OOOOO", "@!%e457"})
    public void isInvalidValidPhoneNumber(String phone) {
        assertFalse(methodsForTesting.isValidPhoneNumber(phone));
    }
}
