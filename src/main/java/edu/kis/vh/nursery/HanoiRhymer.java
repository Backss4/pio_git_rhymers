package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

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

