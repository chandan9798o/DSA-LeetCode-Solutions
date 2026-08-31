//Platform:GeeksForGeeks
//Approach:Right to left traversal using carry to add elements
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code--
class Solution {
    public ArrayList<Integer> addArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i >= 0){
                sum += arr1[i];
                i--;
            }
            if(j>=0){
                sum+=arr2[j];
                j--;
            }
            list.add(sum%10);
            carry = sum/10;
        }
        
        if(carry > 0){
            list.add(carry);
        }
        Collections.reverse(list);
        return list;
        
    }
}
