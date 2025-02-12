package collections.list_interface.reverse_a_list;

import java.util.ArrayList;
import java.util.List;

public class ReverseList<T> {
    //create a static generic method to reverse an array list
    public static <T> void reverseArrayList(List<T> arrayList){
       int left=0;
       int right=arrayList.size()-1;
       T temp;
       while(left < right){
           //swap the elements
           temp=arrayList.get(right);
           arrayList.set(right,arrayList.get(left));
           arrayList.set(left,temp);
           left++;
           right--;
       }

    }

    //create a static generic method to reverse a linked list
    public static <T> void reverseLinkedList(List<T> linkedList){
        int left = 0;
        int right = linkedList.size()-1;
        T temp;
        while(left<right) {
            //Swap the element
            temp = linkedList.get(left);
            linkedList.set(left, linkedList.get(right));
            linkedList.set(right, temp);

            left++;
            right--;
        }

    }
}
