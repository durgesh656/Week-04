package collections.list_interface.find_frequency_of_elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ElementsFrequency {
    public static Map<String,Integer> frequencyOfElements(ArrayList<String> array){
        //initialize a hash map to store the element and it's frequency
        Map<String,Integer> hashMap = new HashMap<>();
        //store the frequency of each element
        for(String e: array){
            if (!hashMap.containsKey(e)){
                hashMap.put(e,1);
            }
            else{
                hashMap.put(e,hashMap.get(e)+1);
            }
        }
        return hashMap;
    }
}
