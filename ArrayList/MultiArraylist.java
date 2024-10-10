import java.util.*;
import java.util.ArrayList;

public class MultiArraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        mainList.add(l1); 

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        mainList.add(l2); 

        for(int i=0; i<mainList.size();i++){
            ArrayList<Integer> curr = mainList.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.println(curr.get(j));
            }
            System.out.println();
        }
    }
}
