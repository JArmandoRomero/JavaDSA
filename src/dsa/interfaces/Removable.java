package dsa.interfaces;

import java.util.NoSuchElementException;

/**
 * Supports removing elements.
 */
public interface Removable<T> {
    T removeFirst() throws NoSuchElementException;
}
