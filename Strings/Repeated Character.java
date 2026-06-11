//Platform:GeeksForGeeks
//Approach:Here we will try to know the frequency of each element and then from each loop we try to know that it anyone whose frequency is more than one which indicate its repeating 
feature of that element. and then we return its value as output.
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code
class Solution {
    char firstRep(String S) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c: S.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char ch : S.toCharArray()){
            if(map.get(ch) > 1){
                return ch;
            }
        }
        return '#';
    }
}
