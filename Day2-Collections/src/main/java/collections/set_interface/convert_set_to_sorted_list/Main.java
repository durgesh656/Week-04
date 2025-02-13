package collections.set_interface.convert_set_to_sorted_list;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(5,3,9,1));

        //invoking method which convert unsorted set to a sorted list and print it
        System.out.println("Your sorted list is: "+ ConvertSetToSortedList.convertSetToSortedList(hashSet));
    }

}
