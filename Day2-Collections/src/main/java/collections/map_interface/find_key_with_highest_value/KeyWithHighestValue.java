package collections.map_interface.find_key_with_highest_value;


import java.util.Map;

public class KeyWithHighestValue {
    public static String findKeyWithHighestValue(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null; // Return null if the map is empty or null
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}