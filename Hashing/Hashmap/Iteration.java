package Hashmap;

import java.util.*;

public class Iteration {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("jay",90);
        hm.put("Satya",100);
        hm.put("vivek",120);
        hm.put("raj",150);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" + k + ",value=" + hm.get(k));
        }
    }
}
