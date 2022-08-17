package datastructures.linkedlists;

public class LinkedList {

    // could call them head and tail but the java class refers to them
    // as first and last
    private Node first;
    private Node last;

    // empty constructor
    public LinkedList() {
    }

    // non-empty constructor
    public LinkedList(Node first, Node last) {
        this.first = first;
        this.last = last;
    }

    /**
     * Method to add last node onto the list.
     * <p>
     * We will create each method needed to deploy a personal linked list.
     */
    public void addLast(int item) {
        /*
        Step 1:
        This is how we first create a node object, and it should always
        store a value.
         */
        var node = new Node(item);

        /*
        Step 2: If LL is empty, set first and last nodes to point to new node,
        otherwise append node to the end of the list.

        So if the first(head) node is null, that means the list is empty because
        as soon as we add one, first is initialized.
         */

        if (isListEmpty()) {
            // setting first and last node to point to new node
            first = node;
            last = node;
        } else { // linking last node to this node using "next" keyword
            last.next = node;
            last = node;
        }
    }

    /**
     * Now we are going to create the addFirst method.
     */
    public void addFirst(int item) {
        Node node = new Node(item);

        // if entire list is empty, set first and last to new node.
        if (isListEmpty()) {
            first = node;
            last = node;
        } else { // want new node to point to the first node
            node.next = first;
            first = node;
        }
    }

    /**
     * Next, we are going to create the indexOf() method.
     */
    public int indexOf(int item) {
        /*
        To find the index, we need a node to hold the current index, and a node to
        hold the index of the elements in general.
         */
        int index = 0;
        var current = first;

        while (current != null) {
            /*
            While current is not empty, if the current value is equal to the
            item we are on, return that index.

            Else, current = the next node, and increment its index.
             */
            if (current.value == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    /**
     * Now we are going to create the contains() method.
     * <p>
     * An index can never be -1. so we return true if the
     * index isn't negative.
     */
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    /**
     * Now we are going to create the deleteFirst() method.
     * <p>
     * Because of how LL work, in order for us to delete a node, we need
     * a variable pointing to both the first node and the second node.
     */
    public void deleteFirst() {
        // check if list is not empty.
        if (isNotEmpty()) {


            // when the list only has one item
            if (first == last) {
                first = last = null;
                return;
            }

            // first we set second to = the next node after first
            var second = first.next;

            // then we set the first node to equal null to remove the element
            first.next = null;

            // then we set first to equal that second node
            first = second;
        }
    }

    /**
     * Now we are going to create the deleteLast() method.
     */
    public void deleteLast() {
        // when the list only has one item
        if (first == last) {
            first = last = null;
            return;
        }

        if (isNotEmpty()) {

            // first we need to get the previous node
            var previous = getPreviousNode(last);
            last = previous;
            last.next = null;
        }
    }

    // can use a method to see if the list is empty
    private boolean isListEmpty() {
        return first == null;
    }

    // can use a method to see if the list is not empty
    private boolean isNotEmpty() {
        return first != null;
    }

    private Node getPreviousNode(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

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
}
