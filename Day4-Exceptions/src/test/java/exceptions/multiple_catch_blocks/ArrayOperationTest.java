package exceptions.multiple_catch_blocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationTest {

    @Test
    void test1(){
        assertThrows(ArrayIndexOutOfBoundsException.class,()-> ArrayOperations.findValueAtIndex(new int[]{1,2,3,4}, 4));
    }

    @Test
    void test2(){
        assertThrows(NullPointerException.class,()-> ArrayOperations.findValueAtIndex(null, 1));
    }

    @Test
    void test3(){
        assertTrue(ArrayOperations.findValueAtIndex(new int[]{1,2,3},1));
    }
}
