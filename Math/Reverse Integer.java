//Platform:LeetCode
//Approach:Convert the integer to a string and take its absolute value. 
//Store each digit in an array and reverse the array.
//Build the reversed number using StringBuilder, then convert it back to an integer using parseInt. 
//Use a try-catch block to handle overflow, and if the original number was negative, return the negative of the reversed number.
//Time Complexity  : O(n)
//Space Complexity : O(n)
//Code-
class Solution {
    public int reverse(int x) {

        boolean isNegative = x < 0;   

        String s = String.valueOf(Math.abs(x));
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        StringBuilder digit = new StringBuilder();
        for (int d : arr) {
            digit.append(d);
        }

        try {
            int result = Integer.parseInt(digit.toString());
            return isNegative ? -result : result; 
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
