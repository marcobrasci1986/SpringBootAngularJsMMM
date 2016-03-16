package be.ordina.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by MaBa on 16/03/16.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomException extends RuntimeException {

    public CustomException() {
        super("This is a custom exception");
    }
}
