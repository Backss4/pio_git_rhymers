package edu.kis.vh.nursery;

import edu.kis.vh.nursery.int_counting_structures.IIntCoutingStructure;
import edu.kis.vh.nursery.int_counting_structures.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IIntCoutingStructure temp = new IntArrayStack();

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(IIntCoutingStructure dataContainer) {
        super(dataContainer);
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}