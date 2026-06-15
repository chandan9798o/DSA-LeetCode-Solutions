//Platform:GeeksForGeeks
//Approach:We create array of size of 256 which contain Extended ASCII value of character. After that using for each loop we remove all the character of
//second string and again second for each loop if if remove array does not remove the character of first string we append it to the stringbuilder
// . In last we return this stringbuilder value after converting to string.
//Time Complexity:O(n + m)
//Space Complexity:O(1)
class Solution {
    static String removeChars(String str1, String str2) {
       boolean[] re = new boolean[256];
       for(char ch:str2.toCharArray()){
           re[ch] = true;
       }
       StringBuilder sb = new StringBuilder();
       for(char ch: str1.toCharArray()){
           if(!re[ch]){
               sb.append(ch);
           }
       }
       return sb.toString();
    }
}
