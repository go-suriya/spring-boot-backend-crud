package com.go.backend_crud.constant;

import org.springframework.http.HttpStatus;

public class Constants {
    public static final boolean RESULT_FALSE = false;
    public static final String STATUS_CODE_INTERNAL_SERVER_ERROR = String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value());
    public static final String MESSAGE_INTERNAL_SERVER_ERROR = HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();
}
