import java.util.*;

public class MaximumOfAllSubArr {
    public static ArrayList<Integer> maxofallsubarr(int arr[], int k) {
        int i = 0, j = 0;
        int n = arr.length;
        Deque<Integer> max = new LinkedList<>();  // Deque to store indices
        ArrayList<Integer> res = new ArrayList<>();  // Collecting results

        while (j < n) {
            // Maintain the deque, remove elements from the back if they are smaller than the current element
            while (!max.isEmpty() && arr[max.peekLast()] <= arr[j]) {
                max.removeLast();
            }

            // Add the current element index to the deque
            max.addLast(j);

            // If the window size is less than k, just move the window
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {  // Once the window size hits k
                // The maximum element of the current window is at the front of the deque
                res.add(arr[max.peekFirst()]);

                // Remove the element if it is out of this window
                if (max.peekFirst() == i) {
                    max.removeFirst();
                }

                // Slide the window
                i++;
                j++;
            }
        }

        return res;  // Return ArrayList directly
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -2, 8, 4, -1, 5, 8};
        int k = 3;
        ArrayList<Integer> res = maxofallsubarr(arr, k);
        System.out.println(res);  // Print ArrayList
    }
}
