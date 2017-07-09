package io.blocksabre.ethereum.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * The GenericJsonResponseTest class is a test class
 * that tests GenericJsonResponse.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.1
 * @since   2017-07-07
 */
public class GenericJsonResponseTest {

    final private String testAddress = "0x063bd9c5e2fdc9da53a8718377c3b82678d3c7c8";
    final private Double testBalance = 0.203224888;
    final private int testTransactionCount = 5;
    final private int testStatus = 200;
    final private String testError = "Test Error";

    private AddressRecord testAddressRecord;
    private GenericJsonResponse test1GerericJsonResponse;
    private GenericJsonResponse test2GerericJsonResponse;
    private List<AddressRecord> testAddressList = new ArrayList<>();

    /**
     * Sets up objects needed for the tests.
     */
    @Before
    public void setUp() throws Exception {

        testAddressRecord = new AddressRecord();
        test1GerericJsonResponse = new GenericJsonResponse();
        test2GerericJsonResponse = new GenericJsonResponse();

        testAddressRecord.setAddress(testAddress);
        testAddressRecord.setBalance(testBalance);
        testAddressRecord.setTransactionCount(testTransactionCount);

        testAddressList.add(testAddressRecord);

        test1GerericJsonResponse.setResult(testAddressList);
        test1GerericJsonResponse.setStatus(testStatus);

    }

    /**
     * Tests GenericJsonResponse.getResult() with a known value
     */
    @Test
    public void getResult_Known_Result() throws Exception {
        Assert.assertEquals("getResult() has failed",
                test1GerericJsonResponse.getResult(), testAddressList);

    }

    /**
     * Tests GenericJsonResponse.setResult() with a known value
     */
    @Test
    public void setResult_Known_Result() throws Exception {
        test2GerericJsonResponse.setResult(testAddressList);
        Assert.assertEquals("getResult() has failed",
                test2GerericJsonResponse.getResult(), testAddressList);
    }

    /**
     * Tests GenericJsonResponse.getStatus() with a known value
     */
    @Test
    public void getStatus_Known_Status() throws Exception {
        Assert.assertEquals("getStatus() has failed",
                test1GerericJsonResponse.getStatus(), testStatus);

    }

    /**
     * Tests GenericJsonResponse.setStatus() with a known value
     */
    @Test
    public void setStatus_Known_Status() throws Exception {
        test2GerericJsonResponse.setStatus(testStatus);
        Assert.assertEquals("setStatus() has failed",
                test2GerericJsonResponse.getStatus(), testStatus);

    }

    /**
     * Tests GenericJsonResponse.getError() with a known value
     */
    @Test
    public void getError_Known_String() throws Exception {
        Assert.assertNull("getError() has failed",
                test1GerericJsonResponse.getError());

    }

    /**
     * Tests GenericJsonResponse.setError() with a known value
     */
    @Test
    public void setError_Known_String() throws Exception {
        test2GerericJsonResponse.setError(testError);
        Assert.assertEquals("setError() has failed",
                test2GerericJsonResponse.getError(), testError);

    }

    /**
     * Tests GenericJsonResponse.setError_Null_String() with a null value
     */
    @Test(expected = IllegalArgumentException.class)
    public void setError_Null_String() throws Exception {
        test2GerericJsonResponse.setError("");
    }

    /**
     * Tests GenericJsonResponse.toString()
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "toString() has failed",
                "GenericJsonResponse{status=200, result=[AddressRecord{address='0x063bd9c5e2fdc9da53a8718377c3b82678d3c7c8', balance=0.203224888, transactionCount=5}], error='null}",
                test1GerericJsonResponse.toString());

    }

}