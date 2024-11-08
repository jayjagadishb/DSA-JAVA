public class PeakElement {
    public static int findPeak(int[] arr){
        int low=0;
        int high=arr.length-1;
        int n=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==0){
                if(arr[0] > arr[1]){
                    return 0;
                }else{
                    return 1;
                }
            }else if(mid==n-1){
                if(arr[n-1]>arr[n-2]){
                    return n;
                }
            }
            else if(mid>0 && mid<n-1){
                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                    return mid;
                }else if(arr[mid-1] > arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {10,20,50,30,67};
        int val = findPeak(arr);
        System.out.println(val);
    }
}
