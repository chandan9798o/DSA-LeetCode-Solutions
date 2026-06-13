//Platform:GeeksForGeeks
//Approach:First of all i breaks the character of given string into array elemetns and then i sort using Arrays sort function. After that i use two pointer left and right along with while loop
// to reverse the ascending order of elemnts again. After that operation i converts it into again string and return it as output.
//Time Complexity:O(n logn)
//Space Complexity:O(n)

//code-
// User function Template for Java
class Solution {
    String ReverseSort(String s) {
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    int left = 0;
    int right = arr.length-1;
    while(left < right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    String result = new String(arr);
    return result;
        
    }
}
