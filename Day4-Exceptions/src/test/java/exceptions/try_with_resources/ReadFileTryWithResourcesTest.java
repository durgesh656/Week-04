package exceptions.try_with_resources;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReadFileTryWithResourcesTest {

    @Test
    void test1(){
        assertThrows(IOException.class,()-> ReadFileTryWithResources.readFile("demo"));
    }

    @Test
    void test2() throws IOException {
        assertTrue(ReadFileTryWithResources.readFile("info.txt"));
    }

}
