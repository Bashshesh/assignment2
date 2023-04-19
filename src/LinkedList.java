import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private class Node<T> {
        private T element;
        private Node<T> next;
        public Node(T element) {
            this.element = element;
        }
    }
    int size;
    private Node<T> head;
    private Node<T> tail;

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T removedElement;
        if (index == 0) {
            removedElement = head.element;
            head = head.next;
            if (size == 1) {
                tail = null;
            }
        } else {
            Node<T> previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            removedElement = previous.next.element;
            previous.next = previous.next.next;
            if (index == size - 1) {
                tail = previous;
            }
        }
        size--;
        return removedElement;
    }

    public int getSize() {
        return size;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;
            public boolean hasNext() {
                return current != null;
            }
            public T next() {
                T element = current.element;
                current = current.next;
                return element;
            }
        };
    }

}
