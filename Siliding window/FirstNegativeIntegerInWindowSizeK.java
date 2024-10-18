import java.util.*;

public class FirstNegativeIntegerInWindowSizeK {
    public static ArrayList<Integer> FNIWSK(int arr[], int k) {
        ArrayList<Integer> Fval = new ArrayList<>();
        Deque<Integer> negQueue = new LinkedList<>();  // Queue to store indexes of negative numbers
        int i = 0, j = 0;
        int n = arr.length;

        while (j < n) {
            // If the current element is negative, add its index to the queue
            if (arr[j] < 0) {
                negQueue.addLast(j);
            }

            // If the window size is less than k, just move the right pointer `j`
            if (j - i + 1 < k) {
                j++;
            }
            // Once the window size is exactly k
            else if (j - i + 1 == k) {
                // Check if there's any negative number in the current window
                if (!negQueue.isEmpty()) {
                    // If the front of the queue is in the current window, add its value
                    Fval.add(arr[negQueue.peekFirst()]);

                    // If the negative number is sliding out of the window, remove it
                    if (negQueue.peekFirst() == i) {
                        negQueue.removeFirst();
                    }
                } else {
                    // If no negative number, add 0
                    Fval.add(0);
                }

                // Slide the window forward
                i++;
                j++;
            }
        }
        return Fval;
    }

    public static void main(String args[]) {
        int arr[] = {12, -2, 3, -8, -6, 7, 3, 9, -5};
        int k = 3;
        ArrayList<Integer> result = FNIWSK(arr, k);
        System.out.println(result);  // Expected output: [-2, -2, -8, -8, -6, 0, -5]
    }
}
