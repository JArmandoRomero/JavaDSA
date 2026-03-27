package dsa.base;

import dsa.interfaces.ListBase;

/**
 * Abstract base class for linked list implementations.
 * Provides shared fields and basic functionality.
 *
 * @param <T> the type of elements stored in the list
 */
public abstract class AbstractLinkedList<T> implements ListBase<T> {

    protected Node<T> head;
    protected Node<T> tail;
    protected int size;

    /**
     * Returns the number of elements in the list.
     *
     * @return the size of the list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns true if the list is empty, false otherwise.
     *
     * @return true if empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}