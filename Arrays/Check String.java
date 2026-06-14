//Platform:GeeksForGeeks
//Approach:In this problem i have to check whether the string contain same character or not. For this i store the first character of the string 
//into a char variable to compare all the remaining character using for each loop. If it contain same character i return true otherwise false.
//Time Complexity:O(n)
//Space Complexity:O(1)


//Code-
// User function Template for Java

class Sol {
    Boolean check(String s) {
        char first = s.charAt(0);
        for(char ch : s.toCharArray()){
            if(ch != first){
                return false;
            }
        }
        return true;
        
    }
}
