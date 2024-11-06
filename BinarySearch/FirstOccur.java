import java.util.*;

public class FirstOccur {
    public static int firstoccurindex(int arr[],int k){
        int start =0;
        int end = arr.length-1;
        int res = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == k){
                 res = mid;
                 end = mid-1;
            }
            else if(k < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {2,1,10,10,10,4,7};
        int k=10;
        int idx = firstoccurindex(arr,k);
        System.out.println(idx);
    }
}
