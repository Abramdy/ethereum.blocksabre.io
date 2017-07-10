package io.blocksabre.ethereum.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;

/**
 * BaseDAO
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-07-10
 */
public class BaseDAO {

    @Value("${url.protocol}")
    private String urlProtocol;

    @Value("${url.base}")
    private String urlBase;

    @Value("${jsonrpc.version}")
    private String jsonRpcVersion;

    private HttpHeaders httpHeaders;

    public String getJsonRpcVersion() {
        return jsonRpcVersion;
    }

    public String getUrlProtocol () {
        return urlProtocol;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public HttpHeaders getHttpHeaders() {

        httpHeaders = new HttpHeaders();

        return httpHeaders;
    }

    @Override
    public String toString() {
        return "BaseDAO{" +
                "urlProtocol='" + urlProtocol + '\'' +
                ", urlBase='" + urlBase + '\'' +
                ", jsonRpcVersion='" + jsonRpcVersion + '\'' +
                '}';
    }

}
