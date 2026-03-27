package dsa.base;

import dsa.interfaces.ListBase;

public class AbstractDoubleLinkedList<T> implements ListBase<T> {
    
    protected DoubleNode<T> header;
    protected DoubleNode<T> trailer;

    protected int size;

    

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
