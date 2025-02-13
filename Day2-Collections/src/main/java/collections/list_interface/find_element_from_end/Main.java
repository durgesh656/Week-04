package collections.list_interface.find_element_from_end;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('A','B','C','D','E'));
        System.out.println(FindElementFromEnd.findNthNode(list, 2));
    }

}
