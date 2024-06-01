package com.go.backend_crud.model;

import com.go.backend_crud.constant.Constants;

public class SuccessResponse extends ResponseModel {

    public SuccessResponse(Object data) {
        super(Boolean.TRUE, 200, Constants.MESSAGE_OK, data);
    }

    public SuccessResponse(String message) {
        super(Boolean.TRUE, 200, message, null);
    }

    public SuccessResponse(Integer statusCode, String message) {
        super(Boolean.TRUE, statusCode, message, null);
    }

    public SuccessResponse(String message, Object data) {
        super(Boolean.TRUE, 200, message, data);
    }

    public SuccessResponse(Integer statusCode, String message, Object data) {
        super(Boolean.TRUE, statusCode, message, data);
    }
}