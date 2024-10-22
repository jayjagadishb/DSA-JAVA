import java.util.HashMap;

public class LargestSubarrayOfSumKWithNegNum {
    public static int lagsubarr(int arr[], int k) {
        int n = arr.length;
        int sum = 0;
        int maxLength = 0;

        // HashMap to store (cumulative sum, index)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int j = 0; j < n; j++) {
            sum += arr[j];  // Add the current element to the cumulative sum

            // If the cumulative sum is equal to k, update maxLength
            if (sum == k) {
                maxLength = j + 1;  // Subarray from index 0 to j has sum k
            }

            // If (sum - k) exists in the map, a subarray with sum k exists
            if (map.containsKey(sum - k)) {
                int i = map.get(sum - k);  // i is the end of the subarray
                maxLength = Math.max(maxLength, j - i);  // Update maxLength
            }

            // If this cumulative sum has not been seen before, store it with its index
            if (!map.containsKey(sum)) {
                map.put(sum, j);
            }
        }

        return maxLength;  
    }

    public static void main(String args[]) {
        int arr[] = {4, 1, -1, 1, 2, -1, 5, -2};
        int k = 5;
        int res = lagsubarr(arr, k);
        System.out.println(res);  
    }
}



//O(n): We only iterate through the array once, and each operation (adding to or checking the HashMap) is O(1) on average.