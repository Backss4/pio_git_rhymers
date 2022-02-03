package edu.kis.vh.nursery.int_counting_structures;

/**
 * Double linked list.
 *
 * @author kowallus
 */
public class IntLinkedList {
    private static class Node {

        private final int value;
        private Node prev, next;

        public Node(int i) {
            value = i;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }
    }

    protected static final int FAILURE_VALUE = -1;
    private Node last;

    /**
     * Pushes value on to the top of the list.
     * @param i value to be inserted
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Returns true if this list contains no elements.
     * @return True if empty, false otherwise
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Returns true if this list is full.
     * @return False
     */
    public boolean isFull() {
        return false;
    }

    //TODO: użycie wyjątków zamiast -1
    /**
     * Returns top node value if list is not empty.
     * @return -1 if empty, last added value otherwise
     */
    public int top() {
        if (isEmpty())
            return FAILURE_VALUE;
        return last.getValue();
    }

    //TODO: użycie wyjątków zamiast -1
    /**
     * Removes the node at the top of list and returns that object value.
     * @return -1 if empty, last added value otherwise
     */
    public int pop() {
        if (isEmpty())
            return FAILURE_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
