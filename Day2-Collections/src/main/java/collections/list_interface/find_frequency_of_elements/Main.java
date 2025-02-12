package collections.list_interface.find_frequency_of_elements;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //initialize an array list and add elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Apple");
        arrayList.add("Banana");

        //display the elements with frequencies
        System.out.println("Array of String is:"+arrayList);
        System.out.println("elements with frequency: "+ElementsFrequency.frequencyOfElements(arrayList));

    }
}
