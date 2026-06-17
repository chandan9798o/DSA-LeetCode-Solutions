//Platform:GeeksForGeeks
//Approach:First of all we check the given string is not empty by using build in method is.Empty. If it is then return 0.
//After that we return the simply length of the string array  as output after breaking array string into array string. 
//Time Complexity:O(n)
//Space Complexity:O(n)

class Solution {
    public int countWords(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        String[] a = s.split("\\s+");
        return a.length;
    }
}
