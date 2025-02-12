package collections.list_interface.find_frequency_of_elements;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class ElementsFrequencyTest {

    @Test
    void test1(){
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana","Apple","Banana","Orange"));

        assertEquals(2,ElementsFrequency.frequencyOfElements(arrayList).get("Apple"));
        assertEquals(2,ElementsFrequency.frequencyOfElements(arrayList).get("Banana"));
        assertEquals(1,ElementsFrequency.frequencyOfElements(arrayList).get("Orange"));

        //because mango does not present in the list so it's frequency by default is null
        assertEquals(null,ElementsFrequency.frequencyOfElements(arrayList).get("Mango"));


    }
}
