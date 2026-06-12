//Platform:LeetCode
//Approach:I break the sentence into array elements and then we traverse each word through for loop and each word store in particular variable.
//After that we calculate position of the word in last index by ASCII mechanism to convert char to integer. and find acutal value and put in another
//array and return its into result after sorting.
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code:-
class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            String word = arr[i];
            int pos = word.charAt(word.length()-1) - '0';
            String actualWord = word.substring(0, word.length()-1);
            res[pos - 1] = actualWord;
        }
        return String.join(" ", res);
    }
}
