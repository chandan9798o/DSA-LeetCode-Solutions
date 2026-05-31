//Platform:GeeksForGeeks
//Approach:We use for each loop by converting the given array into character array.
//Time Compelxity:O(n)
//Space Complexity:O(1)
class Solution {
    public static int lengthString(String s) {
        int count = 0;
        for(char ch:s.toCharArray()){
            count++;
        }
        return count;
    }
}
