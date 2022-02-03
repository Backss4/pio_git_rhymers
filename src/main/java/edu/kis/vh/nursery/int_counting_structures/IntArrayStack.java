package edu.kis.vh.nursery.int_counting_structures;

public class IntArrayStack implements IIntCoutingStructure {
    private static final int INITIAL_VALUE = -1;
    private static final int MAX_SIZE = 12;

    private final int[] numbers = new int[MAX_SIZE];
    private int total = INITIAL_VALUE;

    public IntArrayStack() {
    }

    //TODO: wyrzucenie wyjątku kiedy nie ma miejsca
    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    //TODO: zmienić nazwę na isEmpty?
    @Override
    public boolean callCheck() {
        return total == INITIAL_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    //TODO: lepsze byłoby użycie wyjątków zamiast -1
    @Override
    public int peekaboo() {
        if (callCheck())
            return FAILURE_VALUE;
        return numbers[total];
    }

    //TODO: lepsze byłoby użycie wyjątków zamiast -1
    @Override
    public int countOut() {
        if (callCheck())
            return FAILURE_VALUE;
        return numbers[total--];
    }

    @Override
    public int getTotal() {
        return total;
    }
}