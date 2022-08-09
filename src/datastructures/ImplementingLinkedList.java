package datastructures;

public class ImplementingLinkedList {

    public static void main(String[] args) {

        /*
        A linked list is one of the linear datastructures that
         is more flexible than working with arrays however does
         come with a few limitations.

         Linked list are considered to be one of the many dynamic datastructures.

         They provide easy insertion and deletion, and efficient memory allocation,
         however do not allow for random access.
         */


    }

}

/*
Here is a basic example of a linked list.

In this implementation, we access the linked list through the node head of the
Linked List.
 */
class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    // method to add to the tail fof the linked list.
    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
}

