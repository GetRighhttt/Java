package datastructures.linkedlists;

public class Main {
    public static void main(String[] args) {
        /*
        Here we are going to work with a Linked List class that we
        created on our own using all the methods we created.

        First we work with the addLast(), addFirst(), and indexOf() methods.
         */

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(60);
        list.addLast(30);
        list.addLast(90);
        list.addFirst(45);
        list.addFirst(55);
        list.addFirst(78);
        System.out.println(list.indexOf(90)); // returns 6
        System.out.println(list.indexOf(60)); // returns 4

        /*
        When creating your own LinkedList class, you can only use methods that
        you have created in the LinkedList class that you create.

        So at this moment, we only have those three methods before we move on...
         */

        // checking to see if the list contains these numbers...
        System.out.println(list.contains(78));
        System.out.println(list.contains(30));
        System.out.println(list.contains(10));

        // Now we are finally going to check our delete methods
        list.deleteFirst();
        list.deleteLast();
    }
}
