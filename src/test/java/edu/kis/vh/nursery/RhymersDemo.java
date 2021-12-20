package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static final int ONE = 1;
    public static final int ZERO = 0;
    public static final int MAX_I = 15;
    public static final int MAX_J = 3;
    public static final String REJECT_CAPTION = "total rejected is ";

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();

        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = ONE; i < MAX_I; i++)
            for (int j = ZERO; j < MAX_J; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = ONE; i < MAX_I; i++)
            rhymers[3].countIn(rn.nextInt(20));

        for (int i = ZERO; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println(REJECT_CAPTION
                + ((HanoiRhymer) rhymers[3]).reportRejected());

    }

}