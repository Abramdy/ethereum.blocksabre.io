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

    /**
     * Tests AddressRecord.toString()
     */
    @Test
    public void Network_Constructor_Passes() {
        Network network = Network.ETHEREUM_MAINNET;
        Assert.assertEquals( "Network() has failed",
                "Ethereum Mainnet", network.toString());
    }

    /**
     * Tests AddressRecord.toString()
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {

        Network network;

        network = Network.ETHEREUM_MAINNET;
        Assert.assertEquals( "toString() has failed",
                "Ethereum Mainnet", network.toString());

        network = Network.MORDEN_TESTNET;
        Assert.assertEquals( "toString() has failed",
                "Morden Testnet", network.toString());

        network = Network.ROPSTEN_TESTNET;
        Assert.assertEquals( "toString() has failed",
                "Ropsten Testnet",network.toString());

        network = Network.RINKEBY_TESTNET;
        Assert.assertEquals( "toString() has failed",
                "Rinkeby Testnet",network.toString());

        network = Network.KOVAN_TESTNET;
        Assert.assertEquals( "toString() has failed",
                "Kovan Testnet",network.toString());

    }

}