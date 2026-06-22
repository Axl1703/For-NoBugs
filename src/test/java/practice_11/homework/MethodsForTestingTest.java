package practice_11.homework;

import org.junit.jupiter.api.BeforeEach;
import practice_11.MethodsForTesting;

public class MethodsForTestingTest {

    protected MethodsForTesting methodsForTesting;

    @BeforeEach
    public void CallMethodsForTesting(){
        methodsForTesting = new MethodsForTesting();
    }
}
