package com.go.backend_crud.exception;

import com.go.backend_crud.model.ResponseModel;
import org.springframework.http.HttpStatus;

public class SuccessResponse extends ResponseModel {

    private static final boolean DEFAULT_RESULT = true;
    private static final String DEFAULT_STATUS_CODE = String.valueOf(HttpStatus.OK.value());
    private static final String DEFAULT_MESSAGE = "Success";

    public SuccessResponse(Object data) {
        super(DEFAULT_RESULT, DEFAULT_STATUS_CODE, DEFAULT_MESSAGE, data);
    }

    public SuccessResponse(String message) {
        super(DEFAULT_RESULT, DEFAULT_STATUS_CODE, message, null);
    }

    public SuccessResponse(String statusCode, String message) {
        super(DEFAULT_RESULT, statusCode, message, null);
    }

    public SuccessResponse(String message, Object data) {
        super(DEFAULT_RESULT, DEFAULT_STATUS_CODE, message, data);
    }

    public SuccessResponse(String statusCode, String message, Object data) {
        super(DEFAULT_RESULT, statusCode, message, data);
    }
}