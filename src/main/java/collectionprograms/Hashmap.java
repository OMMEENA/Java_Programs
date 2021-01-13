package collectionprograms;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {

        Map<Integer, String> hash_map = new HashMap<>();

        // Add method
        hash_map.put(3, "om");
        hash_map.put(2, "ram");
        hash_map.put(1, "ranveer");
        hash_map.put(4, "anu");

        // Print size and content
        System.out.println("Size of map is:- "
                + hash_map.size());
        System.out.println(hash_map);

        //remove method
        hash_map.remove(3);
        hash_map.remove(2);
        System.out.println(hash_map);

        //Display method
        for(Map.Entry HM : hash_map.entrySet()){
            System.out.println("Key: "+HM.getKey() + " & Value: " + HM.getValue());
        }
    }
}