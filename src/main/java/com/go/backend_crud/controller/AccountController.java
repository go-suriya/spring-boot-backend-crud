package com.go.backend_crud.controller;

import com.go.backend_crud.constant.Constants;
import com.go.backend_crud.exception.SuccessResponse;
import com.go.backend_crud.model.ResponseModel;
import com.go.backend_crud.model.auth.dto.RegisterDto;
import com.go.backend_crud.service.AccountService;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public ResponseEntity<ResponseModel> register(@RequestBody RegisterDto registerDto) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new SuccessResponse(HttpStatus.CREATED.value(), Constants.MESSAGE_201, accountService.createAccount(registerDto)));
    }
}
