//Platform:LeetCode
//Approach:In thsi problem we have to check the given open brackets have must corrensponding close bracket is available in given string. We use stack here
//which store character one by one from for each loop. After storing open brackest I checks the stack is empty or not it means it will not have closing paranthesis .
//It will return false. If no then we check the open bracket have corresnponding brackets or not and return as output . 
//Time Compelxity:O(n)
//Space Complexity:O(n)

//Code-
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

            else {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
