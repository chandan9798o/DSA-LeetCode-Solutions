//Platform:GeeksForGeeks
//Approach:We create a integer index with value -1. And then we collect all the elements of string into array.
//After that we execute reverse loop to identify last element index. If identify return it's index
//otherwise returing -1;
//Time Complexity:O(n);
//Space Complexity:O(n)
class Solution {
    int LastIndex(String s, char c) {
        int index = -1;
        char[] m = s.toCharArray();
        for(int i=m.length-1; i>=0; i--){
            if(m[i] == c){
                index = i;
                break;
            }
        }
        return index;
    }
}
