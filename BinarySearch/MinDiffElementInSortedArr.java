public class MinDiffElementInSortedArr {
    public static int mindifval(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid] == k){
                return 0;
            }else if(arr[mid] > k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        int prev = Math.abs(arr[high]-k);
        int next = Math.abs(arr[low]-k);
        return Math.min(prev,next);

    }
    public static void main(String args[]){
        int arr[] = {2,5,6,8,9,12,17};
        int k=10;
        int res = mindifval(arr,k);
        System.out.println(res);
    }
}
