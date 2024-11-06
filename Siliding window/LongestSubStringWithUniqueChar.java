import java.util.*;
public class LongestSubStringWithUniqueChar {
    public static int findLongest(String str){
        int i=0,j=0;
        int n=str.length();
        int maxLength=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n){
            map.put(str.charAt(j), map.getOrDefault(str.charAt(j),0) + 1 );
            if(map.size() == j-i+1){
                maxLength = Math.max(maxLength, j-i+1);
            }
            while(map.size() < j-i+1){
                char leftchar = str.charAt(i);
                map.put(leftchar,map.get(leftchar) -1);
                if(map.get(leftchar) == 0){
                    map.remove(leftchar);
                }
                i++;
            }
            j++;
        }
        return maxLength;
    }
    public static void main(String args[]){
        String str = "aabggscrbregdse";
        int res = findLongest(str);
        System.out.println(res);
    }
}
