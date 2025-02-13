package collections.set_interface.check_two_sets_equal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));

        System.out.println("Are both sets equal? "+CheckSetEqual.compareTwoSets(set1,set2));

    }
}
