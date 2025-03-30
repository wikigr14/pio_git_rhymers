package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_CAPACITY = 12;
    private final int[] NUMBERS = new int[STACK_CAPACITY];
    private static final int RETURN_VALUE = -1;

    private static final int FULL_TOTAL = 11;

    private static final int CHECK_TOTAL = -1;

    public int getTotal() {
        return total;
    }

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == CHECK_TOTAL;
    }

    protected boolean isFull() {
        return total == FULL_TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return NUMBERS[total--];
    }

}
