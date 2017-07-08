package io.blocksabre.ethereum.controller;

import io.blocksabre.ethereum.model.AddressRecord;
import io.blocksabre.ethereum.model.GenericJsonResponse;
import io.blocksabre.ethereum.model.Ping;
import io.blocksabre.ethereum.model.PingJsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The RESTController is the controller where all the APIs are
 * called from.
 *
 * @author  Andy McCall
 * @version 0.2
 * @since   2017-07-07
 */
@RestController
@RequestMapping("/api/")
public class RESTController {

    private static final Logger logger =
            LoggerFactory.getLogger(RESTController.class);

    /**
     * Gets the PingJsonResponse for the controller.
     * @return AddressRecordJsonResponse.
     */
    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
    public @ResponseBody
    PingJsonResponse getPing() {
        logger.debug("Entering getPing()");

        Ping ping = new Ping();

        PingJsonResponse pingJsonResponse = new PingJsonResponse();
        pingJsonResponse.setResult(ping);

        pingJsonResponse.setStatus(200);

        logger.debug("Exiting getPing()");
        return (pingJsonResponse);
    }

    /**
     * Gets the AddressRecordJsonResponse for a Stratis address.
     * @param address containing an Ethereum address to query.
     * @return AddressRecordJsonResponse.
     */
    @RequestMapping(value = "/address/{address}", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
    public @ResponseBody
    GenericJsonResponse getAddress(@PathVariable String address) {
        logger.debug("Entering getAddress()");

        GenericJsonResponse<AddressRecord> genericJsonResponse = new GenericJsonResponse<>();

        List<AddressRecord> thisList = new ArrayList<AddressRecord>();
        AddressRecord thisAddressRecord = new AddressRecord();

        thisAddressRecord.setAddress(address);
        thisAddressRecord.setBalance(0.203224888);
        thisAddressRecord.setTransactionCount(5);
        thisList.add(thisAddressRecord);

        genericJsonResponse.setResult(thisList);
        genericJsonResponse.setStatus(200);

        logger.debug("Exiting getAddress()");
        return genericJsonResponse;

    }

}
