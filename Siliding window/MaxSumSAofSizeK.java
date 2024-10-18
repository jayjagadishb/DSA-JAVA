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



// import java.util.*;

// public class MaxSumSAofSizeK {
//     public static int findMaxSubArray(int arr[], int k) {
//         int n = arr.length;
//         int i = 0, j = 0;
//         int sum = 0;
//         int maxSum = Integer.MIN_VALUE;  // Initialize to track the max sum.

//         while (j < n) {
//             // Add current element to sum
//             sum += arr[j];

//             // If window size is smaller than k, just move the right pointer j
//             if (j - i + 1 < k) {
//                 j++;
//             } 
//             // Once we hit window size k
//             else if (j - i + 1 == k) {
//                 // Calculate the maximum sum for this window
//                 maxSum = Math.max(sum, maxSum);

//                 // Slide the window: Remove the element at the start and move both pointers
//                 sum -= arr[i];
//                 i++;
//                 j++;
//             }
//         }
//         return maxSum;
//     }

//     public static void main(String args[]) {
//         int arr[] = {2, 3, 4, 1, 5, 2, 8, 9};  // Your test case
//         int k = 3;
//         int res = findMaxSubArray(arr, k);
//         System.out.println(res);  // Expected output: 19
//     }
// }
