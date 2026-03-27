package dsa.interfaces;

import java.util.NoSuchElementException;

/**
 * Supports accessing elements.
 */
public interface Accessible<T> {
    T first() throws NoSuchElementException;
    T last() throws NoSuchElementException;
}
