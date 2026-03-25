//Platform:LeetCode
//Appraoch:“We traverse the string once to build frequency and grouping, so time is O(n), and since the character set is fixed (26 letters), space is O(1).”
//Time Complexity:O(n)
//Space Complexity:O(1)
import java.util.*;

class Solution {
    public String majorityFrequencyGroup(String s) {
        // Step 1: Count frequency
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Group by frequency
        HashMap<Integer, ArrayList<Character>> gp = new HashMap<>();

        for(char c : freq.keySet()){
            int f = freq.get(c);
            gp.putIfAbsent(f, new ArrayList<>());
            gp.get(f).add(c);
        }
        int maxSize = 0;
        int bestFreq = 0;

        for(int k : gp.keySet()){
            int size = gp.get(k).size();

            if(size > maxSize || (size == maxSize && k > bestFreq)){
                maxSize = size;
                bestFreq = k;
            }
        }

        // Step 4: Build result string
        StringBuilder rt = new StringBuilder();
        for(char c : gp.get(bestFreq)){
            rt.append(c);
        }

        return rt.toString();
    }
}
