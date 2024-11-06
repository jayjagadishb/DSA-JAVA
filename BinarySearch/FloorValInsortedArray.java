public class FloorValInsortedArray {
    public static int findFloor(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        int floor=-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(target> arr[mid]){
                floor=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return floor;
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 4, 6, 8, 10, 12, 14};
        int target = 5;
        int floor = findFloor(arr, target);
        if (floor != -1) {
            System.out.println("The floor of " + target + " is: " + floor);
        } else {
            System.out.println("No floor found for " + target + " in the array.");
        }
    }
}
