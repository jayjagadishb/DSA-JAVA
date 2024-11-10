package Hashset;


import java.util.*;



public class Iteration {
    public static void main(String args[]){
        HashSet<String> hm = new HashSet<>();
        hm.add("jay");
        hm.add("Satya");
        hm.add("vivek");
        hm.add("raj");

        //Iterate
       Iterator it =  hm.iterator();
       while(it.hasNext()){
          System.out.println(it.next());
       }
    }
}
 