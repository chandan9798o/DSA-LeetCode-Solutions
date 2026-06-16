//Platform:LeetCode
//Approach:First of all i break the String array words into single words using for loop and using for each loop i traverse each character of the string
//And try to check the character is equal to given character is not . If it is then add the index to the arraylist and return as output.
//Time Complexity:O(n * m)
//Space Complexity:O(k)

//Code
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            String w = words[i];
            for(char c : w.toCharArray()){
                if(c == x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
