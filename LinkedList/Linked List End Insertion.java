//Platform:GeeksForGeeks
//Approach:First of all we check the given list is not empty. If it is we return its newNode value. If it is not empty then we shift the temp from head to the last node
//using while loop to insert at the end node. there we write temp.next = newNode that's it. and we return the head after shifting the temp to the head again.
//Time Complexity:O(n)
//Space Complexity:O(1)

//Code--
class Solution {
    public Node insertAtEnd(Node head, int x) {
       Node newNode = new Node(x);
       if(head == null){
           return newNode;
       }
       Node temp = head;
       while(temp.next != null){
           temp = temp.next;
       }
      temp.next = newNode;
      return head;
    }
}
