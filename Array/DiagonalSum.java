import java.util.*; 

public class DiagonalSum {

    public static int sumDiag(int arr[][]){
        int sum =0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //        if(i == j){
        //         sum += arr[i][j];
        //        }else if(i+j == arr.length-1){
        //         sum += arr[i][j];
        //        }
        //     }
        // }

        for(int i=0;i<arr.length;i++){
           //pd
           sum += arr[i][i];

           //sd
           if(i != arr.length-1-i){
            sum += arr[i][arr.length-i-1];
           }
        }
        return sum;
    }
    public static void main(String args[]){
        int martix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int finalSum = sumDiag(martix);
        System.out.println(finalSum);
    }
}

