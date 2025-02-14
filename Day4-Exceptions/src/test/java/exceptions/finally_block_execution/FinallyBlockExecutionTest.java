package exceptions.finally_block_execution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FinallyBlockExecutionTest {
    @Test
    void test1() {
        assertEquals(5, FinallyBlockExecution.resultCalculate(10, 2));
        assertEquals(-3, FinallyBlockExecution.resultCalculate(-9, 3));
    }

    @Test
    void test2() {
        assertThrows(ArithmeticException.class, () -> FinallyBlockExecution.resultCalculate(10,0));
    }

}
