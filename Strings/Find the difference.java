//Platform: LeetCode
//Approach: First of all we make a freqency array of size 256 which store all the ASCII value of character in string to fin feequency of small string.
//After that using for each loop we try to find frequenxy of each count. and in second for each loop we check if character is present in second string we 
//reduce the frequecy and if frequecy is negative we return that character as output.
//Time complexity:O(n + m)
//Space Complexity:O(1)


//Code--
class Solution{
  public char findDifference(String s, String s1){
    int[] freq = new int[256];
    for(char ch: s.toCharArray()){
      freq[ch]++;
    }
    for(char ch:s1.toCharArray()){
      freq[ch]--;
      if(freq[ch]<0){
        retunr ch;
      }
    }
    return "";
