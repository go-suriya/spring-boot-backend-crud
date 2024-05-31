package com.go.backend_crud.exception;

import com.go.backend_crud.constant.Constants;
import com.go.backend_crud.model.ResponseModel;
import org.springframework.http.HttpStatus;

public class ErrorResponse extends ResponseModel {

    public ErrorResponse(Object data) {
        super(Boolean.FALSE, Constants.STATUS_CODE_INTERNAL_SERVER_ERROR, Constants.MESSAGE_INTERNAL_SERVER_ERROR, data);
    }

    public ErrorResponse(String message) {
        super(Boolean.FALSE, Constants.STATUS_CODE_INTERNAL_SERVER_ERROR, message, null);
    }

    public ErrorResponse(Integer statusCode, String message) {
        super(Boolean.FALSE, statusCode, message, null);
    }

    public ErrorResponse(String message, Object data) {
        super(Boolean.FALSE, Constants.STATUS_CODE_INTERNAL_SERVER_ERROR, message, data);
    }

    public ErrorResponse(Integer statusCode, String message, Object data) {
        super(Boolean.FALSE, statusCode, message, data);
    }
}