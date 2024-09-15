import java.util.*;
public class ReverseWords {
    public static String reverseword(String str){
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
        String sen = "Jay Jagadish Behera";
        String revsen = reverseword(sen);
        System.out.println(revsen);
    }
}
