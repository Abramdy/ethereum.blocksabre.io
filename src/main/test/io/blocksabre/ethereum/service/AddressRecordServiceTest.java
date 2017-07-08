package io.blocksabre.ethereum.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The AddressRecordServiceTest class is a test class that
 * tests AddressRecordService class.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.2
 * @since   2017-07-07
 */
public class AddressRecordServiceTest {

    private AddressRecordService testAddressRecordService;

    /**
     * Sets up objects and mocks external dependencies needed
     * for the tests.
     */
    @Before
    public void setUp() throws Exception {
        testAddressRecordService = new AddressRecordService();
    }

    /**
     * Tests AddressRecordService.toString()
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "toString() has failed",
                "AddressRecordService{}", testAddressRecordService.toString());
    }

}