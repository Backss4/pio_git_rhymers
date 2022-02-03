package edu.kis.vh.nursery.int_counting_structures;

public interface IIntCoutingStructure {
    static final int FAILURE_VALUE = 0;
    public void countIn(int in);

    public boolean callCheck();

    public boolean isFull();

    public int peekaboo();

    public int countOut();

    public int getTotal();
}
