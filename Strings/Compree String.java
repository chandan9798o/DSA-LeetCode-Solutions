//Platform:GeeksForGeeks
//Approach: Linear Search
//Time Complexity: O(m * n)
//Space Complexity:O(k)

//Code-
class Solution {
    public String compressString(String s) {
       s = s.toLowerCase();
       char[] ch = s.toCharArray();
       StringBuilder sb = new StringBuilder();
       for(int i=0; i<ch.length; i++){
          int count = 1;
          char current = ch[i];
          while(i+1 < ch.length && ch[i + 1] == current){
              count++;
              i++;
          }
          sb.append(current);
          sb.append(count);
       }
       return sb.toString();
    }
}
