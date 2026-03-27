package dsa.interfaces;

/**
 * Supports adding elements.
 */
public interface Addable<T> {
    void addFirst(T element);
    void addLast(T element);
}
