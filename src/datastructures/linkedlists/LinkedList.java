package datastructures.linkedlists;

public class LinkedList {

    // the node class is a part of the linked list class
    // we put it inside so that we can have access to its fields
    private static class Node {
        private int value;
        private Node next;

        // constructor that always gives the node a value.
        public Node(int value) {
            this.value = value;
        }
    }

    // could call them head and tail but the java class refers to them
    // as first and last
    private Node first;
    private Node last;

    public LinkedList(Node first, Node last) {
        this.first = first;
        this.last = last;
    }

    /*
    method to add last node onto the list.
     */
    public void addLast(int item) {
        /*
        Step 1:
        This is how we first create a node object, and it should always
        store a value.

        var keyword here is used because the type of the node is specified on the
        end of the line already.
         */
        var node = new Node(item);

        /*
        Step 2: If LL is empty, set first and last nodes to point to new node,
        otherwise append node to the end of the list.

        So if the first(head) node is null, that means the list is empty because
        as soon as we add one, first is initialized.
         */

        if(first == null) {
            // setting first and last node to point to new node
            first = node;
            last = node;
        }
        else { // linking last node to this node using "next" keyword
            last.next = node;
            last = node;
        }
    }
}
