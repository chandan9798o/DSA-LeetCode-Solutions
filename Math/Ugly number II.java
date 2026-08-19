//Platfrom : GeeksForGeeks
//Approach:Brute Force Approach
//Time Complexity:O(logn)
//Space Complexity:O(1)

//Code--
class Solution {
    public static int uglyNumber(int n) {

        int num = 1;
        int count = 0;

        while (count < n) {

            if (isUgly(num)) {
                count++;
            }

            if (count == n) {
                return num;
            }

            num++;
        }

        return -1;
    }

    public static boolean isUgly(int num) {

        while (num % 2 == 0) {
            num /= 2;
        }

        while (num % 3 == 0) {
            num /= 3;
        }

        while (num % 5 == 0) {
            num /= 5;
        }

        return num == 1;
    }
}
