//Platform:LeetCode
//Approach:First of all i break the given string into character array and then using for loop i traverse the char elements alternatively and add 
//the alternate character and store it separaterly. Again i traverse and add sum of second alternative character and store it separaterly. And return output true if 
//both alternative sum are eaqual to each other.
//Time Complexity:O(n)
//Space Complexity:O(n)

//code--
class Solution {
    public boolean isBalanced(String num) {
        char[] ch = num.toCharArray();
        int alt = 0;
        int no = 0;
        for(int i=0; i<ch.length; i+=2){
           alt+=ch[i] - '0';
        }
        for(int i=1; i<ch.length; i+=2){
           no+=ch[i] - '0';
        }
        if(alt != no){
            return false;
        }
        return true;
    }
}
