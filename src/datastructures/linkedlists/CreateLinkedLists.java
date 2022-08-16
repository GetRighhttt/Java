package datastructures.linkedlists;

import java.util.Arrays;
import java.util.LinkedList;

public class CreateLinkedLists {
    public static void main(String[] args) {
        /*
        Now we are going to explore linked list.

        We use linked list to store a list of objects in sequence.

        Linked List are different from arrays because they can grow and shrink
        automatically unlike arrays.

        Unfortunately, it's harder to reach elements in the middle of the list
        whereas in Arrays, we didn't have that issue.

        LL consists of nodes that hold two pieces of data: value, and address in
        memory.

        In singular linked lists, each node points to each other. Head and tails.

        Lookup By Value = O(n)
        Lookup By Index = O(n)
        Insert at the end = O(1)
        Insert at the beginning = O(1)
        Insert at the middle = O(n)
        Delete at the beginning = O(1)
        Delete at the end = O(n)
        Delete at the middle = O(n)
         */

        // now we will declare linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // linked list and the rest of the collections share almost all the same
        // built-in functions that we can use to manipulate the list.
        linkedList.add(10);
        linkedList.add(60);
        linkedList.add(300);
        linkedList.add(30);
        linkedList.add(100);

        // adds at the end of the list.
        linkedList.addLast(240);

        // adds at the beginning of the list.
        linkedList.addFirst(90);

        // can see if the list contains anything.. returns a boolean
        System.out.println(linkedList.contains(10));

        // will return the number of items in the list
        System.out.println(linkedList.size());

        // toArray() method converts this list to an array also.
        Object[] arrayObject = linkedList.toArray();
        System.out.println(Arrays.toString(arrayObject));
    }

    /*
    Output:

    true
    7
    [90, 10, 60, 300, 30, 100, 240]
     */
}
