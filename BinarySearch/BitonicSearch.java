class BitonicSearch {

    // Function to find the peak element in the bitonic array
    public static int findPeak(int[] arr, int low, int high) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;

            // Check if mid is the peak
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && 
                (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            }

            // If the middle element is part of the increasing sequence
            if (mid > 0 && arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Binary search on the increasing part
    public static int binarySearchAsc(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // Binary search on the decreasing part
    public static int binarySearchDesc(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // Function to search for an element in a bitonic array
    public static int searchBitonic(int[] arr, int target) {
        int n = arr.length;

        
        int peak = findPeak(arr, 0, n - 1);

       
        int index = binarySearchAsc(arr, 0, peak, target);
        if (index != -1) return index;

   
        return binarySearchDesc(arr, peak + 1, n - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        int target = 4;

        int result = searchBitonic(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
