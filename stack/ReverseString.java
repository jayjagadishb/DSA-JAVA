import java.util.*;
public class ReverseString {

    public static String Reverse(String str){
       Stack<Character> st = new Stack<>();
       int idx = 0;
       while(idx < str.length()){
        st.push(str.charAt(idx));
        idx++;
       }
       StringBuilder res = new StringBuilder("");
       while(!st.isEmpty()){
        res.append(st.pop());
       }
        return res.toString();
    }
    public static void main(String args[]){
         String str = "abc";
         String result = Reverse(str);
         System.out.println(result);
    }
}
