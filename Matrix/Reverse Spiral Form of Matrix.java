//Platform:GeeksForGeeks
//Approach: In this problem we first store all the spiral  matrix element into the array list using while loop and using left, right, top and bottom pointer
//After that we use Collection.reverse() method to reverse the arraylist element and return it as output.
//Time Complexity:O(m * n)
//Space Complexity:O(m *n)

//Code
class Solution {
    public List<Integer> reverseSpiral(int[][] mat) {
       
       ArrayList<Integer> list = new ArrayList<>();

        int m = mat.length;
        int n = mat[0].length;

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {

            // Top Row
            for (int i = left; i <= right; i++) {
                list.add(mat[top][i]);
            }
            top++;

            // Right Column
            for (int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);
            }
            right--;

            // Bottom Row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }

            // Left Column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        Collections.reverse(list);
        return list;

        
    }
}
