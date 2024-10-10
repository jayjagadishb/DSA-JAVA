import java.util.*;
public class HappyNumber {
    public static int square(int n){
        int total = 0;
        while(n>0){
            int dig = n%10;
           total += dig * dig;
           n = n/10;
        }
        return total;
    }

    public static boolean CheckHappy(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        while(n != 1 && !arr.contains(n)){
           arr.add(n);
           n = square(n);
        }
        return n == 1;
    }
    public static void main(String args[]){
       int n = 19;
       System.out.println(CheckHappy(n));
    }
}
