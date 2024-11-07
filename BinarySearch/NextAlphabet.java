public class NextAlphabet {
    public static char findNextAlphabet(char[] arr, char target) {
        int low = 0;
        int high = arr.length - 1;
        char result = '\0';  // Initialize with a placeholder value

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                // If arr[mid] is greater than the target, it could be a potential answer
                result = arr[mid];
                high = mid - 1;  // Move left to see if there's a smaller valid character
            } else {
                // Move right if arr[mid] is less than or equal to the target
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'f', 'h', 'k'};
        char target = 'f';
        char nextAlphabet = findNextAlphabet(arr, target);

        if (nextAlphabet != '\0') {
            System.out.println("The next alphabet after '" + target + "' is: " + nextAlphabet);
        } else {
            System.out.println("No next alphabet found after '" + target + "'");
        }
    }
}
