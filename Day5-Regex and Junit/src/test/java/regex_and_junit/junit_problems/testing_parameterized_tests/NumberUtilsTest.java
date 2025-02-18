package regex_and_junit.junit_problems.testing_parameterized_tests;


import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        boolean expected = (number % 2 == 0);
        assertEquals(expected, NumberUtils.isEven(number));
    }
}

