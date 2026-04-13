//Platform:GeeksForGeeks
// Approach:
// Firstly, we use a LinkedHashSet to store unique characters while preserving
// their original order in the string.
// Then, we use a StringBuilder to construct the final string from the set.
//
// Time Complexity: O(n)
// Space Complexity: O(n)
//Code--
// User function Template for Java

class Solution {
    String removeDups(String s) {
        char[] arr = s.toCharArray();
        LinkedHashSet<Character> result = new LinkedHashSet<>();
        for(char n:arr){
            result.add(n);
        }
        StringBuilder ans = new StringBuilder();
        for(char n:result){
            ans.append(n);
        }
        return ans.toString();
        
    }
}
