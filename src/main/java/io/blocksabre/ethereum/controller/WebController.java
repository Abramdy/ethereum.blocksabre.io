package io.blocksabre.ethereum.controller;

import io.blocksabre.ethereum.dao.EthereumNetworkDAOImpl;
import io.blocksabre.ethereum.model.JsonNetworkResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * The WebController is the controller where the website is
 * called from.
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-07-07
 */
@Controller
@RequestMapping("/")
public class WebController {

    private static final Logger logger =
            LoggerFactory.getLogger(WebController.class);

    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public String address() {
        return "index";
    }

    @RequestMapping(value = {"address"}, method = RequestMethod.GET)
    public String index() {

        return "address";
    }

    @RequestMapping(value = {"ping"}, method = RequestMethod.GET)
    public String ping() {

        return "ping";
    }


}
