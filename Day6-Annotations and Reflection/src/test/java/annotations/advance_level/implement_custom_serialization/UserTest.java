package annotations.advance_level.implement_custom_serialization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testSerializeToJson() throws IllegalAccessException {
        User user = new User("Durgesh", 25);
        String jsonOutput = User.serializeToJson(user);

        String expectedJson = "{\"user_name\": \"Durgesh\", \"user_age\": \"25\"}";
        assertEquals(expectedJson, jsonOutput);
    }


}
