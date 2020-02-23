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

    public void addFirst(E data) {
        head = new Node(head, data);
        size++;
    }

    private void add(E data, int index) {
        Node temp = getNode(index - 1);
        if (head == null) {
            addFirst(data);
        } else {
            Node newNode = temp.getNext();
            temp.setNext(new Node(newNode, data));
        }
        size++;
    }

    public void insert(E data, int index) {
        add(data, index);
    }


    @Override
    public void insert(E data) {
        if (head == null) {
            addFirst(data);
        } else {
            add(data, size);
        }
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            Node temp = getNode(index - 1);
            Node nextNode = getNode(index);
            temp.setNext(nextNode.getNext());
        }
        size--;
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
