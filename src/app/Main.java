package app;

import dsa.circular.CircularLinkedList;
import dsa.doubly.DoublyLinkedList;
import dsa.singly.SinglyLinkedList;

/**
 * Main entry point class
 * 
 * @author Jarrod Romero
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // 🔹 Test empty list
        System.out.println("Initial list: " + list);
        System.out.println("Is empty: " + list.isEmpty());

        // 🔹 Add elements
        list.addFirst(10);
        System.out.println("\nAfter addFirst(10): " + list);

        list.addFirst(5);
        System.out.println("After addFirst(5): " + list);

        list.addLast(20);
        System.out.println("After addLast(20): " + list);

        list.addLast(30);
        System.out.println("After addLast(30): " + list);

        // 🔹 Access first and last
        System.out.println("\nFirst element: " + list.first());
        System.out.println("Last element: " + list.last());

        // 🔹 Remove elements
        System.out.println("\nRemoving first...");
        System.out.println("Removed: " + list.removeFirst());
        System.out.println("List now: " + list);

        System.out.println("\nRemoving last...");
        System.out.println("Removed: " + list.removeLast());
        System.out.println("List now: " + list);

        // 🔹 Remove all elements
        System.out.println("\nRemoving all elements...");
        while (!list.isEmpty()) {
            System.out.println("Removed: " + list.removeFirst());
            System.out.println("List: " + list);
        }

        // 🔹 Edge case: remove from empty
        try {
            list.removeFirst();
        } catch (Exception e) {
            System.out.println("\nExpected exception (removeFirst on empty): " + e);
        }

        try {
            list.removeLast();
        } catch (Exception e) {
            System.out.println("Expected exception (removeLast on empty): " + e);
        }
    }

}