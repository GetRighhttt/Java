package datastructures.anotherlinkedlist;

/**
 * Here we will demonstrate once again how to organize a LinkedList.
 */
public class LinkedListExample {

    /*
    Step 1: Create a Node class with a value and reference variable. Add constructor
    so when the class is created, the constructor will be called.
     */

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    /*
    Step 2: Create global head and tail reference variables.
     */
    Node head = null;
    Node tail = null;


    /*
    Step 3: Create a method to add a Node at the end of the list, and pass in
    a value making it generic.
     */
    public void addNodeAtEnd(int val) {
        // create a Node object to be used.
        Node newNode = new Node(val);

        /*
        Step 4:
        Base case: if list is empty(head and tail == null), point them to the
        new node.
         */
        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
        /*
        Step 5: Let's assume there are already nodes in the list.
         */
            tail.next = newNode; // make tail pointer point to next node.
            newNode.next = null; // make next pointer reference point to null
            tail = newNode; // assign tail to newNode.
        }
    }

    /*
    Step 6: Now we will look at how to print values in a LinkedList.
     */
    public void printValues() {
        // assign a current value to head; we don't change head pointer
        Node current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    /*
    Step 7: To add node at the beginning of the list, we check if its empty,
    and then set head to newNode, and current to next node.
     */
    public void addNodeAtBeginning(int val) {
        Node newNode = new Node(val);
        Node current = head;

        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            head = newNode;
            newNode.next = current;
        }
    }

    public void atInTheMiddle(int val) {

    }


    /*
    An example of checking to see if a value is in a Node.
     */
    public boolean doesValueExist(int value) {
        Node current = head;
        while (current != null) {
            if (current.val == value) {
                return true;
            }
            current = current.next;
        }
        //if we end up reaching here ,
        // it means there is no node in the linked-list with the given value
        return false;
    }

    public static void main(String[] args) {

        // Create object of the class and use that object to call methods.
        LinkedListExample l = new LinkedListExample();
        l.addNodeAtEnd(22);
        l.addNodeAtEnd(23);
        l.addNodeAtEnd(24);
        l.addNodeAtEnd(25);

        // add node at the beginning
        l.addNodeAtBeginning(21);

        // print values
        l.printValues();

        // check if a value exist
        System.out.println(l.doesValueExist(30));
    }
}
