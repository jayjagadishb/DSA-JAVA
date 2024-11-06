public class SearchingInNearlySortedArray {
    public static int searchVal(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid= low + (high-low)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if((mid-1)>=low && arr[mid-1] == k){
                return mid-1;
            }
            else if((mid+1)<=high && arr[mid+1] == k){
                return mid+1;
            }

            if(k < arr[mid]){
                high = mid-2;
            }
            else if(k > arr[mid]){
                low = mid+2;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {5,10,15,30,20,40};
        int k = 15;
        int val = searchVal(arr,k);
        System.out.println(val);
    }
}
