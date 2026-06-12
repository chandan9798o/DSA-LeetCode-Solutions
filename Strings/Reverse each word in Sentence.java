//Platform:GeeksForGeeks
//Approach:Here we break given sentence into String array  elements and then we traverse each word in array with char array to perfome while operation to reverse
//each character of each string in array using two pointer left and right. After that we convert each character into array string and in last we join all the 
//Array string elements into single string sentence and return it as output.
//Time Complexity:O(n)
//Space Complexity:O(n)

//code:-
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        for(int i=0; i<arr.length; i++){
            char[] ch = arr[i].toCharArray();
            int left = 0; 
            int right = ch.length-1;
            while(left<right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            arr[i] = new String(ch);
        }
        String result = String.join(" ", arr);
        return result;
        
    }
}
