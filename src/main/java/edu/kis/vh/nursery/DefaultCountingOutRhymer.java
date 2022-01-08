package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int INITIAL_VALUE = -1;
    private static final int FAILURE = -1;
    public static final int MAX_SIZE = 12;

    private final int[] numbers = new int[SIZE];
    private int total = INITIAL_VALUE;

    //TODO: wyrzucenie wyjątku kiedy nie ma miejsca
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    //TODO: zmienić nazwę na isEmpty?
    public boolean callCheck() {
        return total == INITIAL_VALUE;
    }

    public boolean isFull() {
        return total == (MAX_SIZE - 1);
    }

    //TODO: lepsze byłoby użycie wyjątków zamiast -1
    protected int peekaboo() {
        if (callCheck())
            return FAILURE;
        return numbers[total];
    }

    //TODO: lepsze byłoby użycie wyjątków zamiast -1
    public int countOut() {
        if (callCheck())
            return FAILURE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
