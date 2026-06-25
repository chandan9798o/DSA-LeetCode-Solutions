//Platform:leetCode
//Approach:In this proble we have to find longest substring lenght without repeating character. First of all we make HashSet to store non repeated character.
//After that using for loop we traverse the each character of given string and add continuosly and  check the current character is present in the set or not.
//If character is present then we remove the first last character of string and then add up to right ongoing character. At last we return the maxLen of substring
//with the help of Math.max as output.
//Time Complexity:O(n)
//Space Complexity:O(n)

import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>(); 
    int maxLen = 0;
    int left = 0;
    for(int right = 0; right<s.length(); right++){
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(right));
        maxLen = Math.max(maxLen, set.size());
    }
    return maxLen;
    }
}
