package collections.list_interface.find_element_from_end;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindElementFromEnd {
    //method to find Nth node of a linked list from last
    public static char findNthNode(LinkedList<Character> list, int n){

        if(list == null || n < 0){
            throw new IllegalArgumentException("Invalid Input");
        }

        Iterator<Character> first = list.listIterator();
        Iterator<Character> second = list.listIterator();
        for(int i = 0; i < n; i++){
            if(!first.hasNext()){
                throw new IllegalArgumentException("Index out of bound");
            }
            first.next();
        }

        while(first.hasNext()){
            first.next();
            second.next();
        }

        return second.next();
    }
}
