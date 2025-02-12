package collections.list_interface.reverse_a_list;

import collections.list_interface.reverse_a_list.ReverseList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseAListTest {
    @Test
    void test1(){
        List<Number> arrayList = new ArrayList<>();
        List<Number> linkedList = new LinkedList<>();

        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);

        linkedList.add(1.2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("original Array List:"+arrayList);
        ReverseList.reverseArrayList(arrayList);//call method to reverse the arrayList
        System.out.println("Reversed Array List:"+arrayList);

        System.out.println();

        System.out.println("original Linked List:"+linkedList);
        ReverseList.reverseLinkedList(linkedList);
        System.out.println("Reversed linked List:"+linkedList);

        assertEquals(14,arrayList.get(0));//after reversing the arrayList Last element became first
        assertEquals(4,linkedList.get(0));//after reversing the linkedList Last element became first


    }
}
