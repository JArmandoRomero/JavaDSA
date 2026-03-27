package dsa.doubly;

import dsa.interfaces.*;

import java.util.NoSuchElementException;

import dsa.base.AbstractDoubleLinkedList;
import dsa.base.DoubleNode;

public class DoublyLinkedList<T> extends AbstractDoubleLinkedList<T> implements Addable<T>, Accessible<T>, Removable<T> {

    public DoublyLinkedList() {
        header = new DoubleNode<>();
        trailer = new DoubleNode<>();
        header.next = trailer;
        
        trailer.prev = header;

        size = 0;
    }

    @Override
    public T removeFirst() throws NoSuchElementException {
       if(isEmpty()) {
           throw new NoSuchElementException();
       }
        DoubleNode<T> firstNode = header.next;
        T value = firstNode.getValue();

        header.next = firstNode.next;
        firstNode.next.prev = header;

        size--;
        return value;
    }

    public T removeLast() throws NoSuchElementException {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        DoubleNode<T> lastNode = trailer.prev;
        T value = lastNode.getValue();

        trailer.prev = lastNode.prev;
        lastNode.prev.next = trailer;

        size--;
        return value;
    }

    @Override
    public T first() throws NoSuchElementException {
      if(isEmpty()) {
          throw new NoSuchElementException();
      }
        return header.next.getValue();
    }

    @Override
    public T last() throws NoSuchElementException {
       if(isEmpty()) {
           throw new NoSuchElementException();
       }
        return trailer.prev.getValue();
    }

    @Override
    public void addFirst(T element) {
        DoubleNode<T> newNode = new DoubleNode<>(element);

        newNode.prev = header;
        newNode.next = header.next;
        header.next.prev = newNode;
        header.next = newNode;
        size++;
    }

    @Override
    public void addLast(T element) {
        DoubleNode<T> newNode = new DoubleNode<>(element);

        newNode.next = trailer;
        newNode.prev = trailer.prev;
        trailer.prev.next = newNode;
        trailer.prev = newNode;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DoublyLinkedList: [");
        DoubleNode<T> current = header.next;
        while (current != trailer) {
            sb.append(current.getValue());
            if (current.next != trailer) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
