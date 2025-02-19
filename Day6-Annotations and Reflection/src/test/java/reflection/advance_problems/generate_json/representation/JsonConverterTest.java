package reflection.advance_problems.generate_json.representation;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import reflection.advance_problems.generate_json_representation.JsonConvertor;
import reflection.advance_problems.generate_json_representation.Person;

public class JsonConverterTest {

    @Test
    void testToJson() {
        Person person = new Person("Durgesh",25,true);
        String expectedJson = "{\"name\":\"Durgesh\", \"age\":25, \"accessible\":true}";
        String actualJson = JsonConvertor.toJson(person);
        assertEquals(expectedJson, actualJson);
    }

    @Test
    void testToJsonWithNull() {
        Person person = new Person(null, 30, false);
        String expectedJson = "{\"name\":null, \"age\":30, \"accessible\":false}";
        String actualJson = JsonConvertor.toJson(person);
        assertEquals(expectedJson, actualJson);
    }
}

