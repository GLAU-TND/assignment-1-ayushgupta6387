package adt;

import node.Node;

public interface LinkedListADT<E> {
    void insert(E data);

    void delete();

    void traverse();

    void swap(Node<E> first, Node<E> second, int previous);
}
