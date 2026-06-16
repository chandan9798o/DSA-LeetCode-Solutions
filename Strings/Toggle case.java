//Platform:GeeksForGeeks
//Approach:This code toggles the case of each character in a string. 
  //It iterates through every character and checks whether it is uppercase or lowercase. 
  //If a character is lowercase (a–z), it is converted to uppercase by subtracting 32 from its ASCII value.
  //If it is uppercase (A–Z), it is converted to lowercase by adding 32. 
  //The result is stored using a StringBuilder for efficient string manipulation, and finally returned as a string. 
  //The approach is simple and runs in O(n) time complexity.
//Time Complexity:O(n)
//Space Complexity:O(n)

//code-
class Solution {
    public String toggleCase(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - 32));
            }
            else if(ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            }
        }

        return sb.toString();
    }
}
