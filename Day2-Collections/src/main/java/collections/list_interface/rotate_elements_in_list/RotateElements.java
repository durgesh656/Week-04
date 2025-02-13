package collections.list_interface.rotate_elements_in_list;

import java.util.List;

public class RotateElements {
    public static List<Integer> rotateList(List<Integer> list, int position){
        int temp;
        for ( int i=0;i<position;i++){
            temp= list.get(0);
            list.remove(0);
            list.addLast(temp);
        }

        return list;
    }
}
