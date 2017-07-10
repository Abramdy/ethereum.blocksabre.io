package io.blocksabre.ethereum.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The NetworkTest class is a test class
 * that tests Network class.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.1
 * @since   2017-07-10
 */
public class NetworkTest {

    Network network;

    /**
     * Sets up objects needed for the tests.
     */
    @Before
    public void setUp() throws Exception {
        network = Network.ROPSTEN_TESTNET;
    }

    /**
     * Tests AddressRecord.toString()
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "toString() has failed",
                "Ropsten Testnet",
                network.toString());
    }

}