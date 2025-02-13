package collections.set_interface.convert_set_to_sorted_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ConvertSetToSortedList {

    public static List<Integer> convertSetToSortedList(HashSet<Integer> hashSet){

        ArrayList<Integer> sortedArray = new ArrayList<>(hashSet);

        //use built-in method to sort list
        Collections.sort(sortedArray);

        //return sorted list
        return sortedArray;
    }
}
