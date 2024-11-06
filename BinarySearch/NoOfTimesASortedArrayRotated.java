public class NoOfTimesASortedArrayRotated{
    public static int countRotations(int arr[]){
        int low = 0;
        int n = arr.length;
        int high = n-1;

        while(low < high ){
            if(arr[low] <= arr[high]){
                return low;
            }
            int mid = low + (high-low)/2;
            int next = (mid+1) % n;
            int left = (mid+n-1) % n;
            while(arr[mid] <= arr[left] && arr[mid]<= arr[next]){           
                return mid;
            }
            if(arr[mid]>=arr[low]){
                low=mid+1;
            }
            else if(arr[mid]<=arr[high]){
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
         int[] arr = {15, 18, 2, 3, 6, 12};
        int rotations = countRotations(arr);
        System.out.println("The array is rotated " + rotations + " times.");       
    }
}