//Platform:GeeksForGeeks
//Approach:First of all we count the number of vowels and consonants and then 
//we check the numbers of them by using conditional format tp print desired output.
//Time Complexity:O(n)
//Space Complexity:O(1)
class Solution {
    static void checkString(String s) {
        int v = 0;
        int c = 0;

        String vl = "aeiou";
        for(int i=0; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(vl.indexOf(ch) != -1){
                v++;
            } else{
                c++;
            }
        }
        if(v>c){
            System.out.println("Yes");
        } else if (v<c){
            System.out.println("No");
        } else{
            System.out.println("Same");
        }
        
    }
}
