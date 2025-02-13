package collections.set_interface.union_and_intersection_of_two_sets;

import java.util.HashSet;
import java.util.Set;

public class FindUnionAndIntersection {

    public static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> unionSet = new HashSet<>();

        unionSet.addAll(set1);
        unionSet.addAll(set2);

        return unionSet;
    }

    public static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersectionSet = new HashSet<>();
        for(int e : set1){
            if (set2.contains(e)){
                intersectionSet.add(e);
            }
        }
        return intersectionSet;
    }
}
