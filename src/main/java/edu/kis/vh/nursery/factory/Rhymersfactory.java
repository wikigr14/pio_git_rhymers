package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

// TODO: Consider adding documentation to the methods for better clarity and understanding

public interface Rhymersfactory {

    public DefaultCountingOutRhymer GetStandardRhymer();

    public DefaultCountingOutRhymer GetFalseRhymer();

    public DefaultCountingOutRhymer GetFIFORhymer();

    public DefaultCountingOutRhymer GetHanoiRhymer();

}
