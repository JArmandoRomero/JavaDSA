package dsa.circular;

import java.util.NoSuchElementException;

import dsa.base.AbstractLinkedList;
import dsa.base.Node;
import dsa.interfaces.Accessible;
import dsa.interfaces.Addable;
import dsa.interfaces.Removable;

public class CircularLinkedList<T> extends AbstractLinkedList<T> implements Addable<T>, Accessible<T>, Removable<T> {

    @Override
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            tail = newNode;
            head = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;

    }

    public void rotate() {
        if (!isEmpty()) {
            head = head.next;
            tail = tail.next;
        }
    }

    @Override
    public T first() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.value;
    }

    @Override
    public T last() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return tail.value;
    }

    @Override
    public T removeFirst() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T value = head.value;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
        return value;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";

        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;

        for (int i = 0; i < size; i++) {
            sb.append(current.value);
            if (i < size - 1)
                sb.append(", ");
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }

}
