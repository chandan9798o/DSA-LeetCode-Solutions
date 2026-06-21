//Platform:LeetCode
//Approach:In this question We have to check the given two  string array element in sequence is equal to each other or not. First of all i make the two 
//StringBuilder with different variable and then using for each loop store the each character of given two array to these stringBuilder to maintain sequence.
//And in last i return the output as it equal or not in the form of boolean.
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code-
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(String ch : word1){
         sb.append(ch);
        }
        for(String ch : word2){
           sb1.append(ch);
        }
        return sb.toString().equals(sb1.toString());
    }
}
