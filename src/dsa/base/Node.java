package dsa.base;

/**
 * Node for linked lists.
 */
public class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value) {
        this.value = value;
    }
    
}