public class SearchIn2DSortedArray {
    public static boolean searchMatrix(int[][] arr,int target){
        if(arr==null || arr.length == 0 || arr[0].length == 0){
            return false;
        }
        int i=0,j=arr[0].length-1;
        while(i>=0 && i<arr.length && j>=0 && j<arr[0].length){
            if(arr[i][j] == target){
                return true;
            }else if(arr[i][j] > target){
                j--;
            }else if(arr[i][j] < target){
                i++;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 9;

        boolean found = searchMatrix(matrix, target);
        if (found) {
            System.out.println("Element found in the matrix.");
        } else {
            System.out.println("Element not found in the matrix.");
        }
    }
}
