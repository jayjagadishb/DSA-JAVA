package Hashmap;
import java.util.*;

public class Basic {
    public static void main(String args[]){
        HashMap<String,Integer> hm= new HashMap<>();
        
        //Insert - O(1)
        hm.put("India",100);
        hm.put("Bhutan",200);
        hm.put("Japan",300);

        System.out.println(hm);

        //Get - O(1)
        int pop = hm.get("India");
        System.out.println(pop);
        
        //ContainsKey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("China"));

        //Remove - O(1)
        System.out.println(hm.remove("Japan"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
