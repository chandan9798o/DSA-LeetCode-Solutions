//Platform:geeksForGeeks
//Approach:We just make newNode of given value to and then connect it to the head and return the head value;
//Time Complexity:O(1)
//Space Complexity:O(1)

//Code-
class Solution {
    public Node insertAtFront(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        return head;
       
    }
}
