//Platform:GeeksForGeeks
//Approach:First of all we find frequency of each character in given string and then we traverse to check the first non repeating character by using 
//again map function. If frequency of any character i equal to one then we return its key as outoput which is the result.
//Time Complexity:O(n)
//Space Comlexity:O(n)

//Code
class Solution {
    public int nonRepeatingChar(String s) {
       char c = ' ';
       Map<Character, Integer> map = new LinkedHashMap<>();
       for(char n : s.toCharArray()){
           map.put(n, map.getOrDefault(n, 0)+1);
       }
       for(Map.Entry<Character, Integer> entry : map.entrySet()){
           if(entry.getValue() == 1){
              return entry.getKey();
               break;
           }
       }
       return -1;
    }
}
