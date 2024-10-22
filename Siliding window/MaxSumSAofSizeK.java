import java.util.*;

public class MaxSumSAofSizeK {
    public static int findMaxSubArray(int arr[],int k){
        int n = arr.length;
        int i=0,j=0;
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        while(j < n){
            sum += arr[j];

            if(j - i + 1 < k){
                j++;
            }

            else if(j - i + 1 == k){
               maxSum = Math.max(sum,maxSum);
               sum -= arr[i];
               i++;
               j++;
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,1,5,2,8,9};
        int k=3;
        int res = findMaxSubArray(arr,k);
        System.out.println(res);
    }
}



