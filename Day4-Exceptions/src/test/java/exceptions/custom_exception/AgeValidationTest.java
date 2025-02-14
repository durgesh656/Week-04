package exceptions.custom_exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgeValidationTest {

    @Test
    void Test1(){
        assertTrue(AgeValidation.validateAge(19));
    }

    @Test
    void Test2(){
        assertThrows(InvalidAgeException.class,()-> AgeValidation.validateAge(16));
    }
}
