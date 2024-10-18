import java.util.*;

public class CountAnagramOccurrences {
    public static int countAnagram(String txt,String pat){
        int patLength = pat.length();
        int txtLength = txt.length();
        int count  = 0;
         // Frequency array for pattern and window (considering only lowercase English letters)
        int patFreq[] = new int[26];
        int windowFreq[] = new int[26];
        // Build the frequency array for the pattern
        for(int i=0;i<patLength;i++){
            patFreq[pat.charAt(i)-'a']++;
        }
         // First window of size `patLength`
        for(int i=0;i<patLength;i++){
            windowFreq[txt.charAt(i)-'a']++;
        }
         // If the frequency of the first window matches the pattern, count it as an anagram
        if(Arrays.equals(patFreq,windowFreq)){
            count++;
        }
        // Sliding window over the rest of the string `txt`
        for(int i=patLength;i<txtLength;i++){
             // Add the current character to the window
            windowFreq[txt.charAt(i) - 'a']++;
            // Remove the character that is sliding out of the window
             
            windowFreq[txt.charAt(i-patLength)-'a']--;
            // Check if the current window matches the pattern frequency
            if(Arrays.equals(patFreq,windowFreq)){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        String txt = "cbaebabacd";
        String pat = "abc";
        int res = countAnagram(txt,pat);
        System.out.println(res);
    }
}
