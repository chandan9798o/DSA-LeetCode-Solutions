//Platform:GeeksForGeeks
//Approach:Convert the input string into a character array so that characters can be swapped easily.
//Start recursion from index 0.
//At each recursive call:
//Consider every character from index to n-1.
//Use a HashSet<Character> to ensure that the same character is not chosen more than once at the current recursion level (this avoids duplicate permutations).
//Swap the current character with the character at index.
//Recursively generate permutations for the remaining positions (index + 1).
//Backtrack by swapping the characters again to restore the original array.
//When index == arr.length, a complete permutation has been formed. Convert the character array to a string and store it in the answer list.
//Finally, sort the list of permutations and return it.

//Time Complexity:O(n × n!)
//Space Complexity:O(n × n!)

//Code-
import java.util.*;

class Solution {

    public ArrayList<String> findPermutation(String s) {

        ArrayList<String> ans = new ArrayList<>();
        char[] arr = s.toCharArray();

        permute(arr, 0, ans);

        Collections.sort(ans);
        return ans;
    }

    private void permute(char[] arr, int index, ArrayList<String> ans) {

        if (index == arr.length) {
            ans.add(new String(arr));
            return;
        }

        HashSet<Character> used = new HashSet<>();

        for (int i = index; i < arr.length; i++) {

            if (used.contains(arr[i]))
                continue;

            used.add(arr[i]);

            swap(arr, index, i);

            permute(arr, index + 1, ans);

            swap(arr, index, i);
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

