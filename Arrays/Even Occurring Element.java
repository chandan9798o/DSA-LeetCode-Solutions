//Platform:GeeksForGeeks
//Approach:FIrst of all we make Map with LinkedHash map to maintain order and find frequenxy of each element in array.
//And second one we make dynamic array named list. After finding frequency of each elements we use for each loop of freuency item set in map.
//to identify the even occurence of element. If it contain we add that values key to dynamic array. 
//If the even occuring not found we return -1 to add to the list as output.
//Time Complexity:O(n)
//Space Complexity:O(k)

class Solution {
    public List<Integer> findEvenOccurrences(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 ==0){
                list.add(entry.getKey());
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        return list;
    }
}
