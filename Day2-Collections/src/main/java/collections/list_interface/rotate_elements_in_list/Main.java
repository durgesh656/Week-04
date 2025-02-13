package collections.list_interface.rotate_elements_in_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int position=2;
        System.out.println("List after rotations is:"+RotateElements.rotateList(list,position));
    }
}
