package edu.kis.vh.nursery;

import edu.kis.vh.nursery.int_counting_structures.IIntCoutingStructure;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(IIntCoutingStructure dataContainer) {
        super(dataContainer);
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

// alt + ← - zmiana pliku w lewo od bieżącego pliku
// alt + → - zmiana pliku w lewo od bieżącego pliku
// IDE wybiera plik z aktualnych otwartych i widocznych na pasku.

