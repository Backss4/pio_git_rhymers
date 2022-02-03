package edu.kis.vh.nursery.int_counting_structures;

public class IntLinkedListAdapter implements IIntCoutingStructure {
    private final IntLinkedList list;
    private int total = 0;

    public IntLinkedListAdapter(IntLinkedList list) {
        this.list = list;
    }

    public void countIn(int in) {
        list.push(in);
        total++;
    }

    public boolean callCheck() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.isFull();
    }

    public int peekaboo() {
        return list.top();
    }

    public int countOut() {
        if(list.isEmpty())
            return FAILURE_VALUE;
        total--;
        return list.pop();
    }

    public int getTotal() {
        return total;
    }
}
