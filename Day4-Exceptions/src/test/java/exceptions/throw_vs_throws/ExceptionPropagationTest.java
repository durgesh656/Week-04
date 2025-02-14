package exceptions.throw_vs_throws;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionPropagationTest {

    @Test
    void test1(){
        assertThrows(IllegalArgumentException.class, ()-> ExceptionPropagation.calculateInterest(-7000,8,9));
    }

    @Test
    void test2(){
        assertEquals(100,ExceptionPropagation.calculateInterest(1000, 10, 1));
    }
}
