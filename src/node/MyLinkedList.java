package node;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {

    public Node<E> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    private Node<E> head = null;
    private int size = 0;

    @Override
    public void insert(E data) {

    }

    @Override
    public void delete() {

    }

    @Override
    public void traverse() {

    }

    @Override
    public void swap(Node<E> first, Node<E> second, int previous) {

    }
}
