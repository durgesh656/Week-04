package collections.list_interface.remove_duplicates;

import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list){

        for (int i=0; i< list.size();i++){
            for(int j=i+1; j< list.size();j++){
                if (list.get(i) == list.get(j)){
                    list.remove(j);
                }
            }
        }
        return list;
    }
}
