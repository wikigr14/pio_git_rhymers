package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int TAB_SIZE = 12;

    private int[] NUMBERS = new int[TAB_SIZE];

    private final int ERROR_VALUE = -1;

    private final int FULL_TOTAL = 11;

    private final int CHECK_TOTAL = -1;

    public int total = CHECK_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == CHECK_TOTAL;
    }

    public boolean isFull() {
        return total == FULL_TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return NUMBERS[total--];
    }

}
