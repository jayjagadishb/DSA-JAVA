public class IndexOfFirst1InBinarySortedInfiniteArray {
    public static int findLowHigh(int arr[],int k){
      int low=0;int high=1;
      while(k>arr[high] && high<arr.length){
        low=high;
        high=high*2;
      }
      return findKInd(arr,k,low,Math.min(high,arr.length-1));
    }
    public static int findKInd(int arr[],int k,int low,int high){
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid] == k){
                res=mid;
                high=mid-1;
            }else if(arr[mid] < k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};
        int k=1;
        int res=findLowHigh( arr, k);
        System.out.println(res);
    }
}
