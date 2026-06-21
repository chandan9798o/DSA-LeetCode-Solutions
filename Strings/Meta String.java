//Platform:LeetCode
//Approach:In this problem we have to return true false on the basic of whether the given two strings are equal to each after swapping only two character.
//First of all I make two variable first and second with -1 store. and third one count. We traver the each character using for loop. 
//We check the Corresponding charqacter is not equal to each other. Then increase count++ and store it in first i if count == 1. Similary for second if count == 2.
//And in last we return the cross check of first and second position of two string equal as output. 

//Time Complexity:O(n)
//Space Complexity:O(1)
//Code-
class Solution {
    public boolean metaStrings(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int first = -1, second = -1;
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {

                count++;

                if (count == 1)
                    first = i;
                else if (count == 2)
                    second = i;
                else
                    return false;
            }
        }

        if (count != 2)
            return false;

        return s1.charAt(first) == s2.charAt(second)
            && s1.charAt(second) == s2.charAt(first);
    }
}
