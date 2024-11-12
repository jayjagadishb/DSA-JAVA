package Recursion;

public class Fact {
    public static int findfact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = findfact(n-1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String args[]){
        int n=6;
        int res = findfact(n);
        System.out.println(res);
    }
}
