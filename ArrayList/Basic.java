import java.util.*;

public class Basic {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);

        System.out.println(list);

        //Get Operation - give index no it will return value at that index
        int ele = list.get(2);
        System.out.println(ele);

        //Delete Operation - give index no
        list.remove(2);
        System.out.println(list);

        //Set Operation (new value) - give index no and new value
        list.set(2,10);
        System.out.println(list);

        //Contains Opeartion - give value to check
        System.out.println(list.contains(5));
        
        System.out.println(list.size());
        Collections.sort(list); //ascending order
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder()); //descending order
        System.out.println(list);
    }
    
}
