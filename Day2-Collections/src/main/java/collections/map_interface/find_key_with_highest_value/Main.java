package collections.map_interface.find_key_with_highest_value;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",10,"B",20,"C",15);

        System.out.println(KeyWithHighestValue.findKeyWithHighestValue(map));

    }
}
