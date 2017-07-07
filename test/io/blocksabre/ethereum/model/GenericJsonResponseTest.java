package io.blocksabre.ethereum.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * The AddressRecordJsonResponseTest class is a test class
 * that tests AddressRecordJsonResponseTest.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.1
 * @since   2017-07-07
 */
public class GenericJsonResponseTest {

    private AddressRecord test1AddressRecord;
    private GenericJsonResponse test1GerericJsonResponse;

    /**
     * Sets up objects needed for the tests.
     */
    @Before
    public void setUp() throws Exception {

        List<AddressRecord> testAddressList = new ArrayList<>();

        test1AddressRecord = new AddressRecord();
        test1GerericJsonResponse = new GenericJsonResponse();

        test1AddressRecord.setAddress("0x063bd9c5e2fdc9da53a8718377c3b82678d3c7c8");
        test1AddressRecord.setBalance(0.203224888);
        test1AddressRecord.setTransactionCount(5);

        testAddressList.add(test1AddressRecord);

        test1GerericJsonResponse.setResult(testAddressList);

    }

    /**
     * Tests GenericJsonResponse.getResult() with a known value
     */
    @Test
    public void getResult() throws Exception {

    }

    /**
     * Tests GenericJsonResponse.setResult() with a known value
     */
    @Test
    public void setResult() throws Exception {

    }

    /**
     * Tests GenericJsonResponse.toString()
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "toString() has failed",
                "GenericJsonResponse{status=0, result=[AddressRecord{address='0x063bd9c5e2fdc9da53a8718377c3b82678d3c7c8', balance=0.203224888, transactionCount=5}], error='null}",
                test1GerericJsonResponse.toString());

    }

}