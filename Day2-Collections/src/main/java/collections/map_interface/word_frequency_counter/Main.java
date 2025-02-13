package collections.map_interface.word_frequency_counter;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> map = MapWordsFrequency.countAndMap("demo.txt");
        System.out.println(map);

    }
}
