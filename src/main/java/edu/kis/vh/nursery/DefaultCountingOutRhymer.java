package edu.kis.vh.nursery;

import edu.kis.vh.nursery.int_counting_structures.IIntCoutingStructure;
import edu.kis.vh.nursery.int_counting_structures.IntArrayStack;

public class DefaultCountingOutRhymer {
    private final IIntCoutingStructure dataContainer;

    public DefaultCountingOutRhymer(IIntCoutingStructure dataContainer) {
        this.dataContainer = dataContainer;
    }

    public DefaultCountingOutRhymer() {
        this(new IntArrayStack());
    }

    //TODO: wyrzucenie wyjątku kiedy nie ma miejsca
    public void countIn(int in) {
        dataContainer.countIn(in);
    }

    //TODO: zmienić nazwę na isEmpty?
    public boolean callCheck() {
        return dataContainer.callCheck();
    }

    public boolean isFull() {
        return dataContainer.isFull();
    }

    //TODO: lepsze byłoby użycie wyjątków zamiast -1
    protected int peekaboo() {
        return dataContainer.peekaboo();
    }

    //TODO: lepsze byłoby użycie wyjątków zamiast -1
    public int countOut() {
        return dataContainer.countOut();
    }

    public int getTotal() {
        return dataContainer.getTotal();
    }
}
