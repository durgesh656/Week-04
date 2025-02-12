package collections.list_interface.reverse_a_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //initialize an arrayList
        List<Number> arrayList = new ArrayList<>();

        //add values to array list
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4.4);
        arrayList.add(5);
        arrayList.add(6);

        //display array list and reversed array list
        System.out.println("original Array list is:"+arrayList);
        ReverseList.reverseArrayList(arrayList);
        System.out.println("reversed Array list is:"+arrayList);
        System.out.println("----------------------------------------");

        //initialize a linked list
        List<Number> linkedList = new LinkedList<>();
        //add elements to linked list
        linkedList.add(1);
        linkedList.addFirst(3);
        linkedList.addLast(9);
        linkedList.add(4.4);
        linkedList.add(3,7);

        //display the original and reversed linked list
        System.out.println("original linked list is:"+linkedList);
        ReverseList.reverseLinkedList(linkedList);
        System.out.println("Reversed linked list is:"+linkedList);



    }
}
