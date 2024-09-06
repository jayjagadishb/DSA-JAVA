import java.util.*;

public class ShortestPath {
    public static float shortest(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(ch == 'w'){
             x--;
           }else if(ch == 'n'){
             y++;
           }else if(ch == 'e'){
             x++;
           }else if(ch == 's'){
             y--;
           }
        }
        float dis = (float)Math.sqrt((x*x) + (y*y));
        return dis;
    }
    public static void main(String args[]){
        String str = "wneenesennn";
        System.out.println(shortest(str));
    }
}
