import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        char ch[] = {'a','b','c'};
        String str = "abcd";
        String str2 = new String("xyz");
        String str3 = "xyz";
        System.out.println(str.length());
        System.out.println(str.charAt(2)); 


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("My name is " + name);

       if(str2 == str3){
        System.out.println("equal");
       } else{
        System.out.println("Not equal");
       }

       
       if(str2.equals(str3)){
        System.out.println("equal");
       } else{
        System.out.println("Not equal");
       }
    }
}