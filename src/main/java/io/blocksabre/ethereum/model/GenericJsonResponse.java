package io.blocksabre.ethereum.model;

import java.util.List;

/**
 * The GenericJsonResponse class is a superclass that contains all the common details
 * about an JsonResponse.
 *
 * @author  Andy McCall, andy.mccall@blocksabre.com
 * @version 0.1
 * @since   2017-07-07
 */
public class GenericJsonResponse<T> extends JsonResponse {

    private List<T> result;

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "GenericJsonResponse{" +
                "status=" + super.getStatus() +
                ", result=" + result +
                ", error='" + super.getError() +
                '}';
    }
}
