//Platform:LeetCode
//Approach: Build Pascal’s Triangle row by row where each element is the sum of the two elements above it, while first and last elements are always 1.
//TC: O(n²)
//SC: O(n²)
//Code--
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case: first row is always [1]
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // Each row has i+1 elements
            for (int j = 0; j <= i; j++) {
                // First and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Each inner element = sum of two elements above it
                    int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(value);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

}
