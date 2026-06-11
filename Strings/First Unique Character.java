//Platform:LeetCode
//Approach:First of all we find the frequency of each elements and then we traverse it through array. And if any element frequency is one then we return its index.
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code--
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i = 0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
