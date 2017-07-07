package io.blocksabre.ethereum.model;

/**
 * The Ping class is a simple class that returns a response
 * indicating if the site is operational.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.1
 * @since   2017-07-07
 */
public class Ping {

    private String response = "pong";

    public String getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return "Ping{" +
                "response=" + response +
                '}';
    }

}