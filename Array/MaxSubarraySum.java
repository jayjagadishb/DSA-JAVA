import java.util.*;
public class MaxSubarraySum {
    public static void MaxSubarraySums(int arr[]){
        int cs = Integer.MIN_VALUE;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.print(ms);
    }
    public static void main(String args[]){
        int num[] = {1,-2,6,-1,3};
        MaxSubarraySums(num);
    }
}
