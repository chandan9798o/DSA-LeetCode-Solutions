//Platform:GeeksForGeeks
//Approach:First of all we use hash map to count the freuecny of each string. After finding frequecny of each string we construct a String variable result and int variable
// maxFreq  which contain intital value zero to store the output result. Then using for each loop we traverse the each string and check whether current string 
//frequency is greater then maxFreq or not.
//If it is not then update it and store that max frequency string in result variable and return as output.
//Time Complexity:O(n)
//Space Complexity:O(n)


//Code--
class Solution {
    public String maximumFrequency(String s) {
        Map<String, Integer> freq = new HashMap<>();
        for(String w : s.split(" ")){
            freq.put(w, freq.getOrDefault(w, 0)+1);
        }
        String result = " ";
        int maxFrq = 0;
        for(String w : s.split(" ")){
            if(freq.get(w) > maxFrq){
                maxFrq = freq.get(w);
                result = w;
            }
        }
        return result + " " + maxFrq;
    }
}
