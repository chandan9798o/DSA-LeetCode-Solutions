//Platform:GeeksForGeeks
//Approach:First i made two variables even and odd. After that i made an array of size 2 and assign a loop of size of given n and simply add even numbers
//alternatively and store in even variable. Similar for odd variable and store one by one in array. And return array as output.
//Time Compelxity:-O(n)
//Space Complexity:O(1)
//Code---
// User function Template for Java

class Solution {
    public int[] findSum(int n) {
        int[] arr = new int[2];
        int even = 0;
        int odd = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                even+=i;
            } else{
                odd+=i;
            }
        }
        arr[0] = odd;
        arr[1] = even;
        return arr;
        
    }
}
