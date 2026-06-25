//Platform:LeetCode
//Approach:In this problem we have to store the string in dynamic array which contains the same character with same frequency means anagram. First of all
//we take a single string form given string array and then perform sorting operation on each character of seletcted string. And we check the current sorted string
//is available in arraylist if not then add to the arraylist. If sorted string is contains then add to its key value pairs and return the final key anagram 
//To the dynamic array as output.
//Time Compelxity:O(n klogk)
//Space Complexity:O(n.k)

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s:strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!mp.containsKey(key)){
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
