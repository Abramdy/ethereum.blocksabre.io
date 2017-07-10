package io.blocksabre.ethereum.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The JsonNetworkResponse class that is used to obtain
 * infomation about the Ethereum network.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.1
 * @since   2017-07-10
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonNetworkResponse
{
    private String id;
    private String result;
    private String jsonrpc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    @Override
    public String toString() {
        return "JsonNetworkResponse{" +
                "id='" + id + '\'' +
                ", result='" + result + '\'' +
                ", jsonrpc='" + jsonrpc + '\'' +
                '}';
    }
}