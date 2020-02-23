package adt;

import node.MyLinkedList;

public interface LinkedListADT<E> {
    void insert(E data);

    void delete();

    void traverse();

    MyLinkedList<E> sort(MyLinkedList<E> person);
}
