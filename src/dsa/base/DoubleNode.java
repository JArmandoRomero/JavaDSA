package dsa.base;

/**
 * A node used in a doubly linked list.
 * 
 * <p>Each node stores a value and maintains references to both the
 * next and previous nodes in the list, enabling bidirectional traversal.</p>
 *
 * @param <T> the type of element stored in this node
 */
public class DoubleNode<T> {

    /** The value stored in this node */
    private T value;

    /** Reference to the next node in the list */
    public DoubleNode<T> next;

    /** Reference to the previous node in the list */
    public DoubleNode<T> prev;

    /**
     * Constructs a node with the specified value.
     *
     * @param value the value to store in this node
     */
    public DoubleNode(T value) {
        this.value = value;
    }

    /**
     * Constructs a sentinel (dummy) node with no value.
     *
     * <p>This constructor is typically used for head and tail sentinel nodes
     * in a doubly linked list implementation.</p>
     */
    public DoubleNode() {
        this.value = null;
    }

    /**
     * Returns the value stored in this node.
     *
     * @return the node's value
     */
    public T getValue() {
        return value;
    }

    /**
     * Updates the value stored in this node.
     *
     * @param value the new value to set
     */
    public void setValue(T value) {
        this.value = value;
    }
}