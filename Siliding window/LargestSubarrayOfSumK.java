import java.util.*;

public class LargestSubarrayOfSumK {
    public static int lagsubarr(int arr[],int k){
        int i=0,j=0;
        int n= arr.length;
        int sum=0;
        int maxsub = 0;
        while (j<n) {
            sum=sum+arr[j];
           if (sum<k){
            j++;
           }
           else if(sum == k){
            maxsub = Math.max(maxsub,j-i+1);
            j++;
           }
           else if(sum > k){
            while(sum > k){
                sum=sum-arr[i];
                i++;
            }
            if(sum == k){
                maxsub = Math.max(maxsub,j-i+1);
            }
            j++;
           }
           
        }
        return maxsub;
    }

    public static void main(String args[]){
        int arr[] = {4,1,1,1,2,6,3,7};
        int k=5;
        int res = lagsubarr(arr,k);
        System.out.println(res);
    }
}


//TC-O(n) as each element is processed once when j is incremented, and the i pointer also moves forward when needed.