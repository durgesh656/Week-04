package annotations.intermediate.max_length_annotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CheckValidUsernameTest {
    @Test
    void checkValidUsername() {
        User validate = new User("Durgesh");
        assertEquals("Durgesh", validate.getUserName());
    }

    @Test
    void testInvalidUsernameLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("VeryLongUsername");
        });

        assertEquals("Exception caught", exception.getMessage());
    }

}
