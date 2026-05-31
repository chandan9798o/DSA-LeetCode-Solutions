//Platform:GeeksForGeeks
//Approach:First of all we check whether the length of string is one. If one then we return yes.
//After that by using loop we check the difference between character using math absolute funtion.
//and if it's difference is not equal to one we return No otherwise yes.
//Time Complexity:O(n)
//Space Complexity:O(1)
class Solution {
    String isGoodString(String s) {
        int n = s.length();
        if(n == 1){
            return "YES";
        }
        for(int i=0; i<n-1; i++){
            int diff = Math.abs(s.charAt(i) - s.charAt(i+1));
            if(Math.min(diff, 26-diff)!=1){
                return "NO";
            }
        }
        return "YES";
    }
}
