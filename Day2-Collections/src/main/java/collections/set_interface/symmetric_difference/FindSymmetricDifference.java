package collections.set_interface.symmetric_difference;

import java.util.HashSet;

public class FindSymmetricDifference {
    public static HashSet<Integer> findDifference(HashSet<Integer>set1, HashSet<Integer> set2){

        //create a hashSet to store difference of both sets
        HashSet<Integer> resultSet = new HashSet<>(set1);

        //remove all the elements of set2 from ans
        resultSet.removeAll(set2);

        //now remove all the elements of set1 from set2
        set2.removeAll(set1);

        //now add all the elements of set2 to the ans set
        resultSet.addAll(set2);

        //return ans
        return resultSet;
    }
}
