package io.blocksabre.ethereum.dao;

import io.blocksabre.ethereum.model.JsonGeth;
import io.blocksabre.ethereum.model.JsonNetworkResponse;
import io.blocksabre.ethereum.model.Network;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * The EthereumNetworkDAOImpl class is the implementation of
 * the AuthoritiesDAO.
 *
 * @author Andy McCall
 * @version 0.2
 * @since 2017-07-10
 */
public class EthereumNetworkDAOImpl extends BaseDAO implements EthereumNetworkDAO {

    private static final Logger logger =
            LoggerFactory.getLogger(EthereumNetworkDAOImpl.class);

    public JsonNetworkResponse getBlock() {

        try {

            logger.info("Obtaining authority information");


            JsonGeth request = new JsonGeth();
            request.setJsonrpc("2.0");
            request.setMethod("eth_blockNumber");
            request.setId(83);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> entity = new HttpEntity<String>(request.toString(), headers);

            RestTemplate restTemplate = new RestTemplate();
            JsonNetworkResponse networkResponse = restTemplate.postForObject("http://localhost:8545", request, JsonNetworkResponse.class);

            return networkResponse;

        } catch (HttpClientErrorException e) {

            String errorMessage = "Error obtaining network information";

            logger.error(errorMessage, e.getCause());
            throw new RuntimeException(errorMessage, e.getCause());

        }

    }

}
