package linkedlist;

public class MyLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node newNode = new Node(value);
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            Node current = previous.next;
            previous.next = newNode;
            newNode.next = current;
            size++;
        }
    }

    public Integer removeFirst() {
        if (head == null) {
            return null;
        }
        int value = head.value;
        if (head == tail) {
            head = tail = null;
        } else {
            Node second = head.next;
            head.next = null;
            head = second;
        }
        size--;
        return value;
    }

    public Integer removeLast() {
        if (head == null) {
            return null;
        }
        int value = tail.value;
        if (head == tail) {
            head = tail = null;
        } else {
            Node previous = head;
            while (previous.next != tail) {
                previous = previous.next;
            }
            tail = previous;
            tail.next = null;
        }
        size--;
        return value;
    }

    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            Node current = previous.next;
            previous.next = current.next;
            current.next = null;
            size--;
            return current.value;
        }
    }

    public Integer getFirst() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    public Integer getLast() {
        if (tail == null) {
            return null;
        }
        return tail.value;
    }

    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = value;
    }

    public int indexOf(int value) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.value == value) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        Node current = head;
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if (current.value == value) {
                lastIndex = i;
            }
            current = current.next;
        }
        return lastIndex;
    }
}
