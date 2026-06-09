//Platform:GeeksForGeeks
//Approach:We use Map function to count the frequency of each element of the given array. And after that we try to know the odd frequency of each 
//entry value using for each loop of map function. If it contain the element with odd occurence we return it as a output.
//Time Complexity:O(n)
//Space Compelxity:O(n)
class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
       Map<Integer, Integer> map = new HashMap<>();
       int val = 0;
       for(int n : arr){
           map.put(n, map.getOrDefault(n, 0)+1);
       }
       for(Map.Entry<Integer, Integer> entry : map.entrySet()){
           if(entry.getValue() % 2 != 0){
               return entry.getKey();
           }
       }
       return -1;
    }
}
