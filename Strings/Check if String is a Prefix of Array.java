//Platform:LeetCode
//Approach:I add  the given string array elements into stringBuilder and parallelely check it is equal to given string or not. If it is equal then return true immediately.
//and also check the size of appended stingbuilder elements is greater than given string lenegth. This line of code prevent to store next string array element and loop stops.
//Time Complexity:O(n)
//Space Complexity:O(n)
//code--

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word);
            if(sb.toString().equals(s)) return true;

            if(sb.length() > s.length()) return false;
        }
       return  false;
    }
}
