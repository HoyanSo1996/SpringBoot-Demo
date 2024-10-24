package com.omega.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Class AccessException
 *
 * @author KennySo
 * @date 2024/10/16
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class AccessException extends RuntimeException {

    public AccessException() {
    }

    public AccessException(String message) {
        super(message);
    }
}
