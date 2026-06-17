//Platform:GeeksForGeeks
//Approach:Here we make dynamic array list to store the counting number of character of given sentence. Then we break the given sentence  word into string array.
//Then traverse words character using for loop and store each word in a string variable and add length of each word to the list and return list as output.
//Time Complexity:O(n)
//Space Complexity:O(n)


//code-
class Solution {
    ArrayList<Integer> countChars(String s) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        String[] a = s.split(" ");
        for(int i=0; i<a.length; i++){
            String w = a[i];
            list.add(w.length());
        }
        return list;
    }
}
