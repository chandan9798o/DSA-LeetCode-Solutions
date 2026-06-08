//Platofrm:GeeksForGeeks
//Approach:we create variable count with value zero. After that we use for each loop
//array to identify given value. If we find given value in each loop we increase the count one by one.
//And in last we return the count as frequency.
//Time Compelxity:O(n);
//Space Complexity:O(1)
class Solution {
    int findFrequency(int arr[], int x) {
        int count = 0;
        for(int d : arr){
            if(d == x){
                count++;
            }
        }
        return count;
        
    }
}
