package collections.set_interface.symmetric_difference;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Your symmetric difference of set is: "+ FindSymmetricDifference.findDifference(set1,set2));
    }

}
