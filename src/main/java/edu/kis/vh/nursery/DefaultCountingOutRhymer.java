package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    private int total = -1;

    //TODO: wyrzucenie wyjątku kiedy nie ma miejsca
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    //TODO: zmienić nazwę na isEmpty?
    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    //TODO: lepsze byłoby użycie wyjątków zamiast -1
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    //TODO: lepsze byłoby użycie wyjątków zamiast -1
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
