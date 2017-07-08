package io.blocksabre.ethereum.model;

/**
 * The PingJsonResponse class is the Json formatted Ping
 * indicating if the site is operational.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.1
 * @since   2017-07-07
 */
public class PingJsonResponse extends JsonResponse {

    private Ping result;

    public Ping getResult() {
        return result;
    }

    public void setResult(Ping result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "PingJsonResponse{" +
                "status=" + super.getStatus() +
                ", result='" + result + '\'' +
                ", error='" + super.getError() +
                '}';
    }
}
