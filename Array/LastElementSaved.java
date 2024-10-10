import java.util.*;
public class LastElementSaved {
    public static int returnElement(int arr[],int k){
        ArrayList<Integer> arrr = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            arrr.add(arr[i]);
        }
        int i=0;
        while(arrr.size() > 1){
            int ind = (i + k - 1) % arrr.size();
            arrr.remove(ind);
            i = ind;
        }
        return arrr.get(0);
    }
    public static void main(String args[]){
        int arr[] = {2,4,1,9,7,5,6};
        int k=2;
        System.out.println(returnElement(arr, k));
    }
}
