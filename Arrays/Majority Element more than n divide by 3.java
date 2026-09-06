//Platform:GeeksForGeeks
//Approach-Using HashMap to count frequency - Using Map entry set for unique elements frequencie -> store in ArrayList whose freqency is greater than arr.lenegt/3
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code-
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 3) {
                ans.add(entry.getKey());
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
