//Platform:GeeksForGeeks
//Approach:First of all we store the first character of string in a char data type variable. 
  // After that by conditional statement we check the first character is upper or lower and return output according to its result.
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code
class Main {
    public static void main(String args[]) {
        String s = "HeLLo";

        char ch = s.charAt(0);

        if(Character.isUpperCase(ch)) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
