package io.blocksabre.ethereum.model;

/**
 * Created by Andy McCall on 10/07/2017.
 */
public class JsonGeth {

        private String jsonrpc;
        private String method;
        private String params;
        private int id;

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "JsonGeth{" +
                "jsonrpc='" + jsonrpc + '\'' +
                ", method='" + method + '\'' +
                ", params='" + params + '\'' +
                ", id=" + id +
                '}';
    }
}
