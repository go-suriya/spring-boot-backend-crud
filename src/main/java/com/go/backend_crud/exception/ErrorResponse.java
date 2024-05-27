package com.go.backend_crud.exception;

import com.go.backend_crud.model.ResponseModel;
import org.springframework.http.HttpStatus;

public class ErrorResponse extends ResponseModel {

    private static final boolean DEFAULT_RESULT = false;
    private static final String DEFAULT_STATUS_CODE = String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value());
    private static final String DEFAULT_MESSAGE = HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();

    public ErrorResponse(Object data) {
        super(DEFAULT_RESULT, DEFAULT_STATUS_CODE, DEFAULT_MESSAGE, data);
    }

    public ErrorResponse(String message) {
        super(DEFAULT_RESULT, DEFAULT_STATUS_CODE, message, null);
    }

    public ErrorResponse(String statusCode, String message) {
        super(DEFAULT_RESULT, statusCode, message, null);
    }

    public ErrorResponse(String message, Object data) {
        super(DEFAULT_RESULT, DEFAULT_STATUS_CODE, message, data);
    }

    public ErrorResponse(String statusCode, String message, Object data) {
        super(DEFAULT_RESULT, statusCode, message, data);
    }
}