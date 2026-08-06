//Platform:GeeksForGeeks
//Approach:Using simple while loop traversal we try to find out the given key element in linkedList;
//Time Complexity:O(1)
//Space Compelxity:O(1)

//Code-
/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
       Boolean found = false;
       Node temp = head;
       while(temp != null){
           if(temp.data == key){
               found = true;
               break;
           }
           temp = temp.next;
       }
       return found;
    }
}
