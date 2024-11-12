package Recursion;

public class fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int snm1 = fib(n-1);
        int snm2 = fib(n-2);
        int fn = snm1 + snm2;
        return fn;
    }
    public static void main(String args[]){
        int n=7;
        int res=fib(n);
        System.out.println(res);
    }
}
