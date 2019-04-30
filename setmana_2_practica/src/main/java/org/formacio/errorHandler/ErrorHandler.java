package org.formacio.errorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "ID not in database")
public class ErrorHandler extends RuntimeException {

    @ExceptionHandler(Exception.class)
    public void error() {
    }
}