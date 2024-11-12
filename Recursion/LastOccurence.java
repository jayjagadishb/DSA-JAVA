package Recursion;

public class LastOccurence {
     public static int lastoccur(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastoccur(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
     }
     public static void main(String[] args) {
         int arr[] ={1,4,3,2,6,5,4,5,2,4,5};
         int ind = 0;
         int key =5;
         int res = lastoccur(arr, key, ind);
         System.out.println(res);
     }
}
