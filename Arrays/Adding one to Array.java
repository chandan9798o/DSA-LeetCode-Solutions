//Platform:GeeksForGeeks
//Approach = Right-to-left traversal + Carry
//TC = O(n) ✅
//SC = O(n) ✅
//Code--
class Solution {
    Vector<Integer> addOne(int[] arr) {
       Vector<Integer> list = new Vector<>();
       int i = arr.length-1;
       int carry = 1;
       while(i >= 0){
           int sum = arr[i] + carry;
           list.add(sum % 10);
           carry = sum/10;
           i--;
       }
       if(carry > 0){
           list.add(carry);
       }
       Collections.reverse(list);
       return list;
    }
}
