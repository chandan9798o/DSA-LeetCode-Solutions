//Platform:GeeksForGeeks
//Approach:First of all we find the fraquency of each character in string and then we traverse the frequency of each character to know the most frequent item and have less ASCII value
//by using conditional statement. And then we return as output.
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code
import java.util.*;

class Solution {
    public char getMaxOccuringChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char result = Character.MAX_VALUE; 
        int maxFreq = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            char ch = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                result = ch;
            }
            else if (freq == maxFreq && ch < result) {
                result = ch;
            }
        }

        return result;
    }
}

