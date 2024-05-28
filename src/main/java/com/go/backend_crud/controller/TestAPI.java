package com.go.backend_crud.controller;

import com.go.backend_crud.exception.ErrorResponse;
import com.go.backend_crud.exception.SuccessResponse;
import com.go.backend_crud.model.ResponseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/v1")
public class TestAPI {

    @GetMapping(value = "/test")
    public ResponseEntity<ResponseModel> TestAPI() {
        try {
            Map<String, Object> constants = new HashMap<>();
            constants.put("profile_type", "Go");

            return ResponseEntity.ok(new SuccessResponse("Success", constants));
        } catch (Exception e) {
            System.out.println("dsdsd");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()));
        }
    }
}
