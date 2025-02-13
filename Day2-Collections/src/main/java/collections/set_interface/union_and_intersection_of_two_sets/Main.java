package collections.set_interface.union_and_intersection_of_two_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        System.out.println("Union set of both set is:"+FindUnionAndIntersection.findUnion(set1,set2));
        System.out.println("Intersection set of both set is:"+FindUnionAndIntersection.findIntersection(set1,set2));
    }
}
