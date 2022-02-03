package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.int_counting_structures.IntArrayStack;
import edu.kis.vh.nursery.int_counting_structures.IntLinkedList;
import edu.kis.vh.nursery.int_counting_structures.IntLinkedListAdapter;

public class ListRhymerFactory implements RhymersFactory {
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer(new IntLinkedListAdapter(new IntLinkedList()));
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer(new IntLinkedListAdapter(new IntLinkedList()));
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer(new IntLinkedListAdapter(new IntLinkedList()));
    }
}
