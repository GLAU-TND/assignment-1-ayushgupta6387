package node;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {

    public Node<E> getHead() {
        return head;
    }

    private Node<E> head = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public Node getNode(int index) {
        Node response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }


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
