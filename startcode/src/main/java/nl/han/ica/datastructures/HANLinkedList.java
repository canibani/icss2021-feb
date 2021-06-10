package nl.han.ica.datastructures;


import java.util.LinkedList;

public class HANLinkedList<T> implements IHANLinkedList<T> {

    private Node<T> first = null;
    private int size = 0;

    @Override
    public void addFirst(T value) {
        if (first == null) {
            first = new Node<>(value);
        } else {
            Node<T> newNode = new Node<>(value);
            newNode.setNext(first);
            first = newNode;
        }
        size++;
    }

    @Override
    public void clear() {
        first = null;
        size = 0;
    }

    @Override
    public void insert(int index, T value) {
        if (index < 0 || index > getSize()) {
            // Error handling
            System.out.println("Can't insert at position " + index);
            return;
        }

        if (index == 0) {
            addFirst(value);
            return;
        }

        Node newNode = new Node(value);
        Node left = getNode(index--);
        Node right = left.getNext();

        newNode.setNext(right);
        left.setNext(newNode);

        size++;
    }

    @Override
    public void delete(int pos) {
        if (pos == 0) {
            removeFirst();
            return;
        }

        if (pos < 0 || pos > getSize()) {
            // Error handling
            System.out.println("Nothing was deleted.");
            return;
        }

        Node left = getNode(pos--);
        Node toDelete = left.getNext();

        left.setNext(toDelete.getNext());
    }

    @Override
    public T get(int pos) {
        return getNode(pos).getValue();
    }

    @Override
    public void removeFirst() {
        first = first.getNext();
    }

    @Override
    public T getFirst() {
        return first.getValue();
    }

    @Override
    public int getSize() {
        return size;
    }

    public Node<T> getNode(int pos) {
        Node<T> node = first;

        for (int i = 0; i < pos; i++) {
            node = first.getNext();
        }

        if (node == null) {
            throw new IndexOutOfBoundsException();
        }

        return node;
    }

    public Node<T> getLast () {
        return getNode(getSize() - 1);
    }

    @Override
    public void add(T value) {
        if (first == null) {
            addFirst(value);
            return;
        }
        Node last = getLast();
        last.setNext(new Node(value));
    }
}
