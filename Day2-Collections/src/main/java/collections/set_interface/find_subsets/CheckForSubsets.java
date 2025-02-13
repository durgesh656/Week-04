package collections.set_interface.find_subsets;

import java.util.HashSet;

public class CheckForSubsets {

    public static boolean checkIfSubset(HashSet<Integer> set1, HashSet<Integer> set2) {

        //check if set 2 contains all element of set 1
        return set2.containsAll(set1);
    }
}
