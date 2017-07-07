package io.blocksabre.ethereum.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andy McCall on 08/07/2017.
 */
public class AddressRecordTest {

    final private String testAddress = "0x063bd9c5e2fdc9da53a8718377c3b82678d3c7c8";
    final private Double testBalance = 0.203224888;
    final private int testTransactionCount = 5;

    private AddressRecord testAddressRecord;

    /**
     * Sets up objects and mocks external dependencies needed
     * for the tests.
     */
    @Before
    public void setUp() throws Exception {

        testAddressRecord = new AddressRecord();

        testAddressRecord.setAddress(testAddress);
        testAddressRecord.setBalance(testBalance);
        testAddressRecord.setTransactionCount(testTransactionCount);

    }

    /**
     * Tests AddressRecord.getAddress() with a known value
     */
    @Test
    public void getAddress() throws Exception {
        Assert.assertEquals("getAddress() has failed",
                testAddressRecord.getAddress(), testAddress);
    }

    /**
     * Tests AddressRecord.setAddress() with a known value
     */
    @Test
    public void setAddress() throws Exception {
        testAddressRecord.setAddress(testAddress);
        Assert.assertEquals("setResult() has failed",
                testAddressRecord.getAddress(), testAddress);
    }

    /**
     * Tests AddressRecord.getBalance() with a known value
     */
    @Test
    public void getBalance() throws Exception {
        Assert.assertEquals("getBalance() has failed",
                testAddressRecord.getBalance(), testBalance);
    }

    /**
     * Tests AddressRecord.setBalance() with a known value
     */
    @Test
    public void setBalance() throws Exception {
        testAddressRecord.setBalance(testBalance);
        Assert.assertEquals("setBalance() has failed",
                testAddressRecord.getBalance(), testBalance);
    }

    /**
     * Tests AddressRecord.getTransactionCount() with a known value
     */
    @Test
    public void getTransactionCount() throws Exception {
        Assert.assertEquals("getTransactionCount() has failed",
                testAddressRecord.getTransactionCount(), testTransactionCount);
    }

    /**
     * Tests AddressRecord.setBalance() with a known value
     */
    @Test
    public void setTransactionCount() throws Exception {
        testAddressRecord.setTransactionCount(testTransactionCount);
        Assert.assertEquals("setTransactionCount() has failed",
                testAddressRecord.getTransactionCount(), testTransactionCount);
    }

    /**
     * Tests AddressRecord.toString()
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "toString() has failed",
                "AddressRecord{address='0x063bd9c5e2fdc9da53a8718377c3b82678d3c7c8', balance=0.203224888, transactionCount=5}", testAddressRecord.toString());
    }

}