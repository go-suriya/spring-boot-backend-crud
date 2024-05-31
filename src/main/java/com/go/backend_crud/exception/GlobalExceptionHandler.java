package com.go.backend_crud.exception;

import com.go.backend_crud.model.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ResponseModel> handleResourceNotFoundException(ResourceNotFoundException exception) {
        ResponseModel responseModel = new ResponseModel(
                Boolean.FALSE,
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage(),
                null
        );
        return new ResponseEntity<>(responseModel, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseModel> handleGlobalException(Exception exception) {
        ResponseModel responseModel = new ResponseModel(
                Boolean.FALSE,
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                exception.getMessage(),
                null
        );
        return new ResponseEntity<>(responseModel, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
