package io.blocksabre.ethereum.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The PingTest class is a test class that tests Ping.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.3
 * @since   2017-07-07
 */
public class PingTest {

    private Ping testPing;

    /**
     * Sets up objects and mocks external dependencies needed
     * for the tests.
     */
    @Before
    public void setUp() throws Exception {
        testPing = new Ping();
    }

    /**
     * Tests Ping.getResponse()
     */
    @Test
    public void getResponse_Known_Response() throws Exception {
        Assert.assertEquals("getResponse() has failed",
                "pong", testPing.getResponse());
    }

    /**
     * Tests Ping.toString()
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "toString() has failed",
                "Ping{response=pong}", testPing.toString());
    }

}