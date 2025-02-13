package collections.map_interface.merge_two_maps;

import collections.map_interface.merge_two_maps.MergeMap;

import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        Map<String, Integer> mergedMap = MergeMap.mergeMaps(map1, map2);
        System.out.println("Merged Map: " + mergedMap);
    }
}
