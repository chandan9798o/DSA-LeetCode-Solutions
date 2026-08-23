//Platfrom:GeeksForGeeks
//Approach:linear search
//Time Complexity:O(n)
//Space Complexity:O(1)

//Code-
class Solution {
    int missingNumber(int arr[]) {

        
        if(arr[0] != 1) {
            return 1;
        }

        
        for(int i = 1; i < arr.length; i++) {

            if(arr[i] - arr[i - 1] != 1) {
                return arr[i - 1] + 1;
            }
        }

        
        return arr.length + 1;
    }
}
