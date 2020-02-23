package node;

public class Node<E> {
    private Node<E> next;
    private E data;

    public Node(Node<E> next, E data) {
        this.next = next;
        this.data = data;
    }
}
