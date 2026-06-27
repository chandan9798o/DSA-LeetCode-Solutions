//Platform:GeeksForGeeks
//Approach:In this problem  we find the every possible substring from given string which contains numbers. We convert the string number into integer number using
//Integer.parseInt() method and count it's sum and return it as output.
//Time Complexity:O(n^2)
//Space Complexity:O(1)

//code-
import java.util.*;
class Solution {
    public static int sumSubstrings(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                list.add(Integer.parseInt(s.substring(i, j)));
            }
        }
        int count = 0;
        for(int n:list){
            count+=n;
        }
        return count;
    }
}
