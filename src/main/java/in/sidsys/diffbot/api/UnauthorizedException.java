package in.sidsys.diffbot.api;

import org.apache.http.client.ClientProtocolException;

public class UnauthorizedException extends ClientProtocolException {

    public UnauthorizedException(String message) {
        super(message);
    }
}
