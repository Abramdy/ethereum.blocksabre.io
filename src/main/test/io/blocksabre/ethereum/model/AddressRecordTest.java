package io.blocksabre.ethereum.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The AddressRecordTest class is a test class
 * that tests AddressRecord.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.1
 * @since   2017-07-07
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
    public void getAddress_Known_Address() throws Exception {
        Assert.assertEquals("getAddress() has failed",
                testAddressRecord.getAddress(), testAddress);
    }

    /**
     * Tests AddressRecord.setAddress() with a known value
     */
    @Test
    public void setAddress_Known_Address() throws Exception {
        testAddressRecord.setAddress(testAddress);
        Assert.assertEquals("setResult() has failed",
                testAddressRecord.getAddress(), testAddress);
    }

    /**
     * Tests AddressRecord.getBalance() with a known value
     */
    @Test
    public void getBalance_Known_Balance() throws Exception {
        Assert.assertEquals("getBalance() has failed",
                testAddressRecord.getBalance(), testBalance);
    }

    /**
     * Tests AddressRecord.setBalance() with a known value
     */
    @Test
    public void setBalance_Known_Balance() throws Exception {
        testAddressRecord.setBalance(testBalance);
        Assert.assertEquals("setBalance() has failed",
                testAddressRecord.getBalance(), testBalance);
    }

    /**
     * Tests AddressRecord.getTransactionCount() with a known value
     */
    @Test
    public void getTransactionCount_Known_Count() throws Exception {
        Assert.assertEquals("getTransactionCount() has failed",
                testAddressRecord.getTransactionCount(), testTransactionCount);
    }

    /**
     * Tests AddressRecord.setBalance() with a known value
     */
    @Test
    public void setTransactionCount_Known_Count() throws Exception {
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