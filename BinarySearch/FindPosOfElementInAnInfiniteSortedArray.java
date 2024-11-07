public class FindPosOfElementInAnInfiniteSortedArray {
    public static int findPosition(int[] arr, int target){
        int low=0;
        int high=1;
        while(target>arr[high] && high<arr.length){
            low=high;
            high=high*2;
        }
        return bs(arr,target,low,Math.min(high,arr.length-1));
    }
    public static int bs(int arr[],int k,int low,int high){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
   
    public static void main(String[] args) {
        // Example large sorted array (simulating an infinite sorted array)
        int[] arr = {1, 3, 5, 7, 9, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90};
        int target = 55;

        int position = findPosition(arr, target);
        if (position != -1) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
