//Platform:LeetCode
//Approach:HashSet + Sorting
//Time Complexity: O(n + d log d)
//Space Complexity: O(d)

//Code--
import java.util.*;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int m : nums) {
            set.add(m);
        }

        int[] b = new int[set.size()];
        int j = 0;

        for (int m : set) {
            b[j++] = m;
        }

        Arrays.sort(b);

        ArrayList<Integer> list = new ArrayList<>();

        int right = b.length - 1;

        while (k > 0 && right >= 0) {
            list.add(b[right]);
            right--;
            k--;
        }

        int[] arr = new int[list.size()];
        int i = 0;

        for (int m : list) {
            arr[i++] = m;
        }

        return arr;
    }
}
