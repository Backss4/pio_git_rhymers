package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int ZERO = 0;
    int totalRejected = ZERO;

    public int reportRejected() {
        return totalRejected;
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

