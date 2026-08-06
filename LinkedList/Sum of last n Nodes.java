//Platform:geeksForGeeks
//Appraoch:First of all we count the total number of nodes present in given linkedlist using while loop.
        // After that we try to know how many nodes we need to skip to add remaining elements in list so we find by (skip = cound -n) using same while loop
        // Then after removing temp to desired position we find the sum of list to n nodes and then return the sum;
//Time Complexity:O(n)
//Space Complexity:O(1)

//Code-
class Solution {
    public int sumofNodes(Node head, int n) {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int skip = count - n;

        if (skip < 0) {
            skip = 0;
        }
        temp = head;

        while (skip > 0) {
            temp = temp.next;
            skip--;
        }

        int sum = 0;

        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }

        return sum;
    }
}
