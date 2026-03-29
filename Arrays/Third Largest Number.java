//Platform:GeeksForGeeks
//Approach: We take three vairable first, second, and third with minumum integer value and then we use two pointer with three condition and return the their largest value.
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    int thirdLargest(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } 
            else if (num > second) {
                third = second;
                second = num;
            } 
            else if (num > third) {
                third = num;
            }
        }

        return third;
    }
}
