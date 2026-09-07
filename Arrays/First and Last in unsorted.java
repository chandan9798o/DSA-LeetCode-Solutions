//Platform:GeeksForGeeks
//Approach: Linear Search and sotore index in List
//Time Complexity: O(n)
//Space Complexity:O(n)

//Code--
class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0; i<arr.length; i++){
           if(arr[i] == key){
               list.add(i);
               break;
           }
       }
       for(int i = arr.length-1; i>=0; i--){
           if(arr[i] == key){
               list.add(i);
               break;
           }
       }
       if(list.size()==0){
           list.add(-1);
           list.add(-1);
       }
       return list;
        
        
    }
};
